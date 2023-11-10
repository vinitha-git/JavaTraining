/**
 * 
 */
package Aggregation;
/**
 * Get the student name and roll number
 * Print Student name, roll number with address 
 * There is no IS-A relationship 
 * @author VINITHA EDWIN
 * */
public class Student {

	private int rollNo;
	private String name;
	Address add;
	
	public Student(int rollNo, String name,Address add) {  
	    this.rollNo = rollNo;  
	    this.name = name;  
	    this.add=add;  
	}  
	  
	void display(){  
	System.out.println(rollNo+" "+name);  
	System.out.println(add.hName+" "+add.city+" "+add.country+" "+add.pincode);  
	}  
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("ViniVilla","Thiruvanthapuram","India",695582);  
		Address address2=new Address("Carmel","Thiruvanthapuram","India",695581);  
		
		Student std1 = new Student(1,"Vinitha",address1);
		Student std2 = new Student(2,"Reema",address2);
		
		std1.display();
		std2.display();
		
	}

}
 