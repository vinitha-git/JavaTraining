/**
 * 
 */
package Inheritance;

/**
 * Calculate hra (5% of basic pay) and pf (20% of basic pay). 
 * @author VINITHA EDWIN
 * 
 */
public class CalculateSalary {
	
	double basicPay; 
	double deduction;
	double bonus;
	double hra;
	double pf;
	
	public  CalculateSalary()
	{
		
	}
  public  CalculateSalary(double basicPay, double deduction, double bonus)
  {
	  this.basicPay = basicPay;
	  this.deduction = deduction;
	  this.bonus = bonus;
  }
  public void calculateHraPf() {
	  this.hra = this.basicPay * 0.05;
	  this.pf = this.basicPay * 0.2;
	  System.out.println(this.hra+"  "+ this.pf);
  }
  

}
