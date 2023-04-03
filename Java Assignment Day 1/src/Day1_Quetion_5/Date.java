package Day1_Quetion_5;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}

	/*public Date(int day, int month, int year) {
		if(isValidDate(day,month,year))
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else
		{
			System.out.println("Invalid Date...");
			this.day = 1;
			this.month = 1;
			this.year = 2000;
		}
	}
*/
	public Date(int day2, int month2, int year2) {
		// TODO Auto-generated constructor stub
		if(isValidDate(day,month,year))
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else
		{
			System.out.println("Invalid Date...");
			this.day = 1;
			this.month = 1;
			this.year = 2000;
		}
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(isValidDate(day,this.month,this.year))
		{
			this.day = day;
		}
		else
		{
			System.out.println("Invalid day....");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
		
		if(isValidDate(this.day,month,this.year))
		{
			this.month = month;
		}
		else
		{
			System.out.println("Invalid month....");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(isValidDate(this.day,this.month,year))
		{
			this.year = year;
		}
		else
		{
			System.out.println("Invalid year....");
		}	
	}
	
	public boolean isValidDate(int day,int month,int year)
	{
		if(year<0)
		{
			return false;
		}
		if(month<1 || month>12 )
		{
			return false;
		}
		
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        if (day < 1 || day > daysInMonth[month-1]) {
            return false;
        }
        
        return true;
	}
	
	 public Date addDays(int days) {
	        Date newDate = new Date(this.day, this.month, this.year);
	        
	        for (int i = 0; i < days; i++) {
	            newDate.day++;
	            
	            if (newDate.day > daysInMonth(newDate.month, newDate.year)) {
	                newDate.day = 1;
	                newDate.month++;
	                
	                if (newDate.month > 12) {
	                    newDate.month = 1;
	                    newDate.year++;
	                }
	            }
	        }
	        
	        return newDate;
	    }
	 private int daysInMonth(int month, int year) {
	        switch (month) {
	            case 2:
	                if (isLeapYear(year)) {
	                    return 29;
	                } else {
	                    return 28;
	                }
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                return 30;
	            default:
	                return 31;
	        }
	    }
	 private boolean isLeapYear(int year) {
	        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	            return true;
	        } 
	        else 
	        {
	            return false;
	        }
	    }
	 public String toString() {
	        return day + "/" + month + "/" + year;
	    }

}
