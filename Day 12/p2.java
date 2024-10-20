/* program 2 : Write a program that accepts two integers from user and prints
 multiplication & Division of them.
 {Note: checks for smaller divisor amongst entered number while computing division}
 Input: 10 20
 Output:
 Multiplication is 200
 Division is 2															*/



import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		Codex chavi = new Codex();
		chavi.multiply(a,b);
		chavi.divide(a,b);
	}
}

class Codex{

	void multiply(int a,int b){
		System.out.println("Multiplication is: "+(a*b));
	}

	void divide(int a,int b){
		System.out.println("Division is: "+(b/a));
	}
}


/*OUTPUT:-
Enter 1st Number
10
Enter 2nd Number
20
Multiplication is: 200
Division is: 2
										*/













