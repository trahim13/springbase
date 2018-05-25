package org.trahim.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.trahim.spring.collections.impl.RobotMapPool;
import org.trahim.spring.interfaces.Robot;


public class Start {
    public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
//		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//		ModelT1000 t1002 = (ModelT1000) context.getBean("t1000");
////		t1000.action();
//
//
//		ModelT1000 t1000P = (ModelT1000) context.getBean("t1000P");
////		t1000P.action();
//
//		System.out.println(t1000);
//		System.out.println(t1002);

//CGLIB
//		ApplicationContext context = new ClassPathXmlApplicationContext("method-injection.xml");
//		RobotFactory factory = (RobotFactory) context.getBean("robotFactory");
//		Robot robot = factory.createRobot();
//		Robot robot1 = factory.createRobot();
//		Robot robot2 = factory.createRobot();
//
//		System.out.println(robot);
//		System.out.println(robot1);
//		System.out.println(robot2);

        // method replacer

//		ApplicationContext context = new ClassPathXmlApplicationContext("method-injection.xml");
//		Robot robot = (Robot) context.getBean("modelT1000R");
//
//		robot.action();
//COLLECTIONS

//        ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
////		RobotT1000Pool robotT1000Pool = (RobotT1000Pool) context.getBean("robotT1000Pool");
////		robotT1000Pool.action();
//
//        RobotMapPool mapPool = (RobotMapPool) context.getBean("mapPool");
//        Robot robot = mapPool.getMap().get("1");
//        robot.action();

//AUTOWIRE
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Robot robotAuto = (Robot) context.getBean("robotAuto");
        robotAuto.action();
    }
}
