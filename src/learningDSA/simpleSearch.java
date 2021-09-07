package learningDSA;

public class simpleSearch {
	
		
		public static void search(int arr[], int search_Element) {
		int i=0;
		int n=arr.length;
		int flag=0;
		System.out.println("the length of the array is:"+n);
		for(i=0;i<=n;i++) 
		{
			if((arr[i])==search_Element) {
				System.out.println("element found at location:"+i);
				flag=1;
				System.out.println("this shows the array location starts from 0");
				break;
			}
			
			
		}if(flag==0)
		{
			System.out.println("Element not found");
			}
		
	}
		public static void main(String args[]) 
		{
int arr1[]= {0,1,6,7,8,11,13,2,5,99,101,110,3};
int se=3;
search(arr1,se);
		}
	}



