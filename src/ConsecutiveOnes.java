
public class ConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsecutiveOnes obj = new ConsecutiveOnes();
		
		int nums[] = {0,1,1,1,0,1};
		System.out.println(obj.findConsecutiveOnes(nums));

	}
	//
	private int findConsecutiveOnes(int[] nums) {
		
		int max = 0;
		int count = 0;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
				max = max>count?max : count;
			}else if(nums[i]==0) {
				count =0;
			}
		}
		System.out.println("count value "+count);
		System.out.println("max value "+max);
		return max;
		
	}

}
