/**
 * 
 */
package Aggregation;

/**
 *EmpCarBike with empName,empId,Car and Bike. 
 *Print the employee details 
 *@author VINITHA EDWIN
 */
public class EmpCarBike {
	
	String employeeName;
	int empId;
	Car car;
	Bike bike;
	

	/**
	 * @param employeeName
	 * @param empId
	 * @param car
	 */
	public EmpCarBike(String employeeName, int empId, Car car, Bike bike) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
		this.car = car;
		this.bike= bike;
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
		Bike bike1 = new Bike("Royal Enfield", "1234RF");
		EmpCarBike emp1 = new EmpCarBike("Vineeth", 55555, car1,bike1);
		emp1.display();
	}


}
