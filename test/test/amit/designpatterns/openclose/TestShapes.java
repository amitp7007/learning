package test.amit.designpatterns.openclose;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amit.designpatterns.openclose.Circle;
import com.amit.designpatterns.openclose.Rectangle;
import com.amit.designpatterns.openclose.ShapeMaker;
import com.amit.designpatterns.openclose.Triangle;

public class TestShapes {

	ShapeMaker shm = new ShapeMaker();
	
	@Test
	public void testRectangle() throws Exception{
		assertEquals(true, "Drawing Rectangle".equals((String)shm.makeShape(new Rectangle())));
	}
	@Test
	public void testCircle() throws Exception{		
		assertEquals(true, "Drawing Circle".equals((String)shm.makeShape(new Circle())));
	}
	
	@Test
	public void testTriangle() throws Exception{		
		assertEquals(true, "Drawing Triangle".equals((String)shm.makeShape(new Triangle<String>())));
	}

	
}
