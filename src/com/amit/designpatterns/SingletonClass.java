package com.amit.designpatterns;

public class SingletonClass {
	private static SingletonClass  object = null;
	
	private SingletonClass(){
		
	}
	public static SingletonClass getInstance(){
		if(object == null){
			synchronized (SingletonClass.class) {
				if(object == null){
					object = new SingletonClass();
				}
			}
		}
		return object;
	}

}
