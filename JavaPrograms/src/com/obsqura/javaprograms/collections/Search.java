/**
 * 
 */
package com.obsqura.javaprograms.collections;

/**
 *Write a Java program to search an element in an array list.
 *@author VINITHA EDWIN 
 */
import java.util.*;

public class Search {

	/**
	 * @param args
	 */
		   public static void main(String[] args) {
		      ArrayList<String> aList = new ArrayList<>();
		      aList.add("A");
		      aList.add("B");
		      aList.add("C");
		      aList.add("D");
		      aList.add("E");
		      int index1 = aList.indexOf("C");
		      int index2 = aList.indexOf("Z");
		      if(index1 == -1)
		         System.out.println("The element C is not in the ArrayList");
		      else
		         System.out.println("The element C is in the ArrayList at index " + index1);
		      if(index2 == -1)
		         System.out.println("The element Z is not in the ArrayList");
		      else
		         System.out.println("The element Z is in the ArrayList at index " + index2);
		   }
		}

	


