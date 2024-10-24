/*Program 4: Write a Program to Print following Pattern.

a
A A
a a a 
A A A A
a a a a a 

*/

class Demo{
	public static void main(String [] args){
		for(int i = 0 ; i<5 ; i++){
			for(int j = 0 ; j <= i ; j++){
				if(i%2==1){
					System.out.print("a ");
				}else{
					System.out.print("A ");
				}
			}
			System.out.println();
		}
	}
}



/*

OUTPUT:-        (System.out.print(i % 2 == 0 ? "a " : "A ");) - another method 

A
a a
A A A
a a a a
A A A A A

*/