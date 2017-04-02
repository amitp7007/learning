package com.amit.designpatterns.dependencyinversion;

public class Main {
	public static void main(String [] a)
	{
		Manager man = new Manager();
		man.setWorker(new NormalWorker());
		man.manage();
		//man = new Manager();
		man.setWorker(new SuperWorker());
		man.manage();
	}
}
