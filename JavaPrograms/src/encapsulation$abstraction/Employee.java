package encapsulation$abstraction;

/**
 * @author VINITHA EDWIN
 */
public abstract class Employee {

	protected double baseSalary;
	public Employee (double baseSalary )
	{
		this.baseSalary= baseSalary;
	}
	abstract double calcualteSalary();
}
