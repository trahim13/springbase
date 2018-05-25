package org.trahim.spring.cglib.impl;

import org.springframework.beans.factory.support.MethodReplacer;
import org.trahim.spring.impls.robot.ModelT1000;
import org.trahim.spring.interfaces.Robot;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("New Action");
        ModelT1000 t1000 = (ModelT1000) o;
        t1000.setColor("New black color.");
        System.out.println(t1000.getColor());
        return t1000;
    }
}
