package com.amit.designpatterns.openclose;

public class ShapeMaker {
 public Object makeShape(Shape obj) throws Exception{
	 if(obj == null)
		 throw new Exception();
	 return obj.draw();
 }
}
