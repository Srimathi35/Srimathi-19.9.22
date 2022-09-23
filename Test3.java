package com.ticket.demo;
import java.util.Arrays;
import java.util.Scanner;

		class T3 {
			
			public int  large(int num[], int size) {
				int max =num[0];
				for(int j=0; j<size; j++) {
				
					if (num[j] > max) {
					max = num[j];
					}
				}
				return max;
			 }
				
			public int  small(int num[], int size) {
						int min =num[0];
						for(int j=0; j<size; j++) {
						
							if (num[j] < min) {
							min = num[j];
						
							}
						}
						return min;	
				}
			}

		public class Test3 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter  size of the Array");
				
				int size=sc.nextInt();
				
				int[] num = new int[size];
				
				System.out.println("Please  Enter  "+num.length+"  values."); 
				
				for(int i=0; i<num.length; i++) {
						
						 num[i] = sc.nextInt();
						
						}
						
						System.out.println("The Array is  " +Arrays.toString(num));
						
						System.out.println("\n\nWHICH NUMBER YOU WANT TO FIND MAXIMUM OR MINIMUM ");
						System.out.println("*****************");
						System.out.println("  Press 1 for Maximum \n ");
						System.out.println("  Press 2 for Minimum \n ");
						System.out.println("  Press 3 for Both Maximum ans Minimum \n ");
						
						int i = sc.nextInt();		
						if(i==3)
						{
							System.out.println("\n\nLargest Number in the Array : " + new T3().large(num,size));
				            System.out.println("\nSmallest Number in the Array : " + new T3().small(num, size));
						}
						else if(i==1)
						{
							System.out.println("Largest Number in the Array : " + new T3().large(num,size));
						}
						else if(i==2)
						{
							System.out.println("Smallest Number in the Array : " + new T3().small(num, size));
						}
						else
						{
							System.out.println("This is wrong input Please Enter the correct input");
							
						}
						sc.close();
						}
					

	}


