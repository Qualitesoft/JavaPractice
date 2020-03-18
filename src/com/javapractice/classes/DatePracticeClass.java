package com.javapractice.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DatePracticeClass {

	@Test
	public void dateClass(){
		
		Date date= new Date();
		System.out.println(date); //Mon Feb 24 10:06:47 IST 2020
			
	}
	
	@Test
	public void simpleDateFormatterClass(){
		Date date= new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy.mm.dd_hh:mm:ss a z D E F w W");
		System.out.println(sdf.format(date)); //2020.25.24_10:25:09 AM IST 55 Mon 4
		
		
		/*h	Hour in A.M./P.M. (1~12)
		H	Hour in day (0~23)
		a	A.M./P.M. marker	
		z time zone IST
		D Counting of Day from January 1  31+24 = 55
		E Day in week, i.e today is Monday
		F Represent number of a day in week repeat in month
		w week in an year
		W week in month
		*/
		
		
	}
}
