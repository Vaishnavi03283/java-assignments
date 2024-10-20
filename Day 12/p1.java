/* Program 1: Write a program that accepts two integers from user and prints
 addition & Subtraction of them.
 {Note: checks for greater number to subtracts with while subtracting numbers}
 Input: 10 20
 Output:
 Addition is 20
 Subtraction is 10
 															*/



import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number ");
		int b = sc.nextInt();
		Codex chavi = new Codex();
		chavi.add(a,b);
		chavi.sub(a,b);
	}
}

class Codex{
	
	void add(int a,int b){
		System.out.println("Addition is: "+(a+b));
	}

	void sub(int a,int b){
		System.out.println("Substraction is: "+(b-a));
	}
}



/*OUTPUT:-
Enter 1st Number
10
Enter 2nd Number
20
Addition is: 30
Substraction is: 10
									*/




















