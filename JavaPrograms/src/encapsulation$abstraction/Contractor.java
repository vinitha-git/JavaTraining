/**
 * 
 */
package encapsulation$abstraction;

/**
 * @author VINITHA EDWIN
 */
public class Contractor  extends Employee{

	private double hourlyRate;
	public Contractor(double baseSalary,double hourlyRate) {
		super(baseSalary);
		this.hourlyRate= hourlyRate;
		
	}

	@Override
	public double calcualteSalary() {
		return baseSalary* this.hourlyRate;
		
	}

}
