package learningDSA;
class factorial{
	public static int fact(int n) {
		int a=n*(n-1);// n!
		for(int i=2;i<n;i++) {
			a=a*(n-i); // n*(n-r) factorial
		}
		return a;
	}
	public static void main(String args[]) {
		int n=12;
		System.out.println(fact(n));
	}
}