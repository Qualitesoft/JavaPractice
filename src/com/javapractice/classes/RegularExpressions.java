package com.javapractice.classes;

import org.testng.annotations.Test;

public class RegularExpressions {

	@Test
	public void regularExpression(){
		String text = "Your Login Credentials are Email: seleniumndqmz@yopmail.com Password: 6346034";

		System.out.println(text.replaceAll("\\d", ""));
				
		System.out.println(text.replaceAll("\\D", ""));
		//OR
		System.out.println(text.replaceAll("[^0-9]", ""));

		// Replace all spaces between the words
		System.out.println(text.replaceAll("\\s", ""));
		System.out.println(text.replaceAll("\\S", ""));

		System.out.println(text.replaceAll("\\w", ""));
		System.out.println(text.replaceAll("\\W", ""));

		System.out.println(text.replaceAll("\\b", ""));
		System.out.println(text.replaceAll("\\B", ""));

		System.out.println(text.replaceAll("\\.", ""));
		
		System.out.println(text.replaceAll("%", ""));


	}
}
