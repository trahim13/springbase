package org.trahim.spring.collections.impl;

import org.trahim.spring.collections.interfaces.RobotPool;
import org.trahim.spring.impls.robot.ModelT1000;
import org.trahim.spring.interfaces.Robot;

import java.util.Collection;

public class RobotT1000Pool implements RobotPool {
    Collection<Robot> robots;

    @Override
    public Collection<Robot> getRobotCollection() {
        return robots;
    }


    public void setRobots(Collection<Robot> robots) {


        this.robots = robots;
    }

    public void action() {
        robots.forEach(Robot::action);
    }

}
