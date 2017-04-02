package com.amit.designpatterns.dependencyinversion;

public abstract class Worker {
	String type;
	public abstract void work();
	
	@Override
	public String toString(){
		return "Worker Type - > "+ this.type;
	}
}
