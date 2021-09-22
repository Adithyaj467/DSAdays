/**
 * 
 */
package learningDSA;

/**
 * @author Athi
 *
 */
public class Recursivefact {
	public static int recursivefactorialSoln(int n) {
		if(n<=0)
			return 1;
		return n*recursivefactorialSoln(n-1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(recursivefactorialSoln(a));

	}

}
