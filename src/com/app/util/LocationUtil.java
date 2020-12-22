package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class LocationUtil {

	public void generatePie(String path,List<Object[]> list){
		
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:list){
			dataset.setValue(ob[0].toString(),new Double(ob[1].toString()));
		}
		
		JFreeChart chart=ChartFactory.createPieChart3D("Location Report",dataset,true,true,false);
		
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/LocapieA.jpg"),chart,280,280);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
public void generateBarChart(String path,List<Object[]> list){
		
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[] ob:list){
			dataset.setValue(new Double(ob[1].toString()),ob[0].toString(),"");
		}
		
		JFreeChart chart=ChartFactory.createBarChart3D("Location Report","Location Type","COUNT",dataset);
		
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/LocapieB.jpg"),chart,300,300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






