/**
 * 
 */
package Inheritance;

/**
 * Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
* d. Salary slip should contains :- basic pay, deduction, hra, pf,bonus and total salary by hand.
* @author VINITHA EDWIN
* 
*/
public class TotalSalary extends CalculateSalary{

	double totalSalary;
	public TotalSalary()
	{
	 
	}
	  public  TotalSalary(double basicPay, double deduction, double bonus)
	  {
		  super(basicPay, deduction,bonus);
		  super.calculateHraPf();
	  }
	public void calcTotalSalary()
	{    
		 totalSalary = basicPay + hra - pf - deduction + bonus;
		 System.out.println("Salary Slip \n");
		 System.out.println(     "basic pay: " + basicPay +
	             "\ndeduction: " + deduction +
	             "\nhra: " + hra +
	             "\npf: " + pf +
	             "\nbonus: " + bonus +
	             "\n total salary: " + totalSalary);
	}
	
}
