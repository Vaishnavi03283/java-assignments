class Demo{
	public static void main(String [] args){
		for(int i=1;i<=4;i++){
			char ch1 ='A';
			char ch2 ='a';
			for(int j=4;j>=i;j--){
				if(i%2==1){
					System.out.print(ch1+" ");
					ch1++;
				}else{
					System.out.print(ch2+" ");
					ch2++;
				}
			}
				System.out.println( );	
		}
	}
}



/*OUTPUT:-


A B C D
a b c
A B
a                           */