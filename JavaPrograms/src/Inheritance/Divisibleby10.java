/**
 * 
 */
package Inheritance;

/**@author VINITHA EDWIN
 * 
 */
import java.util.Scanner;

	public class Divisibleby10 extends AdditonResult{
	    private boolean isDivisibleBy10;

	    Divisibleby10(double num1, double num2){
	        super(num1, num2);
	        isDivisibleBy10(super.getSum());
	    }
	    public boolean getIsDivisibleBy10(){
	        return this.isDivisibleBy10;
	    }
	    public void isDivisibleBy10(double sum){
	        this.isDivisibleBy10 = false;
	        if (sum % 10 == 0){
	            this.isDivisibleBy10 = true;
	        }
	    }
	    public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double number1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double number2 = scanner.nextDouble();
	        scanner.close();
	        Divisibleby10 class2 = new Divisibleby10(number1, number2);
	        if (class2.getIsDivisibleBy10()){
	            System.out.println("The addition result is divisible by 10");
	        }
	        else {
	            System.out.println("The result of the addition is not divisible by 10");
	        }
	    }
	}
