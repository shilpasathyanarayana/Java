package com.cdi.shilpa;
public class Date3 {
	private int month;
	private int day;
	private int year;

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date3(int month, int day, int year) {
		super();

		if (month <= 0 || month > 12) {
			System.out.println("month must be between 1 to 12");
			return;
		}
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			System.out.println("Out of rage for the specified month and year");
			return;
		}
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			System.out.println("day is out of bount for the specified month and year");
			return;
		}
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("Date object constructor for date %s%n", this);

	}

	public void nextDay() {
		int nextDay = (day + 1) % daysPerMonth[month];
		if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			nextDay = (day + 1) % 29;
		}
		int nextmonth = month;
		if (nextDay < day) {
			nextmonth = (month + 1) % 12;
		}
		if (nextmonth < month) {
			year = year + 1;
		}
		day = nextDay;
		month = nextmonth;
		if (month <= 0 || month > 12) {
			System.out.println("month must be between 1 to 12");
			return;
		}
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			System.out.println("Out of rage for the specified month and year");
			return;
		}
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			System.out.println("day is out of bount for the specified month and year");
			return;
		}

		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "NextDay [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

}