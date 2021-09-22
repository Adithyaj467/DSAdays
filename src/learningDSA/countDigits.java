package learningDSA;

public class countDigits{
	public static int counter(int n) {
		int count=0;
		while (n!=0) {
			n=n/10;
			count=count+1;
			
			
		}
		return count;
	}

	public static void main(String args[]) {
		int a=9237;
		int b=38;
		int c=7;

		System.out.println(counter(a));
		System.out.println(counter(b));
		System.out.println(counter(c));
		
	}
}