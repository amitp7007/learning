package com.amit.designpatterns.dependencyinversion;

public class NormalWorker extends Worker{

	public NormalWorker(){
		type = "NormalWorker";
	}
	@Override
	public void work() {
		System.out.println("Working for Normal :  " + this);
		
	}
	

}
