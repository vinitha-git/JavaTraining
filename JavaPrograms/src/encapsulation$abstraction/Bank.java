/**
 * 
 */
package encapsulation$abstraction;

/**
 * Bank One method to set pin from „User‟ class and validate Pin in another method - [Valid pins – 1001, 1234, 1212]
 * @author VINITHA EDWIN
 */
public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      User  user = new User();
      user.setPin(1001);
      System.out.println(user.getPin());
	}

}
