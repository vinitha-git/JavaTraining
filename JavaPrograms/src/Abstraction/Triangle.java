/**
 * 
 */
package Abstraction;

/**
 * 
 */
public class Triangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Triangle");
		
	}

	public static void main(String[] args) {
		Shape sh = new Triangle();
		sh.draw();
	}
}
