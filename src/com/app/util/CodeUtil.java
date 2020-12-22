package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;
@Component
public class CodeUtil {

	public String genCommonStr(int len){
		return UUID.randomUUID().toString().replaceAll("-","").substring(0,len);
	}
	
	public String genPwd(){
		return genCommonStr(8);
	}
	public String genTocken(){
		return genCommonStr(6);
	}
}
