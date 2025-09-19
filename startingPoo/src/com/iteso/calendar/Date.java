package com.iteso.calendar;

public class Date {
	private int day, month, year, format;
	private String monthName;
	
	private final int yearMin = 1900;
	private final int yearMax = 3000;
	
	// Setters
	public void setYear(int year) {
		if(year >= yearMin && year <= yearMax){
			this.year = year;
		}
		else {
			this.year = 2017;
		}
	}
	
	public void setMonth(int month){
		if(month > 0 && month <= 12){
			switch(day) {
				case 1:
					this.monthName = "January";
					this.month = month;
					break;
				case 2:
					this.monthName = "February";
					this.month = month;
					break;
				case 3:
					this.monthName = "March";
					this.month = month;
					break;
				case 4:
					this.monthName = "April";
					this.month = month;
					break;
				case 5:
					this.monthName = "May";
					this.month = month;
					break;
				case 6:
					this.monthName = "June";
					this.month = month;
					break;
				case 7:
					this.monthName = "July";
					this.month = month;
					break;
				case 8:
					this.monthName = "August";
					this.month = month;
					break;
				case 9:
					this.monthName = "September";
					this.month = month;
					break;
				case 10:
					this.monthName = "October";
					this.month = month;
					break;
				case 11:
					this.monthName = "November";
					this.month = month;
					break;
				case 12:
					this.monthName = "December";
					this.month = month;
					break;
				default:
					this.monthName = "Enero";
					this.month = 1;
			}
		}
	}
	
	public void setDay(int day){
		if(day > 0 && day <= 31){
			// Starting inside conditionals
			/*First If*/
			if((this.month == 4||this.month == 6||this.month == 9||this.month == 11) && day >= 1 && day <= 30){
				this.day = day;
			}
			/*Second if*/
			if(this.month == 2 && day >= 1 && day <= 28){
				this.day = day;
			}
			/*Third If*/
			if((this.month == 1||this.month == 3||this.month == 5||this.month == 7||this.month == 8||this.month == 10||this.month == 12)) {
				this.day = day;
			}
			// Finishing conditionals
		}else {
			this.day = 1;
		}
	}
	
	public void setFormat(int format) {
		if(format >= 0 && format <= 2) {
			this.format = format;
		}else {
			this.format = 0;
		}
	}
	
	//Getters
	public String getMonthName() {
		return this.monthName;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public int getFormat() {
		return this.format;
	}
	
	// Constructors
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		this.format = 0;
	}

	public Date(int year, int month, int day, int format) {
		this(year, month, day);
		setFormat(format);
	}
	
	// Functions
	public String toString(int format) {
		String returnString;
		if(format == 0){
			returnString = this.day + "/" + this.month + "/" + this.year;
		}else if(format == 1) {
			returnString = this.day + "/" + this.monthName.substring(0, 3) + "/" + this.year;
		}else if(format == 2) {
			returnString = this.day + " de " + this.monthName + " de " + this.year;
		}else {
			returnString = "You wrote a wrong value";
		}
		return returnString;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Date)) return false;
		return true;
	}
	
	public Date clone() {
		return new Date(this.year, this.month, this.day, this.format);
	}
	
	public Date next() {
		return new Date(this.year,    ((this.month == 12 && this.day == 31) ? 1 : this.month+1), (this.day == 30 && (this.month == 4||this.month == 6||this.month == 9||this.month == 11) ? 1 : this.day +1), this.format);
	}
}

