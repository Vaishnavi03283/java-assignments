class Demo{
	public static void main(String [] args){
		for(int i=1;i<=4;i++){

			for(int j=4;j>=1;j--){
				if(i>=j){
					System.out.print(j+" ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}





/*OUTPUT:-

   1
  2 1
 3 2 1
4 3 2 1
