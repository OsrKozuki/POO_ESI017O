package tests;
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
		
	}
}
