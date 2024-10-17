/*Program 2: Write a Program to print cube of first 20 numbers.
 Output:
 Cube of 1: 1
 Cube of 2: 8
 Cube of 3: 27
 .
 .
 .
 Cube of 20: 8000                                     */




class Cube{
	public static void main(String [] args){
		
		for(int i = 1; i<= 20 ; i++){
			
			System.out.printf("Cube of %d is %d  ",i , i*i*i);
			System.out.println( );
		}
	}
}



/*OUTPUT:-



Cube of 1 is 1
Cube of 2 is 8
Cube of 3 is 27
Cube of 4 is 64
Cube of 5 is 125
Cube of 6 is 216
Cube of 7 is 343
Cube of 8 is 512
Cube of 9 is 729
Cube of 10 is 1000
Cube of 11 is 1331
Cube of 12 is 1728
Cube of 13 is 2197
Cube of 14 is 2744
Cube of 15 is 3375
Cube of 16 is 4096
Cube of 17 is 4913
Cube of 18 is 5832
Cube of 19 is 6859
Cube of 20 is 8000                                         */