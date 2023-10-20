/**
 * 
 */
package com.obsqura.javaprograms.methods;
	/**
	*This class is used to Swap two numbers with temporary vaiables.
	*@author VINITHA EDWIN
	*
	*/
import java.util.Scanner;
	class SwapTwoNumbers
	{
	 public static void main(String args[])
	{   
		 Scanner sc=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
		int temp;
		System.out.println("Before Swapping a="+a+ " b="+b+".");
		//Swapping logic
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a="+a+ " b="+b+".");
		

	}
	}


