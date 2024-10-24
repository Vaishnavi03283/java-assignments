/*
Program 2: Write a Program which accepts two integers from user and swaps
their insertion order.
Input : 20 30
Output :
Before Swap : 20 30
After Swap : 30 20
*/



import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();

		System.out.println("Before Swap : "+ num1 +" "+num2);

		num1 = num1 + num2;  //num1=20+30=50
		num2 = num1 - num2;  //num2=50-30=20
		num1 = num1 - num2;  //num1=50-20=30

		System.out.println("After Swap : "+ num1+" "+num2);		
	}
}



/*
OUTPUT:-

Enter num1 : 20
Enter num2 : 30
Before Swap : 20 30
After Swap : 30 20


*/



















