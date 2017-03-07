

	public class asd {
		public static void main(String[] args) {
			int arr[] = {4,5,6,4,5};
			int sum = 0;
			double result = arr_sum(arr, arr.length-1, 0);
			System.out.println(result);
			
	
		}
		static double arr_sum( int arr[], int n, double sum )
		{ // must be recursive

		    if (n < 0) {
		         return sum;
		    } else {
		         sum += arr[n];
		         
		    }
		    arr_sum(arr, --n, sum);
		    return sum/arr.length;
		}
		static double avarage (int[] arr){
			double sum = 0;
			double avarage1 =arr_sum(arr,arr.length-1,0);
			return avarage1/arr.length;
			
		}
		
	}
