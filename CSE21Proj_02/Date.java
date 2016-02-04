
public class Date {
	int day; //year: of type int
	int month; //month: of type int
	int year; //year: of type int
	
	public Date() {
		
		month = 1-12;
		day= 1-31;
		year = 1900-3000;
	}
	
	
	//a constructor, which sets the instance variables to their appropriate input parameters (3 inputs)
	public Date (int year, int month, int day){
		if (year >= 1900 && year <= 3000) // range 1900-3000
			this.year = year;
		
		if (month >= 1 && month <= 12) //range 1 to 12 (January is 1)
			this.month = month;
		
		if (day >=1 && day <=31) //in the range 1 to 31 AND appropriate to the month.
			this.day = day;
		
		}
	/*
		public int getYear () {
			int Year = year;
			return Year;
		}
		public int getMonth () {
			int Month = month;
			return Month;
		}
		public int getDay () {
			int Day = day;
			return Day;
	}
	*/
	
	//Accessor methods 
	public int getDay(){
		return day;
	}
	//Accessor methods 
	public int getMonth(){
		return month;
	}
	//Accessor methods 
	public int getYear(){
		return year;
	}
	/*compare(Date dt) method that returns the difference between
	oneself and the Date input parameter, dt.
			Use dayOfYear() to calculate the difference between
			month/day then add 365*years to it. Finally divide the total number of days differential by 30 to approximate the # of months as a difference. 
			If the difference is higher than 60 then should only return 60 as a max value.
	 */
	
	public int dayOfYear(){
		int totalDays = 0;
		 switch (month) {
		 case 12: totalDays += 30;
		 case 11: totalDays += 31;
		 case 10: totalDays += 30;
		 case 9 : totalDays += 31;
		 case 8 : totalDays += 31;
		 case 7 : totalDays += 30;
		 case 6 : totalDays += 31;
		 case 5 : totalDays += 30;
		 case 4 : totalDays += 31;
		 case 3 : totalDays += 28;
		 case 2 : totalDays += 31;
	}
         totalDays += day;
         return totalDays;
	
}
	public int compare(Date dt) {
		int diff = Math.abs((dayOfYear() + 365 * year)-(dt.dayOfYear() + 365 * dt.year));
		
		int numMonths = diff/30;
		
		if (numMonths > 60){
			numMonths = 60;
		}
		
		return numMonths;
	}
	
}
