package learningDSA;

public class sumOfn {
	
	public static void summation(int n) {
		int temp=0;
		for(int i=1;i<=n;i++) {
			temp=temp+i;
			
		}
		System.out.println("the sum of first n natural numbers is: "+temp);
		
	}
	public static void main(String args[]) {
		//please specify n here and dont bother with scanner
		int n=100;
		summation(n);
	}
	
	
	
	
	
	
}