package com.obsqura.javaprograms.collections;
import java.util.*;
public class IterateArrayList {
 // Main driver method  
	    public static void main(String[] args)
	    {
	        // Creating and initializing the ArrayList
	        // Declaring object of integer type 
	        ArrayList<Integer> numbers =new ArrayList<>();
	        numbers.add(1);
	        numbers.add(7);
	        numbers.add(3);
	        numbers.add(4);
	        // Iterating using for loop
	        for (int i = 0; i < numbers.size(); i++) 
	           
	            // Printing and display the elements in ArrayList 
	            System.out.print(numbers.get(i) + " ");        
	    }
	}

