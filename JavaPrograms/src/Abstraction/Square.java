/**
 * 
 */
package Abstraction;

/**
 * 
 */
public class Square extends Shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw square");
	}
public static void main(String[] args) {
	Shape sh = new Square();
	sh.draw();
}
}
