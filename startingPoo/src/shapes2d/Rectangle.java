package shapes2d;


public class Rectangle {
	
	/* Version 1*/
	/* These are the attributes */
	//public double base;
	//public double height; 
	
	/* From version 3 START*/
	private double base = 1;
	private double height = 1; 
	
	// Method to enter --- Setters / Receive
	public void setBase(double base) {
		if(base > 0)
			this.base = base;
	}
	
	public void setHeight(double height) {
		if(height > 0)
			this.height = height;
	}
	
	
	// Getters / Deliver
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return  this.height;
	}
	/* From version 3 END*/
	
	/* ================= These are the methods =================*/
	public double area() {
		// SHow as blue due to there are the same attributes.
		return base * height;  
	}
	
	public double perimeter() {
		return 2 * (base + height);
	}
	
	public void print() {
		System.out.printf("(base=%.2f height=%.2f area=%.2f perimeter=%.2f) \n", base, height, area(), perimeter());
	}
	
	// Version 2.0
	/*================= Constructor here =================*/
	/* Void constructor if any is declared */
	/*
	public Rectangle(double base, double height) { //The  variables here are from the Method, not the attributes
		this.base = base;
		this.height = height;
	}
	
	public Rectangle() {
		base = 1;
		height = 1;
	}
	
	public Rectangle(double lenght) {
		this(lenght, lenght); // We are calling constructor "public Rectangle(double base, double height)"
	}
	*/
	/* Version 4*/
	public Rectangle(double base, double height) { //The  variables here are from the Method, not the attributes
		setBase(base);
		setHeight(height);
	}
	
	public Rectangle() {
		base = 1;
		height = 1;
	}
	
	public Rectangle(double lenght) {
		this(lenght, lenght); // We are calling constructor "public Rectangle(double base, double height)"
	}
	
}
