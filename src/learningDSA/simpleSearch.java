package learningDSA;

public class simpleSearch {
	
		
		public static void search(int arr[], int search_Element) {
		int i=0;
		int n=5;
		int flag=0;
		for(i=0;i<=n;i++) 
		{
			if((arr[i])==search_Element) {
				System.out.println("element found at location:"+i);
				flag=1;
				break;
			}
			
			
		}if(flag==0)
		{
			System.out.println("Element not found");
			}
		
	}
		public static void main(String args[]) 
		{
int arr1[]= {0,1,6,7,8,11,13};
int se=8;
search(arr1,se);
		}
	}



