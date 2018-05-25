package org.trahim.spring.componentScan.impls.sony;


import org.springframework.stereotype.Component;
import org.trahim.spring.componentScan.interfaces.Hand;

@Component
public class SonyHand implements Hand {

	public void catchSomething() {
		System.out.println("Catched from Sony!!");
	}

}
