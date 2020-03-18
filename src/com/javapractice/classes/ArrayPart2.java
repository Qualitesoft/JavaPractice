package com.javapractice.classes;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayPart2 {
	@Test(enabled=false)
	public void test1(){

		int a[][] = new int[10][10];

		for(int j=0; j<10;j++){
			for(int i=0; i<10;i++){
				System.out.printf("%2d", a[i][j]);
			}
			System.out.println("");
		}
	}


	@Test(enabled=false)
	public void averageOfArrayElements(){
		int a[] = {10,20,30,90,-100};
		int sum = 0;

		for(int i=0; i<a.length;i++){
			sum = sum + a[i];
		}
		System.out.println(sum);

		int avg = sum / a.length;
		System.out.println(avg);
	}


	@Test(enabled=false)
	public void containsValueOrNot(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100};
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value");
		int expected = s.nextInt();
		for(int i=0; i<a.length;i++){
			int val = a[i];
			if(val==expected){
				System.out.println(i + " Value is present");
				break;
			}
			else{
				System.out.println(i + " Value Not present");
			}
		}
	}
	
	
	
	@Test(enabled=false)
	public void findIndexOfAnElementInArray(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100};
		System.out.println("Original Array : "+ Arrays.toString(a));    
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value");
		int expected = s.nextInt();
		
		for(int i=0; i<a.length;i++){
			if(a[i]==expected){
				System.out.println(i+1);
			}
		}
	}
	
	
	@Test(enabled=false)
	public void cloneAnArray(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		int b[] = new int[a.length];
		System.out.println("Source Array : "+Arrays.toString(a));     
		for(int i=0; i<a.length;i++){
			b[i] = a[i];
		}
		System.out.println("New Array : "+Arrays.toString(b));     
	}
	
	@Test(enabled=false)
	public void reverseOfAnArray(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		int b[] = new int[a.length];
		System.out.println("Source Array : "+Arrays.toString(a));     
		for(int i=a.length-1; i>0;i--){
			b[i] = a[i];
			System.out.print(b[i] + ",");
		}
		System.out.print(a[0]);
		
	}
	
	@Test(enabled=true)
	public void findDublicateNumbers(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		int count =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value");
		int val = s.nextInt();
		
		for(int i=0; i<a.length;i++){
			if(a[i]==val){
				count++;
			}
		}
		System.out.println(count);
	}
	
	/*@Test(enabled=false)
	public void findDublicateNames(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		int count =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value");
		int val = s.nextInt();
		
		for(int i=0; i<a.length;i++){
			if(a[i]==val){
				count++;
			}
		}
		System.out.println(count);
	}*/
	
	@Test(enabled=false)
	public void sortOfAnArrayInAccendingOrder(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		Arrays.sort(a);
		for(int i=0; i<a.length-1;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println(a[a.length-1]);
	}
	
	@Test(enabled=false)
	public void commonInAnTwoArrayORIntersection(){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {11,12,13,14,15,16,17,18,19,20,1,2,3,4,5};
		
		for(int i=0; i<a.length;i++){
			for(int j=0; j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println("Common element is " +b[j]);
				
				}
			}
		}		
	}
	
	@Test(enabled=false)
	public void commonString(){
		String[] a = {"C", "C++", "C#", "JAVA", "SQL", "ORACLE"};

		String[] b = {"MySQL", "SQL", "Android", "ORACLE", "PostgreSQL", "DB2", "JAVA"};
		
		for(int i=0; i<a.length;i++){
			for(int j=0; j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println("Common element is " +b[j]);
				}
			}
		}		
	}
	
	@Test(enabled=false)
	public void differenceBetweenMaxAndMin(){
		int[] a = {12,15,85,74,62,15,48,63,100,52,};
		 Arrays.sort(a);
		for(int i=0; i<a.length;){
			System.out.println(a[a.length-1]-a[0]);
			break;
		}
		
	}
	
	
	@Test(enabled=false)
	public void writeArrayUsingScanner(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[][] = new int[n][n];
		
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				System.out.println(a[i][j]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
