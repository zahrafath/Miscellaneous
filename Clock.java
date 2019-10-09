import java.io.*;

public class Clock{
	public static void main(String args[]) {
		/** Calls the fucntion timeToAngle to calculate the angle and prints the values. */
		System.out.println("The angle between the hour hand and the minute hand at: ");
		System.out.println("9:00 is " + timeToAngle(9,00)); 
		System.out.println("3:00 is " +timeToAngle(3,00));
		System.out.println("18:00 is "+timeToAngle(18,0)); 
		System.out.println("1:00 is " +timeToAngle(1,00));
		System.out.println("2:30 is " +timeToAngle(2,30));
		System.out.println("4:41 is " +timeToAngle(4,41));
		System.out.println("0:00:20 is " +timeToAngle(0,0,20));
		System.out.println("13:05:27.272727272727 is " +timeToAngle(13,05,27.272727272727));
	}
	/**
	 * Calculates the angle between the hour hand and the minute hand. The following are considered: 
	 * 1. The hour hand rotates 30 degrees in 60 minutes and 0.5 degrees in 1 minute.
	 * 2. The minute hand rotates 6 degrees in one minute.
	 * 
	 * @param hours
	 * @param minutes
	 * 
	 * @return angle - The angle between the hour hand and the minute hand.
	 */
	public static int timeToAngle(int hours, int minutes) {
		
		double aHour = 30 * hours + 0.5 * minutes;
		double aMinute = 6 * minutes;
		int aDiff = (int) (aHour - aMinute);
		int angle = (360 + aDiff) % 360;
		return angle;
	}
	 
	/**
	 * Calculates the angle between the hour hand and the minute hand. The following are considered: 
	 * 1. The hour hand rotates 30 degrees in 60 minutes and 0.5 degrees in 1 minute.
	 * 2. The minute hand rotates 6 dgrees in one minute and 0.1 degrees in 1 second.
	 * 
	 * @param hours
	 * @param minutes
	 * @param seconds
	 * 
	 * @return angle - The angle between the hour hand and the minute hand.
	 */
	public static int timeToAngle(int hours, int minutes, double seconds) {
		int aHour = (int)(30 * hours + 0.5 * minutes);
		int aMinute = (int)(6 * minutes + 0.1 * seconds);
		int angle = (360 + aHour - aMinute) % 360;
		return angle;
	}
}