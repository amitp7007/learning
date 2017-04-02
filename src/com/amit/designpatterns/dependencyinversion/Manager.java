package com.amit.designpatterns.dependencyinversion;

public class Manager {

	Worker worker;
	public void setWorker(Worker worker){
		this.worker = worker;	
	}
	public void manage(){
		this.worker.work();
	}
	
}
