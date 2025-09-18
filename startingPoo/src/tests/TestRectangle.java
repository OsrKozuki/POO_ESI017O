package tests;
import javax.swing.JOptionPane;

import shapes2d.Rectangle;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("===== R1 =====");
		System.out.println(r1);
		r1.print();
		//r1.base = 5;
		//r1.height = 10;
		r1.setBase(5);
		r1.setHeight(10);
		r1.print();
		
		// Extract only a value of a method, in this case are
		double a = r1.area();
		double p = r1.perimeter();
		System.out.println(a + ", " + p);
		
		// New Object
		Rectangle r2 = new Rectangle();
		System.out.println("===== R2 =====");
		System.out.println(r2);
		//r2.height = 3.5;
		r2.setHeight(3.5);
		r2.setBase(-3);
		r2.print();
		r1.print();
		
		Rectangle r3 = new Rectangle(8, 6);
		System.out.println("===== R3 =====");
		System.out.println(r3);
		r3.setHeight(0);
		r3.print();
		
		
		Rectangle r4 = new Rectangle(7);
		System.out.println("===== R4 =====");
		System.out.println(r4);
		r4.setBase(0.001);
		r4.print();
		
		Rectangle r5 = new Rectangle();
		System.out.println("===== R5 =====");
		System.out.println(r5);
		//r5.base = -5;
		//r5.height = 0;
		r5.setBase(-5);
		r5.setHeight(0);
		System.out.println(r5.getBase());
		System.out.println(r5.getHeight());
		r5.print();
		
		
		Rectangle r6 = new Rectangle(-2, 0);
		r6.print();
		
		Rectangle r7 = new Rectangle(0);
		r7.print();
		
		/**/
		System.out.println(r7);
		JOptionPane.showMessageDialog(null, r7);
		// Above and below is the same, .toString is being called automatically, this every time we print.
		// .toString is inherited from class Object <<<<<<<<<<<<<<<<<<<<
		System.out.println(r7.toString());
		JOptionPane.showMessageDialog(null, r7.toString());
		/**/
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		System.out.println("r6 = " + r6);
		System.out.println("r7 = " + r7);
		
		Rectangle [] rectangles = {r1, r2, r3, r4, r5, r6, r7};
		for(int i = 0; i < rectangles.length; i++) {
			System.out.printf("Rectangle %d: %s \n", i + 1, rectangles[i]);
		}
		
		if(r5.equals(r6)) {
			System.out.println("Los objetos comparados son iguales en texto");
		}else {
			System.out.println("Los objetos comparados son iguales en texto");
		}
		
		String str = "Hola";
		if(r5.equals(str)) {
			System.out.println("Los objetos comparados son iguales en texto");
		}else {
			System.out.println("Los objetos comparados NO Y NO Y NO iguales en texto");
		
		}
		
		//Rectangle r8 = r1; // THERE IS NO COPY HERE, IT IS POINTING  TO THE SAME OBJECT AT THE END
		Rectangle r8 = r1.clone(); 
		r8.setHeight(2.5);
		System.out.println("r1 = " + r1);
		System.out.println("r8 = " + r8);
	}
}
