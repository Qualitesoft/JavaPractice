package com.javapractice.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayPart3 {
	@Test(enabled=false)
	public void findMissingNumberFromSeries(){

		int a[] = {1,2,4,5};
		int n =5;
		int sum = 0;
		int val=((n + 1));
		int expSum = (n * val/2);
		for(int i=0; i<a.length;i++){
			sum = sum + a[i];
		}

		int missingNumber = expSum - sum;
		System.out.println(missingNumber);
	}


	@Test(enabled=false)
	public void pairOfNumbersWhoseSumIsEaualsToTheGivenNumber(){
		int a[] = {1,2,3,4,5,5,9,8,7,6,10,0};
		int givenNum = 10;

		for(int i=0; i<a.length;i++){
			for(int j=i+1; j<a.length;j++){
				int sum = a[i] + a[j];
				if(sum == givenNum ){
					System.out.println(a[i] +","+ a[j]);
				}
			}
		}

	}


	@Test(enabled=false)
	public void intersectionOfThreeArray(){
		int[] a = {1, 5, 10, 20, 40, 80,3,4};
		int[] b = {6, 7, 20, 80, 100,4};
		int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

		for(int i =0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				for(int k=0; k<c.length;k++){
					if(a[i]==b[j] && b[j]==c[k] ){
						System.out.println(a[i]);
					}
				}
			}
		}

	}


	/*@Test(enabled=false)
	public void findDublicateNumbers(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};
		int count =0;

		for(int i=0; i<a.length;i++){
			for(int j =i+1; j<a.length; j++){
				if(a[i]!=a[j]){
					continue;
				}
				else if(a[i]==a[j]){
					break;
				}
			}
		}

	}*/


	@Test(enabled=false)
	public void convertArrayToArrayList1(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};

		ArrayList<Integer> ar= new ArrayList<>();

		for(int i =0; i<a.length; i++){
			ar.add(a[i]);
		}

		System.out.println(ar);

		ar.add(321211);
		ar.add(0, 213211);
		System.out.println(ar);

	}

	@Test(enabled=false)
	public void convertArrayToArrayList2(){
		int a[] = {10,20,30,90,54,54,25,27,85,96,-100,121,321,212,121,4,4,45,454,54};

		String[] s = {"Shubham", "Parminder"};

		ArrayList<int[]> ar= new ArrayList<>(Arrays.asList(a));
		ArrayList<String> ar1= new ArrayList<>(Arrays.asList(s));
		System.out.println(ar1); // Print the values
		System.out.println(ar); // Not print the values 
	}


	@Test
	public void convertArrayListToArry(){
		ArrayList<Object> ar = new ArrayList<>();
		Object[] a = new Object[ar.size()];
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);

		a= ar.toArray();
		for(Object i : a){
			System.out.println(i);
		}
	}

	@Test
	public void equalityOfTwoArray(){
		int[] a= {10,20,30,40};
		int[] b= {10,20,30,50};

		boolean flag= true;

		if(a.length==b.length){
			for(int i = 0; i<a.length; i++){
				if(a[i]!=b[i]){
					flag=false;
				}
				else{
					flag=true;
				}
			}

		}
		else{
			flag=false;
		}
		
		if(flag=true){
			System.out.println("Arrays are same");
		}
		else{
			System.out.println("Arrays are not same");
		}

	}



























}
