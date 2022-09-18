public class quickSort{

	public static void quickSort(int[] arr, int low, int high){
		
		int pI; // Pivot Index

		if(low < high){

		pI =  partition(arr,low,high);
		quickSort(arr,low,pI-1);
		quickSort(arr,pI+1,high); 

		}
	}

	public static int partition(int[] arr, int low, int high){

		int pivot = arr[high]; 
		int i = low - 1;

		for(int j = low; j < high; j++){
			if(arr[j] < pivot){
				i++;
				swap(arr, i, j);
			}

		}

		swap(arr, i+1, high);
		return(i+1);
	}

	public static void swap(int[] arr, int i, int j){ 
		// Swaps elements of indices i and j in arr 
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;


	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,4,6,8,1,9};
		quickSort(arr,0,6);

		for(int n : arr){
			System.out.println(n);
		}

	}

	

}