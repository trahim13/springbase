package org.trahim.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.trahim.spring.impls.robot.ModelT1000;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//		ModelT1000 t1002 = (ModelT1000) context.getBean("t1000");
////		t1000.action();
//
//
//		ModelT1000 t1000P = (ModelT1000) context.getBean("t1000P");
////		t1000P.action();
//
//		System.out.println(t1000);
//		System.out.println(t1002);


	}
}
