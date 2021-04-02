package singleDimensionalArray;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age[]; //declaring an array
		//age=new int[4]; //Allocating size of an array
		//int Age[]=new int [4];//declaring and allocating size
		//int marks[]= {10,29,4,9}; //declaring and initializing an array
		
		int i,j;
		int sum=0;
		float average;
		int array[]=new int[4];
		

		
		for(i=0;i<4;i++) 
		{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the array "+(i+1)+" for index "+i);
		array[i]= sc.nextInt();
		sum=sum+array[i];
		sc.close();
		}
		
		
		for(j=0;j<4;j++)
		{
		System.out.println("The array is "+array[j]);
		}
		System.out.println("the sum is "+sum);
		average=sum/array.length;
		System.out.println("The average is "+average);
		

	}

}


