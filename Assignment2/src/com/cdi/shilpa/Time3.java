package com.cdi.shilpa;

public class Time3 extends Date3 {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time2 no-argument constructor:
	// initializes each instance variable to zero
	public Time3() {
		this(0, 0, 0, 0, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time3(int hour) {
		this(0, 0, 0, hour, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time3(int hour, int minute) {
		this(0, 0, 0, hour, minute, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour, minute and second supplied
	public Time3(int month, int day, int year, int hour, int minute, int second) {
		super(month, day, year);
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// Time2 constructor: another Time2 object supplied
	public Time3(Time3 time) {
		// invoke constructor with three arguments
		this(0, 0, 0, time.hour, time.minute, time.second);
	}

	// Set Methods
	// set a new time value using universal time;
	// validate the data
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		this.hour = hour;
	}

	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		this.minute = minute;
	}

	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.second = second;
	}

	// Get Methods
	// get hour value
	public int getHour() {
		return hour;
	}

	// get minute value
	public int getMinute() {
		return minute;
	}

	// get second value
	public int getSecond() {
		return second;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return super.toString()
				+ String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
						getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

	public void tick() {
		int nextMinute = minute;
		int nextHour = hour;
		int nextSecond = (second + 1) % 60;
		if (nextSecond < second) {
			nextMinute = (minute + 1) % 60;
		}

		if (nextMinute < minute) {
			nextHour = (hour + 1) % 24;
		}
		if (nextHour < hour) {
			super.nextDay();
		}
		second = nextSecond;
		minute = nextMinute;
		hour = nextHour;
	}

	public void incrementMinute() {
		int nextMinute = (minute + 1) % 60;
		int nextHour = hour;
		if (nextMinute < minute) {
			nextHour = (hour + 1) % 12;
		}
		if (nextHour < hour) {
			super.nextDay();
		}
		minute = nextMinute;
		hour = nextHour;
	}

	public void incrementHour() {
		int nextHour = (hour + 1) % 12;
		if (nextHour < hour) {
			super.nextDay();

		}
		hour = nextHour;
	}

}
