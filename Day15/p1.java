/*
 Program 1: Write a Program to print series of Even numbers ranging between two 
numbers entered by user.
 Input:
 Min of Series : 4
 Max of Series: 60
 Output: Series Of Even Numbers Ranging between 4 & 60 is:
 4, 6, 8, . . ., 60

*/

import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Min of Series : ");
		int num1 = sc.nextInt();

		System.out.print("Max of series : ");
		int num2 = sc.nextInt();
		
		System.out.print("Series Of Even Numbers Ranging between 4 & 60 is : ");
		System.out.println();
		for(int i =num1 ; i<= num2 ; i++){
			System.out.print(i % 2 == 0 ? i + " " : " " );
		}
	}
}


/*

OUTPUT:-

Min of Series : 4
Max of series : 60
Series Of Even Numbers Ranging between 4 & 60 is :
4  6  8  10  12  14  16  18  20  22  24  26  28  30  32  34  36  38  40  42  44  46  48  50  52  54  56  58  60

*/




















