package encapsulation$abstraction;
/**
 *  b. Pin number should declared as private 
 * c. Class 2 – User Get the pin from User
 * @author VINITHA EDWIN
 */
public class User {

	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		if(validatePin(pin))
		{
			this.pin = pin;
		}
		else
		{ 
			System.out.println("Invalid Pin");
			
		}
		
	}

	private boolean validatePin(int pin) {
		// TODO Auto-generated method stub
		if (pin ==1001||pin ==1234 ||pin ==1212)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
}
