/*
Program 3: Write a program that accepts two integers from user and prints
addition of their Cubes and subtraction of their Squares.

Input: 10 20

Output:
	Addition of 1000 & 8000 is 9000
	Subtraction of 100 & 400 is -300
*/

import java.util.*;

class Demo {
        public static void main(String argv[]){

               Scanner sc  = new Scanner(System.in);

                System.out.print("Input1: ");
                int num1 = sc.nextInt();

                System.out.print("Input2: ");
                int num2 = sc.nextInt();

                int Sum = (num1*num1*num1)+(num2*num2*num2);
                int Sub = (num1*num1)-(num2*num2);

                System.out.println("Addition of "+(num1*num1*num1)+" & "+(num2*num2*num2)+" is "+Sum);
                System.out.println("Subtraction of "+(num1*num1)+" & "+(num2*num2)+" is "+Sub);
        }
}




/*OUTPUT:-
Input1: 10
Input2: 20
Addition of 1000 & 8000 is 9000
Subtraction of 100 & 400 is -300
											*/

