
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,7,9,13,21,44,56,123};
		int x = 345345;
		int index = binarySearch(arr, x, 0, arr.length-1);
		System.out.println(index);
		
	}
	//find midindex
	//compare x with element on midindex
	//if x == arr[midindex] - return the midindex
	//if not:
	//if x > arr[midindex] - call the same method with new start = midindex+1 and new end = old end
	//if x < arr[midindex] - call the same method with new start = old start and new end = midindex-1
		
	static int binarySearch(int[] arr, int x, int start, int end){
		if(start > end){
			return -1;
		}
		int midIndex = (start+end)/2;
		if(x == arr[midIndex]){
			return midIndex;
		}
		if(x > arr[midIndex]){
			return binarySearch(arr, x, midIndex+1, end);
		}
		return binarySearch(arr, x, start, midIndex-1);
	}
}
