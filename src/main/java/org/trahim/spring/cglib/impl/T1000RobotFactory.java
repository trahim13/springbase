package org.trahim.spring.cglib.impl;

import org.trahim.spring.cglib.interfaces.RobotFactory;
import org.trahim.spring.interfaces.Robot;

public abstract class T1000RobotFactory implements RobotFactory {
    @Override
    public abstract Robot createRobot();
}
