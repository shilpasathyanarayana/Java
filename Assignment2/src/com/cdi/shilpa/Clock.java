package com.cdi.shilpa;

public class Clock {

	public static void main(String[] args) {
		Time3 time= new Time3(12,2,2023,23,59,59);
		System.out.println(time);
		time.tick();
		System.out.println(time);
		time.incrementMinute();
		System.out.println(time);
		time.incrementHour();
		System.out.println(time);
		
	}

}
