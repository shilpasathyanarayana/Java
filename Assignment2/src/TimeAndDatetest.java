
class DateAndTime {
	private int month;
	private int day;
	private int year;
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second;

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
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

		System.out.printf("Date object constructor for date %s%n", this);
	}

	public DateAndTime() {
		this(0, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public DateAndTime(int hour) {
		this(hour, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public DateAndTime(int hour, int minute) {
		this(hour, minute, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour, minute and second supplied
	public DateAndTime(int hour, int minute, int second) {
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
	public DateAndTime(DateAndTime time) {
		// invoke constructor with three arguments
		this(time.hour, time.minute, time.second);
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

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public static int[] getDayspermonth() {
		return daysPerMonth;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	@Override
	public String toString() {
		return "DateAndTime [month=" + month + ", day=" + day + ", year=" + year + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
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
		second = nextSecond;
		minute = nextMinute;
		hour = nextHour;
	}

	public void incrementMinute() {
		minute = (minute + 1) % 60;
	}

	public void incrementHour() {
		hour = (hour + 1) % 24;
	}
}

// convert to String in standard-time format (H:MM:SS AM or PM)
public class TimeAndDatetest {
	public static void main(String[] args) {
		DateAndTime time1 = new DateAndTime(2, 18, 2023, 23, 0, 0);
		System.out.println(time1);
		time1.tick();
		System.out.println(time1);
		time1.incrementMinute();
		System.out.println(time1);
		time1.incrementHour();
		System.out.println(time1);
		time1.nextDay();
	}
}
