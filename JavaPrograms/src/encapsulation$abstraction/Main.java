package encapsulation$abstraction;
/**
 * @author VINITHA EDWIN
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fte= new FullTimeEmployee(100.0d);
		Employee cte= new Contractor(200.0d, 8.0d);
		System.out.println(fte.calcualteSalary());
		System.out.println(cte.calcualteSalary());

	}

}
