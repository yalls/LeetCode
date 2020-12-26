import java.util.Arrays;

public class SortedSqaures {
	
	
	
	public static void main(String args[]) {
		int a[]= {-4,-1,0,3,10};
		System.out.println(Arrays.toString(findSortedSqaures(a)));
	}

	private static int[] findSortedSqaures(int[] a) {
		int len = a.length;
		int temp[]= new int[len];
		
		//sort
		
		System.out.println("is it sorted"+Arrays.toString(a));
		for(int i =0;i<a.length;i++) {
			temp[i] = a[i]*a[i];
		}
		 Arrays.sort(temp);
		return temp;
		// TODO Auto-generated method stub
		
	}

}
