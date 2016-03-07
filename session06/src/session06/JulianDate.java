package session06;
/**
 * 
 * 
 * @author dkruger
 * 
 * 
 * 
 * Julian Date: pick a base date.
 * J2000  2000, Jan. 1 = 0
 * Jan.2 = 1
 * Jan. 3 = 2 ...
 * Ja. 1 2001 = 366
 * 
 *http://www.amazon.com/Astronomical-Algorithms-Jean-Meeus/dp/0943396611%3FSubscriptionId%3DAKIAILSHYYTFIVPWUY6Q%26tag%3Dduckduckgo-ffab-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0943396611
 *http://pdc.ro.nu/jd-code.html
 *http://www.koshko.com/calendar/julian-day.shtml
 * leap year = 366 days (Feb. 29)
 * year mod 4 == 0 , eg 2004, 2008, 2012 LEAP YEAR
 * year mod 100 == 0, eg 1900, 1700, 1500 NOT A LEAP YEAR (Exception)
 * year mod 400 == 0, LEAP YEAR, 2000 is a leap year, 2400 LEAP
 */
public class JulianDate { // real name is session06.JulianDate
	private double julianDate;

	// only one variable monthNames or ALL JulianDate objects (shared)
	private static String[] monthNames = {"Jan", "Feb", "Mar", "Apr" };
	public JulianDate(int year, int mon, int day) {
		
		
	}
	public JulianDate(int year, int mon, int day,
				int hour, int min, int sec) {
		
		
	}
	
	public int getYear() {
		
	}
	public int getMonth() {
		
	}
	
	public int getDay() {
		
	}
	// return 0 for Sunday, 1=monday, ... 6 = Saturday
	public int dayOfWeek() {
		
	}
	public String getMonthName() {
		
	}
	}
	
	
	
	public static void main(String[] a) {
		JulianDate d1 = new JulianDate(2016, 2, 29);
		JulianDate d2 = new JulianDate(2016, 3, 1);
		JulianDate d3 = d1.add(1); // tomorrow
		System.out.println(d3);  // 2016 Mar. 1
		JulianDate d4 = d1.add(-1); //yesterday
		JulianDate d5 = d1.add(1.5); //tomorrow noon
		JulianDate d6 = d5.sub(2); // 2 days before d2
		double days = d5.sub(d2);
		System.out.println(d1);  // 2016 Feb. 29
		JulianDate d7 = new JulianDate(2017, 2, 27);
		System.out.println(d7.add(2)); // 2017 Mar. 1
	}
}
