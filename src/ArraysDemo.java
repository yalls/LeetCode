
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[6];
		
		String str = "https://tinyurl.com/yalls1";
		System.out.print(str.length());
		int length =0;
		
		for(int i=0;i<3;i++) {
			intArray[length] = i;
			length++;
		}
		
		//printArray(intArray);
		intArray[length]=10;
		length++;
	
		
		for(int i =3;i>=0;i--) {
			intArray[i+1] = intArray[i];
		}
		intArray[0] = 20;
		//printArray(intArray);
		for(int i =4;i>=2;i--) {
			intArray[i+1] = intArray[i];
		}
		intArray[2] = 30;
		//printArray(intArray);
		int arr[] = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		printArray(arr);
	}
	
	  public static void duplicateZeros(int[] arr) {
		     
	        for(int i=0;i<arr.length;i++){
	            
	            if(arr[i]==0){
	                for(int j=arr.length-2;j>=i+1;j--){
	                    arr[j] = arr[j-1];
	                }
	                //arr[i+1] =0;
	                i++;
	            }
	        }
	    }
	  

	private static void printArray(int[] intArray) {
		for(int i =0;i<intArray.length;i++) {
			System.out.println("Index of :"+i+"value contains "+intArray[i] );
		}
	}

}
