//Gavin Smith

package zodiac1;

import java.util.Scanner;
public class DateandTimeTester {//DateAndTimeTester dtTester = new DateAndTimeTester();

	public static void main(String[] args) {
			
		
	String repeat = "";
	do {	
		System.out.println("Hello, I am your Date and Time Testing Tool.");
			
				Scanner keyboard = new Scanner(System.in); {
				System.out.println("Enter your month and day in the format: MM/DD!");
				String date = keyboard.nextLine();
				
				System.out.println("Enter your hour and minute of the day in the format: HH:MM!");
				String time = keyboard.nextLine();
				
				if(isValid(date, time))
				{
					System.out.println("Your date and time is valid!");
				}
				else
				{
					System.out.println("Your date and time is not valid!");
				}
				System.out.println("Would you like to exit? Press enter to find another date or type 'quit' to exit.");
				
				repeat = keyboard.nextLine();
			}
	}
			while(!repeat.equals("quit"));
	{
		System.out.println("Thank you for using the Date and Time Tester Tool!");
	}
	
			
	}
	
	public static boolean isValid(String date, String time) {
		
		return isValidDate(date) && isValidTime(time);
	}

	public static boolean isValidDate(String date) {
		
		String[] array = date.split("/");
		
		if (array.length != 2)
		{
			return false;
		}
		
		int month = getMonth(array[0]);
		int day = getDay(array[1], month);
		
		return month != -1 && day != -1;
	}
	
	public static int getMonth(String monthString) { //This same block of code was used for
		
		int month;									//the month, day, hour and minute
		
		month = Integer.parseInt(monthString);
		
		if(month >= 1 && month <= 12)
		{
			return month;
		}
		else
		{
			return -1;
		}
	}

	public static int getDay(String dayString, int month) {
		
		int day;
		
		day = Integer.parseInt(dayString);
		
		if(day > 1 && day <= 31)
		{
			return day;
		}
		else
		{
			return -1;
		}

	}

	

	public static boolean isValidTime(String time) {
		
		String[] array = time.split(":");
		
		if (array.length != 2)
		{
			return false;
		}
		
		int hour = getHour(array[0]);
		int minute = getMinute(array[1], hour);
		
		return hour != -1 && minute != -1;
	}

	public static int getHour(String hourString) {
		
		int hour;
		
		hour = Integer.parseInt(hourString);
		
		if(hour > 1 && hour <= 12)
		{
			return hour;
		}
		else
		{
			return -1; 
		}

	}
		

	public static int getMinute(String minuteString, int hour) {
		
		int minute;
		
		minute = Integer.parseInt(minuteString);
		
		if(minute > 1 && minute <= 59)
		{
			return minute;
		}
		else
		{
			return -1;
		}
	}
}
		
