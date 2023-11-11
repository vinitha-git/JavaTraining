/**
 * 
 */
package com.obsqura.javaprograms.collections;

import java.util.ArrayList;

/**
 *Write a Java program to remove the third element from an array list.
 *@author VINITHA EDWIN  
 */
public class Remove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  // Creating and initializing the ArrayList
        // Declaring object of integer type 
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // remove element from index 3
        Integer str = numbers.remove(3);
        System.out.println("Updated ArrayList: " + numbers);
        System.out.println("Removed Element: " + str);    

	}

}
