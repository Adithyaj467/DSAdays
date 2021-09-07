package learningDSA;

public class swap{
	
	public static void swapper(int a, int b) {
		System.out.println("the values are before swapping of A,B "+a+" and "+b);
		
		// logic common sense ;-)
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the values are after swapping A,B "+a+" and "+b);
		
		
		
	} 
	
	public static void main(String args[]) {
		int x=100;
		int y=200;
		swapper(x,y);
	}
	
	
}