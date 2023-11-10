/**
 * 
 */
package Aggregation;

/**
 * Create another class Employee with empName, empId and Car.
 *  Print employee details.
 *  @
 */
public class Employee {
	
	String employeeName;
	int empId;
	Car car;
	

	/**
	 * @param employeeName
	 * @param empId
	 * @param car
	 */
	public Employee(String employeeName, int empId, Car car) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
		this.car = car;
	}
    public void display()
    {
    	System.out.println(employeeName+" "+empId);
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car("Blue","WagonR", "123SD");
		Employee emp1 = new Employee("Vineeth", 6220, car1);
		emp1.display();
	}

}
