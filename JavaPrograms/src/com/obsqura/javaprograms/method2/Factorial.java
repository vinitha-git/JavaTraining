/**
 *This class is used to find factorial of a number
 * @author VINITHA EDWIN
 */
package com.obsqura.javaprograms.method2;
import java.util.*;
	public class Factorial
	{

	  public void find(int num){
	 	int fact=1;
	        for(int i=1;i<=num;i++)
	        {
	            fact=fact*i;
	        }
	        System.out.println("Factorial of the number: "+fact); 
		}

	     public static void main(String []args)
	     {
	        //Take input from the user
	        //Create an instance of the Scanner Class
	        Scanner sc=new Scanner(System.in);
	        //Declare and Initialize the variable
	        System.out.println("Enter the number: ");
	        int num=sc.nextInt();
		Factorial fact = new Factorial();
		fact.find(num);
	       
	     }  
	}

