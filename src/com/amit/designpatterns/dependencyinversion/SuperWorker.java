package com.amit.designpatterns.dependencyinversion;

public class SuperWorker extends Worker{

	public SuperWorker(){
		type = "SuperWorker";
	}

	@Override
	public void work() {
		System.out.println(" " + this);		
	}
	
	
	
}
