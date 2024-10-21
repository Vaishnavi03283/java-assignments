/*
Program 4: Write a Program to simulate simple calculator. Accept two integers
	   from user and sign of operation to perform.

Input:
	Enter First Number: 10
	Enter Second Number: 20
	Enter the sign of Operation: +

Output: Addition of 10 & 20 is 30.
*/

import java.util.*;

class Demo {

	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int F_Num = sc.nextInt();

		System.out.print("Enter Second Number : ");
		int S_Num = sc.nextInt();

		System.out.print("Enter the sign of operator: ");
		char sign = sc.next().charAt(0);

		switch(sign) {
		
			case '+': System.out.println("Addition of "+F_Num+" & "+S_Num+" is "+(F_Num+S_Num));
				  break;

			case '-': System.out.println("Subtraction of "+F_Num+" & "+S_Num+" is "+(F_Num>S_Num?F_Num-S_Num:S_Num-F_Num));
                                  break;

			case '/': System.out.println("Division of "+F_Num+" & "+S_Num+" is "+(F_Num>S_Num?F_Num/S_Num:S_Num/F_Num));
                                  break;

			case '*': System.out.println("Multiplication of "+F_Num+" & "+S_Num+" is "+(F_Num*S_Num));
                                  break;

			default: System.out.println("Enter Valid Sign");
		}
	}
}



/*OUTPUT:-
Enter First Number : 10
Enter Second Number : 20
Enter the sign of operator: +
Addition of 10 & 20 is 30

*/