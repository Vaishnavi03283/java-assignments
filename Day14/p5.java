/*Program 5: Write a Program that accepts Two integers from
 user and prints maximum number from them.
 Input: 56 99
 Output: The Maximum number amongst 56 & 99 is 99*/



import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();

		System.out.println(num2 > num1 ? "The Maximum number amongst "+ num1 + " & " + num2 + " is :  " + num2 : "");
		System.out.println(num1 > num2 ? "The Minimum number amongst "+ num1 + " & " + num2 + " is :  " + num1 : "");
		
	}
}


/*

OUTPUT:-

Enter num1 : 56
Enter num2 : 99
The Maximum number amongst 56 & 99 is :  99

Enter num1 : 99
Enter num2 : 56
The Minimum number amongst 99 & 56 is :  99

*/