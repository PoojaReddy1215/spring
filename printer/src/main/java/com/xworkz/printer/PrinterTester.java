package com.xworkz.printer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PrinterTester {
	
	public static void main(String[] args) {
		
		String springConfig = "PrinterThings.xml";

		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfig);
		System.out.println("Spring Container Created:" + springContainer.hashCode());

		Printer printer = springContainer.getBean(Printer.class);
		
		Catagory catagory = springContainer.getBean(Catagory.class);
		System.out.println(catagory);
	}
}
