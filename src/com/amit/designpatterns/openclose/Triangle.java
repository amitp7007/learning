package com.amit.designpatterns.openclose;

public class Triangle<T> implements Shape<T>{

	@Override
	public T draw() {
		// TODO Auto-generated method stub
		return (T)"Drawing Triangle";
	}

}
