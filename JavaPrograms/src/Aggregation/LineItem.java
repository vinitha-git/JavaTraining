/**
 * 
 */
package Aggregation;

/**
 * class LineItem which consist of quantity and Product.
 *  Use aggregation to print the lineitem with Product. 
 *  @author VINITHA EDWIN
 */
public class LineItem {
	
	int quantity;
	Product prod;
	
	public LineItem(int quantity, Product prod) {  
	    this.quantity = quantity;  
	    this.prod = prod;   
	}  
	  
	void display(){  
	System.out.println(quantity+" "+prod.id+" "+prod.name+" "+prod.description);  
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod1=new Product(1,"Wirlpool","Washing MAchine");  
		Product prod2=new Product(2,"Toshiba","Laptop");  
		
		LineItem lineITem1 = new LineItem(5,prod1);
		LineItem lineItem2 = new LineItem(6,prod2);
		
		lineITem1.display();
		lineItem2.display();

	}

}
