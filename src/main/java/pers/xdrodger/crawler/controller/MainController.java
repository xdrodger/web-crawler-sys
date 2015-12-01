package pers.xdrodger.crawler.controller;

import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class MainController {

	private static Logger logger = Logger.getLogger(MainController.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		URL url = ClassLoader.getSystemResource("log4j.properties");
//		url.getPath();
//		Properties log4
		// my test
		// 
		
		//sdf
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
		logger.info("test");
	}

}
