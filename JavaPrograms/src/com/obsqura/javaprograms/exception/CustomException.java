/**
 * 
 */
package com.obsqura.javaprograms.exception;

/**
 * Create a custom Exception class to handle invalid age.
 * (Age less than 18)(use throw and throws)
 * @author VINITHA EDWIN
 */
public class CustomException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			int age = 10;
			checkAge(age);
		}
		catch(Exception ex) {
			System.out.println("Problem "+ex.getMessage());
		}

	}

	private static void checkAge(int age) throws AgeException {
	 
		if(age<18) {
			throw new AgeException("Age is less than 18");
		}
		else 
		{
			System.out.println("Age is greater than 18");
		}
		
	}
	


}
