/**
 * 
 */
package com.obsqura.javaprograms.exception;

/**
 * Create a class to handle ArrayIndexOutOfBoundException.
 *  Give the size of array as 5. Try to access 7th element.
 *   The output should be “Array is out of Bound” 
 *   @author VINITHA EDWIN
 */
public class HandlleArrayOutOfBoundException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
		        int ar[] = { 1, 2, 3, 4, 5 };
		        for (int i = 0; i <= ar.length-1; i++)
		            System.out.println(ar[i]);
		        System.out.println(ar[7]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("The array is out of bound");
		}
	}

}
