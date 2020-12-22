package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.util.CodeUtil;
import com.app.util.CommonUtil;
@Controller
public class UserController {

	@Autowired
	private IUserService service;
	@Autowired
	private CodeUtil codeutil;
	@Autowired
	private CommonUtil commonutil; 
	
		@RequestMapping("/showLogin")
		public String showLoginPage(){
			return "Login";
		} 
	@RequestMapping("/userReg")
	public String showUserReg(){
		return "UserReg";
	}
	
	//2. save data
	@RequestMapping(value="/userInsert",method=RequestMethod.POST)
	public String saveUser(
			//1. read model attribute
			@ModelAttribute("user")User u,ModelMap map){
		//2. generate password
		String pwd=codeutil.genPwd();
		//3. set password to model object
		u.setUserPwd(pwd);
		
		//4. save user
		int userId=service.saveUser(u);
		//5. send email
		String text="welcome to User!! "+
		 ", your id:"+u.getUserEmail()+" (or) "+u.getUserContact()
		 +" , password is : "+u.getUserPwd();
		
		commonutil.sendEmail(u.getUserEmail(), "User", text);
		//6. send message to Ui
		map.addAttribute("message", "User '"+userId+"' created ");
		return "UserReg";
	}

	// User Login 
	@RequestMapping(value="/login",method=RequestMethod.POST)
		public String LoginUser(@RequestParam("userName")String un,@RequestParam("password")String pwd,ModelMap map,HttpServletRequest req){
			String page="";
			User user=service.getUserByNameAndPwd(un, pwd);
			
				if(user==null){
					map.addAttribute("message","User Name and Password Invalid..!");
					page="Login";
				}
				else{
					HttpSession ses=req.getSession();
					ses.setAttribute("un", user.getUserName());
					page="LocationReg";
				}
			return page;
		}
	// USer Logout
	@RequestMapping("/logout")
	public String userLogout(ModelMap map,HttpServletRequest req){
			HttpSession ses=req.getSession(false);
			ses.setAttribute("un",null);
			ses.invalidate();
			map.addAttribute("message","Your Logout Sucessfuly");
		return "Login";
	}
}
