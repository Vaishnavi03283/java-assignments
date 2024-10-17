 class Demo{
	public static void main(String [] args){
		int a =7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a--;
			}
				System.out.println( );
				a++;
		}
	}
}


/*OUTPUT:-


7
7 6
6 5 4
4 3 2 1                           */