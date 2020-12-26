
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[6];
		int length =0;
		
		System.out.println(intArray.length);
		for(int i=0;i<3;i++) {
			intArray[length] = i;
			length++;
		}
		intArray[length]=10;
		length++;
		
		//inserttatt the start of an array
		//int starof[] = new
		
		 insertAtBeginigOfArray(intArray,length-1);
		 insertAtIndex(intArray,4);
		 printArray(intArray);
		
	}
	private static int[] insertAtIndex(int[] arr, int n) {
		
		for(int i=n;i>=2;i--) {
			arr[i+1]= arr[i];
		}
		arr[2]=30;
		return arr;
		
	}
	public static int [] insertAtBeginigOfArray(int arr[],int index) {
		
		for(int i = index;i>=0;i--) {
			arr[i+1] = arr[i];
		}
		arr[0]=20;
		//printArray(arr);
		return arr;
		
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("index i "+i+"contains 	"+arr[i]);
		}
	}

}
