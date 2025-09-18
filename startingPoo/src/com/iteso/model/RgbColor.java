package com.iteso.model;

public class RgbColor {
	
	// Attributes
	private int red, green, blue;
	private String name;
	
	//Setters
	public void setRed(int red){
		if(red >= 0 && red <= 255) {
			this.red = red;
		}
	}
	
	public void setGreen(int green){
		if(green >= 0 && green <= 255) {
			this.green = green;
		}
	}
	
	public void setBlue(int blue){
		if(blue >= 0 && blue <= 255) {
			this.blue = blue;
		}
	}
	
	public void setName(String name){
		this.name = name;
		}
	
	
	// Constructores
	
	
	
	public RgbColor(int red, int green, int blue){
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public RgbColor(int red, int green, int blue, String name){
		this(red, green, blue);
		this.name = name;
	}
	
	public RgbColor(){
		this(red, green, blue);
		name = "Gray";
	}

}
