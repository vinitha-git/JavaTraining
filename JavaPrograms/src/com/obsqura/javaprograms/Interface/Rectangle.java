/**
 * 
 */
package com.obsqura.javaprograms.Interface;

/**
 *Create a class Rectangle and find the area of Rectangle using getArea() 
*function 
*@author VINITHA EDWIN
 */
public class Rectangle implements Polygon {
    
	@Override
	public double getArea(double length, double breadth) {
		
        return( length * breadth);
	}
	
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		double rectangleArea = rect.getArea(10, 20);
		System.out.println("The area of the Rectangle is "+rectangleArea);
	}
		
}
