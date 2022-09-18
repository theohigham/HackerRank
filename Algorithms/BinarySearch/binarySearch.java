public class binarySearch{

	public static int binarySearch(int[] arr, int x, int n){
		/*  
		 * Given a sorted array arr of n integers, 
		 *	returns the index of x within arr
		 * If x is not within arr, returns -1
		 *
		*/ 

		int low = 0;
		int high = n - 1;
		int guess;

		while(low <= high){ // Repeat until low == high
			guess = (low + high) / 2;

			if(arr[guess] == x){
				return guess; // x is found at position of guess
			}

			else if(arr[guess] < x){
				low = guess + 1;
			}

			else{
				high = guess - 1;
			} 

		}

		return -1; // x not found

	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr,20,7));

	}

}