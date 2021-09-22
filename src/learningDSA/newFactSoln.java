package learningDSA;
class newFactSoln{
	public static int fact(int n) {
	int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[]) {
		int a=15;
		System.out.println(fact(a));
	}
	
	
	
	
}