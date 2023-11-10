package Inheritance;
/*
 * . Program to check the addition result is divisible by 10
*a. Class 1
*i. Return addition result of two numbers
*b. Class 2
*i. Check the addition result is divisible by 10(use super keyword
 */
public class AdditonResult {

	
	    private double number1;
	    private double number2;
	    private double sum;

	    AdditonResult(double num1, double num2){
	        this.number1 = num1;
	        this.number2 = num2;
	        setSum();
	    }
	    public void setSum(){
	        this.sum = this.number1 + this.number2;
	    }
	    public double getSum(){
	        return this.sum;
	    }
	}

