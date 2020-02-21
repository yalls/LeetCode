import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,3,5,7,6};
		int n=9;
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(twoSumTarget(input,n)));

	}
	public static int[ ] twoSumTarget(int []arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int [] {i,j};
				}
			}
		}
		return null;
	}

}
