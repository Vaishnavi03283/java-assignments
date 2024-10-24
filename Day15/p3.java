/*
Program 3: Write a Program to calculate Velocity of particle in the space having
 Distance & Time Entered By User.
 Input:
 Distance: 100m
 Time: 20sec
 Output: The Velocity of a Particle roaming In space is 5m/s

*/


import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Distance : ");
		int num1 = sc.nextInt();

		System.out.print("Time : ");
		int num2 = sc.nextInt();

		System.out.println("The Velocity of a Particle roaming In space is " + (num1/num2) + " m/s" );
	}
}



/*
OUTPUT:-

Distance : 100
Time : 20
The Velocity of a Particle roaming In space is 5 m/s



*/



