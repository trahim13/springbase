package org.trahim.spring.componentScan.impls.sony;


import org.springframework.stereotype.Component;
import org.trahim.spring.componentScan.interfaces.Leg;

@Component
public class SonyLeg implements Leg {

    public void go() {
        System.out.println("Go to Sony!");
    }

}
