package org.trahim.spring.collections.impl;

import org.trahim.spring.interfaces.Robot;

import java.util.Map;

public class RobotMapPool {
    Map<String, Robot> map;

    public RobotMapPool(Map<String, Robot> map) {
        this.map = map;
    }

    public Map<String, Robot> getMap() {
        return map;
    }
}
