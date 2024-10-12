class Demo {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int columns = 4; // Number of columns
        int startNum = 1; // Starting number

        for (int i = 0; i < rows; i++) {
            int currentNum = startNum;
            for (int j = 0; j < columns; j++) {
                System.out.print(currentNum + " ");
                currentNum += 2;
            }
            System.out.println();
            startNum += 2; // Increment the starting number for the next row
        }
    }
}




/*OUTPUT:-

1 3 5 7
3 5 7 9
5 7 9 11      */
