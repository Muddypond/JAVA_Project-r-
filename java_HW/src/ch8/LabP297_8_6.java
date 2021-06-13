package ch8;

//import java.util.Scanner;
import javax.swing.JOptionPane;
public class LabP297_8_6 {
	/** Main method */
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);

		// Prompt the user to enter year
		String yearString =JOptionPane.showInputDialog("Enter full year (e.g., 2001): ");
		int year = Integer.parseInt(yearString);

		// Prompt the user to enter month
		String monthString =JOptionPane.showInputDialog("Enter month in number between 1 and 12: ");
		int month = Integer.parseInt(monthString);

		// Print calendar for the month of the year
		showMonth(year, month);
	}

	/** Print the calendar for a month in a year */
	public static void showMonth(int year, int month){
		// Print the headings of the calendar
		String clender=getMonthTitle(year, month);

		// Print the body of the calendar
		clender=clender+getMonthBody(year, month);
		JOptionPane.showMessageDialog(null, clender);
	}

	/** Print the month title, e.g., May, 1999 */
	public static String getMonthTitle(int year, int month){
		String res=" " + getMonthName(month)+ " " + year+"\n"
		+"！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！\n"
		+"Sun  Mon  Tue  Wed  Thu  Fri  Sat\n";
		return res;
	}

	/** Get the English name for the month */
	public static String getMonthName(int month){
		String monthName = "";
		switch (month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";break;
		}

		return monthName;
	}

	/** Print month body */
	public static String getMonthBody(int year, int month){
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);

		String res="";
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			res=res+"         ";

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			res=res+String.format("%5d",i);

			if ((i + startDay) % 7 == 0)
				res=res+"\n";
		}

		res=res+"\n";
		return res;
	}

	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month){
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month){
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2) return isLeapYear(year) ? 29 : 28;

			return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
 }