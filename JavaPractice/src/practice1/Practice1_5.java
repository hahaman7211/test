package practice1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice1_5
{
	public static void main(String[] args) throws ParseException
	{
		Practice1_5 test = new Practice1_5();	
		
		Date date = test.ComputationDate("2020-02-17", 10);	
		System.out.println(date);
		
		Calendar calendar2 = Calendar.getInstance();
		//System.out.println(calendar2);
		Date date2 = calendar2.getTime();
		
		System.out.println(date2);
		
	}
	
	
	public Date ComputationDate(String date, int dateNum) throws ParseException
	{
		//String[] str = date.split("\\D");
		//String newStr = str[0] + "/" + str[1] + "/" + str[2];
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//translate to date from string
		Date theDate = dateFormat.parse(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(theDate);
		calendar.add(Calendar.DAY_OF_MONTH, dateNum);
		
		Date newDate = calendar.getTime();
		
		System.out.println(theDate);
		System.out.println(newDate);
		
		return newDate;
		
	}

}
