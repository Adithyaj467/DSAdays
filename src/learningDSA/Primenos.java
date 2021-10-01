
package learningDSA;


public class Primenos {

	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				count=count+1;
			}
		}
		if (count<=2) 
			return true;
		return false;
		
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=100;a++) {
		System.out.println(a+" number is prime number: "+isPrime(a));
		}

	}

}
