package com.mcnz; 
import org.apache.log4j.Logger;

/**
 * The Square class represents 
 * a four sided, 2D shape
 * @author Cameron McKenzie
 * @version 1.0.2
 * @since 2018-03-01
 */
public class Square {
	
	static Logger log = Logger.getLogger(Square.class);
	
	int height;
	public Square(){}
	public Square(int h) {
		//if (h<0){h=0;}
		height = h;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth() {
		return height; 
	}
	/**
	Calculates the area of the Square
	@return a positive int for the area
	*/
	public int getArea() {
		log.info("getting the area");
		return height*height;
	}
}
 




