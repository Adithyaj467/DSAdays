package learningDSA;

public class Factor {

	public static int f(int a) {
		for(int i=1;i<=a;i++) 
			if(a%i==0)
		{
				System.out.println(i);
				
			
		}
		
		return 0;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=10;
		f(a);
		f(b);
		System.out.println(" sepp");
		//System.out.println(f(b));
		

	}

}
