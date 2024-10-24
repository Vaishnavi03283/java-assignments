/*Program 1: Write a Program to print series of odd numbers
 ranging between two numbers entered by user.
 Input:
 Min of Series : 4
 Max of Series: 60
 Output: Series Of Odd Numbers Ranging between 4 & 60
 is:
 5, 7, 9, . . ., 59
*/



import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Min of series : ");
		int num1 = sc.nextInt();

		System.out.print("Max of series : ");
		int num2 = sc.nextInt();
		
		System.out.print("Series Of Odd Numbers Ranging between 4 & 60 is: ");
		System.out.println();
		for(int i= num1 ; i<=num2 ; i++){
			System.out.print(i % 2 == 1 ? i + " " : " " );
		}
	}
}



/*OUTPUT:- 

Min of series : 4
Max of series : 60
Series Of Odd Numbers Ranging between 4 & 60 is:
 5  7  9  11  13  15  17  19  21  23  25  27  29  31  33  35  37  39  41  43  45  47  49  51  53  55  57  59

*/









