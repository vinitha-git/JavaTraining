/**
 * 
 */
package encapsulation$abstraction;

/**
 * @author VINITHA EDWIN
 */
public class FullTimeEmployee extends Employee{
	


	public FullTimeEmployee(double baseSalary) {
		super(baseSalary);
		
	}

	@Override
	public double calcualteSalary() {
		return baseSalary* 8;
		
	}

}
