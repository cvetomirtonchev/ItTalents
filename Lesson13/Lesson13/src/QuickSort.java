
public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {6,1,8,3,4,9,5};
		printArr(arr);
		quickSort(arr, 0, arr.length-1);
		printArr(arr);
	}
	
	static void printArr(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
		}
		System.out.println("]");
	}

	//find pivot index from start to end
	//call the same method for first half of the array (before pivot)
	//call the same method for second half of the array (after pivot)
	static void quickSort(int[] arr, int start, int end){
		if(start>=end){
			return;
		}
		int pivotIndex = partition(arr, start, end);
		printArr(arr);
		quickSort(arr, start, pivotIndex-1);
		quickSort(arr, pivotIndex+1, end);
	}

	//choose pivot to be the value of the last element
	//initialize variable IDX to hold the index of the next lesser element
	//traverse elements
	//compare pivot with each element. 
	//if element is smaller than pivot - swap with the IDX cell and IDX++
	//at last - swap the pivot cell with IDX cell
	static int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		int idx = start;
		for (int i = start; i < end; i++) {
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[end];
		arr[end] = temp;
		return idx;
	}
}
