/**
 * This class contains several methods for manipulating dates.
 * @author ADD YOUR NAME HERE
 * @version 1.0
 * Lab07 - DateManipulator
 * Fall 2018
 */
public class DateManipulator {

	/**
	 * Empty-argument constructor
	 */
	public DateManipulator() {
		
	}//end constructor
	
	/**
	 * This method determines if a year is a leap year. Years 
	 * less than 1582 return -1 (not valid leap years). Otherwise
	 * the year must be evenly divisible by 4 or 400. However, years
	 * divisible by 100 are not leap years (although they are divisible
	 * by 4.
	 * @param year - four-digit integer representing a year.
	 * @return - true or false
	 */
	public boolean isLeapYear(int year) {
		if (year < 1582) {
			return false;
		}
		/*
		If a year is divisible by 400, it is always divisible by 100. The instructions led me to believe that
		the second condition should also include "&& year % 100 !=0", but I believe this correctly returns the
		boolean value of whether or not a year is a leap year.
		*/
		else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
		
	}//end isLeapYear
}//end class