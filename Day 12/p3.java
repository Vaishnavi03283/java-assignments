/*Program 3: Write a program that accepts two integers from user and prints addition of their 
Cubes and subtraction of their Squares.
 Input: 10 20
 Output:
 Addition of 1000 & 8000 is 9000
 Subtraction of 100 & 400 is -300
	

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner();
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		Codex chavi = new Codex();
		chavi.add(a,b);
		chavi.sub(a,b);
	}
}	

class Codex{
	void add(int a,int b){
		System.out.println("Addition of "+(a^3)"&"+(b^3)"is"+((a^3)+(b^3)));
	}

	void sub(int a,int b){
		System.out.println("Substraction of "+(a^2)"&"+(b^2)"is"+((a^2)-(b^2)));
	}
}








														*/