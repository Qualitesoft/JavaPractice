package com.javapractice.classes;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;


import com.google.common.escape.ArrayBasedUnicodeEscaper;

public class ArrayPrograms {

	@Test
	public void compareTwoArray(){

	}

	@Test(enabled=false)
	public void addTwo1DArray(){

		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {11,12,13,14,15,16,17,18,19,20};
		int j=0;
		for(int i=0; i<a.length;i++){
			while(j<b.length){
				System.out.println(a[i]+b[j]);
				j++;
				break;
			}
		}
	}
	
	@Test(enabled=false)
	public void addTwo2DArray(){

		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{12,12,21},{54,54,66},{78,41,56}};
		int c[][] = new int[3][3];
		
		for(int i=0; i<a.length;i++){
			for(int j=0; j<b.length;j++){
				
				c[i][j] = b[i][j]+a[i][j];
				}
			}
		for(int i=0; i<c.length;i++){
			for(int j=0; j<c.length;j++){
				
			System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	@Test(enabled=false)
	public void subTwo2DArray(){

		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{12,12,21},{54,54,66},{78,41,56}};
		int c[][] = new int[3][3];
		
		for(int i=0; i<a.length;i++){
			for(int j=0; j<b.length;j++){
				
				c[i][j] = b[i][j]-a[i][j];
				}
			}
		for(int i=0; i<c.length;i++){
			for(int j=0; j<c.length;j++){
				
			System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		


	@Test(enabled=false)
	public void subtractTwo1DArray(){
		System.out.println();
		int[] a = {11,12,13,14,15,16,17,18,19,20};
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		int j=0;
		for(int i=0; i<a.length;i++){
			while(j<b.length){
				System.out.println(a[i]-b[j]);
				j++;
				break;
			}
		}
	}

	@Test(enabled=false)
	public void multiplication2DTwoArray(){
		int[][] a = {{1,2,3},{4,5,6},{1,2,3}};
		int b[][] = {{4,5,6},{1,5,6},{1,2,3}};
		int c[][] = new int[3][3];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length;j++){
				for(int k=0; k<c.length;k++){
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				
			} 
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length;j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Test(enabled=false)
	public void insertNumber(){
		int n, pos, x;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int ar[] = new int[n+1];

		for(int i=0; i<n; i++){
			ar[i] = s.nextInt();
		}
		System.out.print("Enter the position where you want to insert element:");
		pos = s.nextInt();

		System.out.print("Enter the element you want to insert:");
		x = s.nextInt();

		for(int i=n-1; i>=pos-1;i--){
			ar[i+1] = ar[i];
		}
		ar[pos-1] = x;

		System.out.print("After inserting:");
		for(int i = 0; i < n; i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.print(ar[n]);

	}

	@Test(enabled=false)
	public void deleteNumber(){
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Original Array : "+Arrays.toString(my_array));     
		int removeIndex = 1;
		for(int i = removeIndex; i < my_array.length -1; i++){
			my_array[i] = my_array[i + 1];
		}
		System.out.println("After removing the second element: "+Arrays.toString(my_array));

	}


	@Test(enabled=false)
	public void deleteNumber2(){
		int n, pos, x;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int ar[] = new int[n+1];

		for(int i=0; i<n; i++){
			ar[i] = s.nextInt();
		}
		System.out.print("Enter the position where you want to delete element:");
		pos = s.nextInt();
		for(int i = pos; i < n-1; i++){
			ar[i] = ar[i + 1];
		}
		System.out.println("After deleted the element: "+Arrays.toString(ar));

	}
	@Test(enabled=false)
	public void largestNumberInAnArray(){

		int ar[] = {10,20,30,40,20,52,65,12};
		int max = 0;

		for(int i=0; i<ar.length; i++){

			if(ar[i]>=max){
				max=ar[i];	
			}
		}
		System.out.println(max);

	}

	@Test(enabled=false)
	public void smallestNumberInArray(){
		int ar[] = {10,20,30,40,20,52,65,12};
		int min = 100;

		for(int i=0; i<ar.length; i++){
			if(min>ar[i]){
				min=ar[i];
			}
		}
		System.out.println(min);

	}

	@Test(enabled=false)
	public void largestFirstTwoNumberInAnArray(){
		int ar[] = {54,52,98,21,13,25,45,10,20,10,25,41 ,97};

		int temp = 0;

		for(int i=0; i<ar.length; i++){

			for(int j=i+1; j<ar.length; j++){
				if(ar[i]>ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[ar.length-2]);

	}

	@Test(enabled=false)
	public void arrangeValuesInAccendingOrder(){
		int ar[] = {54,52,98,21,13,25,45,10,20,10,25,41};

		int temp = 0;

		for(int i = 0; i < ar.length; i++){

			for(int j = i + 1; j < ar.length; j++){
				System.out.println(ar[i]);
				System.out.println(ar[j]);
				if(ar[i]>ar[j]){
					temp = ar[i];
					System.out.println(temp);
					ar[i] = ar[j];
					System.out.println(ar[i]);
					ar[j] =temp;


				}
			}
			System.out.print(ar[i] + ",");
		}

		for (int i = 0; i < ar.length-1 ; i++) 
		{
			System.out.print(ar[i] + ",");
		}
		System.out.print(ar[ar.length - 1]);
	}



	@Test(enabled=false)
	public void arrangeValuesInDecendingOrder(){
		int ar[] = {54,52,98,21,0,0,0,0,0,13,25,45,10,20,10,25,41};
		int temp = 0;

		for(int i=0; i<ar.length;i++){
			for(int j=i+1; j<ar.length;j++){
				if(ar[i]<ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			//System.out.print(ar[i] + ",");
		}
		for(int i=0; i<ar.length-1;i++){
			System.out.print(ar[i] + ",");
		}
		System.out.print(ar[ar.length-1]);

	}

	@Test(enabled=false)
	public void sumOfAllValuesOfAnArray(){
		int ar[] = {54,52,98,21,13,25,45,10,20,10,25,41};
		int sum =0;

		for(int i=0; i<ar.length; i++){
			sum = sum + ar[i];
		}
		System.out.println(sum);


	}


	@Test(enabled=false)
	public void scannerClass()
	{
		Scanner scan =new Scanner(System.in);
		String name =scan.nextLine();
		System.out.println(name);
	}
}
