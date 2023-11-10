/**
 * 
 */
package Inheritance;

/**
 * Get basic pay, deduction and bonus from console. 
 * @author VINITHA EDWIN
 */
import java.util.Scanner;
public class SalaryDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner in = new Scanner(System.in);
				System.out.println(     "Enter basic pay: ");
		        double basicPay = in.nextDouble();
		        System.out.println(     "Enter deduction");
		        double deduction = in.nextDouble();
		        System.out.println(     "Enter bonus: ");
		        double bonus  = in.nextDouble();
		        TotalSalary ts = new TotalSalary( basicPay,  deduction,  bonus);
		        ts.calcTotalSalary();}
}
