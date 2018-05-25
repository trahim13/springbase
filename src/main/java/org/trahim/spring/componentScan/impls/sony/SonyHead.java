package org.trahim.spring.componentScan.impls.sony;


import org.springframework.stereotype.Component;
import org.trahim.spring.componentScan.interfaces.Head;

@Component
public class SonyHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Sony...");
	}

}
