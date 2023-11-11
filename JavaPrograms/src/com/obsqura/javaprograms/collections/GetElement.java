/**
 * 
 */
package com.obsqura.javaprograms.collections;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list. 
 * @author VINITHA EDWIN
 */
public class GetElement {

	/**
	 * @param args
	 */
	public static void main(String[] args){

	    // create ArrayList
	    ArrayList<String> colors = new ArrayList<>();

	    // Add elements to ArrayList
	    colors.add("Red");
	    colors.add("Orange");
	    colors.add("blue");
	    System.out.println("ArrayList: " + colors);
	    String str = colors.get(2);
	    System.out.println("Element at index 2: " + str);
	  }

}
