package com.javapractice.classes;

import org.testng.annotations.Test;

public class ArrayConcept {

	@Test
	public void array1(){

		int[][] numbers = new int[3][2];
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[1][0] = 30;
		numbers[1][1] = 40;
		numbers[2][0] = 50;
		numbers[2][1] = 60;

		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(" ");
		}

		/*
		10 20  
		30 40  
		50 60  
		 */
		System.out.println("**************************************");
	}


	@Test
	public void array2(){

		int[][] numbers = { {10,20}, {30,40}, {50,60}};
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(" ");
		}
		/*	
	 	Columns
		10  20
Rows	30  40
		50  60
		 */
		System.out.println("**************************************");
	}

	@Test
	public void array3(){

		int[][] numbers = new int[2][];
		// Above number of rows are fixed but the columns can be different
		numbers[0] = new int[2];
		numbers[1] = new int[3];

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[1][0] = 30;
		numbers[1][1] = 40;
		numbers[1][2] = 50;


		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(" ");
		}		

		System.out.println("**************************************");
		//System.out.println(null);
	}


	@Test
	public void array4(){
		int[][] numbers = {
				{1, 2, 3}, 
				{4, 5, 6, 9}, 
				{7}, 
		};

		System.out.println("Length of row 1: " + numbers[0].length);
		System.out.println("Length of row 2: " + numbers[1].length);
		System.out.println("Length of row 3: " + numbers[2].length);

		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(" ");
		}	
		System.out.println("**************************************");
	}
}
