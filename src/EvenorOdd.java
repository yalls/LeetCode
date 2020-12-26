
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int nums[]= {12,345,2,6,7896};
		
		/*Output: 2
		Explanation: 
		12 contains 2 digits (even number of digits). 
		345 contains 3 digits (odd number of digits). 
		2 contains 1 digit (odd number of digits). 
		6 contains 1 digit (odd number of digits). 
		7896 contains 4 digits (even number of digits). 
		Therefore only 12 and 7896 contain an even number of digits.*/
		
		System.out.println("number of evenr : "+findNumbers1(n));

	}

	private static int findNumbers1(int num) {
		// TODO Auto-generated method stub
		int count =0;
		while(num !=0) {
			num = num/10;
			System.out.println("the n after devide"+num);
			++count;
		}
		return count;
	}	

	private static int findNumbers(int[] nums) {
		// TODO Auto-generated method stub
		int count =0;
		for(int num:nums) {
			int n = num;
			String str = Integer.toString(n);
			if(str.length() %2==0) {
				count++;
			}
		}
		return count;
	}

	

}
