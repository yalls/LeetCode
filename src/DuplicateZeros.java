import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		
		System.out.print(Arrays.toString(arr));
		//[1,0,0,2,3,0,0,4]
	}
	
	public static void duplicateZeros(int[] arr) {
	     
	      int zeros = 0;
	      
	      for(int num: arr	) {
	    	  if(num==0) {
	    		  zeros++;
	    	  }
	      }
	      
	      int i = arr.length-1, j = arr.length+zeros-1;
	      
	      while(i!=j) {
	    	  insert(arr,i,j--);
	    	  if(arr[i]==0) {
	    		  insert(arr,i,j--);  
	    	  }
	    	i--;  
	      }
    }

	private static void insert(int[] arr, int i, int j) {
		
		if(j<arr.length) {
			arr[j] = arr[i];
		}
		//System.out.print(Arrays.toString(arr));
	}
	

}
