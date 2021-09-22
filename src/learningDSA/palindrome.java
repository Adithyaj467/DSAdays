package learningDSA;



class palindrome{
	public static boolean pali(int n) {
			
		int no=n;
		
		 {int rev=0;
		 int a=0;
		while(n!=0) {
		 a=n%10;
			rev=rev*10+a;
			n=n/10;
			System.out.println(rev);
		 }
		 return (rev==no);
		}	
	}
	
	public static void main(String args[]) {
		int number=373;
		
		System.out.println(pali(number));
	}
	
	
	
	
	
}
