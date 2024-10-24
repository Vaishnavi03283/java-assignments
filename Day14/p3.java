/*Program 3: Write a Program to print Cubes and Squares of
 all Even numbers ranges between given input number.
 Input: 10
 Output:
 Cube of 2 : 8 and Square of 2 : 4
 Cube of 4 : 64 and Square of 4 : 16
 ..
 Cube of 10 : 1000 and Square of 10 : 100			*/


import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();

		for(int i= num1; i<=num2 ; i++){
			System.out.print(i%2 == 0 ? "\n\nCube of "+ i + " : " + i * i :"");
			System.out.print(i%2 == 0 ? "\nSquare of " + i + " : " + i * i * i :"");
		}
	}
}


/*

OUTPUT:-

Enter num1 : 1
Enter num2 : 10


Cube of 2 : 4
Square of 2 : 8

Cube of 4 : 16
Square of 4 : 64

Cube of 6 : 36
Square of 6 : 216

Cube of 8 : 64
Square of 8 : 512

Cube of 10 : 100
Square of 10 : 1000

*/