class LargestNumber {
    public static void main(String[] args) {
        int a = 20, b = 50, c = 40;
        if(a >= b && a >= c) {
            System.out.println(a + " is the largest among all numbers");
        } else if(b >= a && b >= c) {
            System.out.println(b + " is the largest among all numbers");
        } else {
            System.out.println(c + " is the largest among all numbers");
        }
    }
}



OUTPUT:-

50 is the largest among all numbers
