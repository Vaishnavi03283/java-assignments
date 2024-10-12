class Demo {
	public static void main(String[] args) {
      
        int a = 10;
        int b = 20;
        int c = 30;

        int largest = a;
        int secondLargest = b;

        if (b > largest) {
            secondLargest = largest;
            largest = b;
        } else {
            if (b > secondLargest) {
                secondLargest = b;
            }
        }

        if (c > largest) {
            secondLargest = largest;
            largest = c;
        } else {
            if (c > secondLargest) {
                secondLargest = c;
            }
        }

        System.out.println(secondLargest + " is the second largest");
    }
}





/*OUTPUT:-

20 is the second largest    */
