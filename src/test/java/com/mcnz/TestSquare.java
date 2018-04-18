package com.mcnz; 

import org.junit.Assert;
import org.junit.Test;
import com.mcnz.Square; 

public class TestSquare {

	@Test
	public void testDefaultConstructor() {
		Square square = new Square();
		Assert.assertEquals(0, square.getHeight());
		Assert.assertEquals(0, square.getWidth());
		//Assert.fail("Forcing a test failure for no reason.");

	}
	
	@Test
	public void testNonDefaultConstructor() {
		Square square = new Square(10);
		//Square square = new Square(-10);
		int height = square.getHeight(); 
		Assert.assertEquals(square.getWidth(), height);
		if (height<0){Assert.fail("No negatives.");} 
	}
	
	@Test
	public void testGetArea() {
		Square square = new Square(10);
		int area = square.getArea();
		Assert.assertEquals(100, area);
	}
	
	@Test
	public void testGetAreaAgain() {
		Square square = new Square(10);
		int area = square.getArea();
		Assert.assertEquals(100, square.getArea());
	}
	
	@Test
	public void testGetWidth() {
		Square square = new Square(10);
		Assert.assertEquals(square.getHeight(), square.getWidth());
	}
}
