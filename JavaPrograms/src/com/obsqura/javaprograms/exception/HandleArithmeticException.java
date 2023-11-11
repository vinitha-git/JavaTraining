/**
 * 
 */
package com.obsqura.javaprograms.exception;

/**
 * . Create a class to handle the Arithmetic Exception. 
 * The output should be “You can’t divide a number by 0”. 
 * Use try -catch block
 * @author VINITHA EDWIN
 */
public class HandleArithmeticException {

	void divide(int a, int b)   
	{  
	int res;  
		try  
		{  
			// performing division and storing the result  
			res = a / b;  
			System.out.println("Division process has been done successfully.");  
			System.out.println("Result came after division is: " + res);  
		}  
	// handling the exception in the catch block  
		catch(java.lang.ArithmeticException ex)  
		{  
			System.out.println("You can't divide a number by 0 " );  
		}  
	  
	  
	}  
	  
	// main method  
	public static void main(String argvs[])  
	{  
	// creating an object of the class ArithmeticException  
		HandleArithmeticException obj = new HandleArithmeticException();  
	obj.divide(1, 0);  
	}  
}  

