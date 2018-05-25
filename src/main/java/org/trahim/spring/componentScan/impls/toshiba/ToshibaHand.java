package org.trahim.spring.componentScan.impls.toshiba;


import org.trahim.spring.componentScan.interfaces.Hand;

public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
