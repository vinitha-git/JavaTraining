package com.obsqura.javaprograms.Interface;
/**
 * @author VINITHA EDWIN
 */
public class Shape implements Interface1, Interface2 {

	
	public static void main(String[] args)
	{
	 	Interface1 ref= new Shape();
	 	Interface2 ref2= new Shape();
	 	ref.draw();
	 	ref2.draw();
	}

	@Override
	public void draw() {
		
		System.out.println("Multiple Inheritance");
		
	}
		
	}


