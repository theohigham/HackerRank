import java.util.*;

public class BeautifulTriplets {

	public static int beautifulTriplets(int d, List<Integer> arr) {
    
    	int output = 0;
    	
    	int j;
    	int k;

    	for (int i = 0; i < arr.size()-3; i++) {

    		j = i + 1;
    		k = j + 1;

    		// if (beautifulTriplet(d, arr, low, high)) {
    		// 	output++;
    		// }

    	}

    	return output;

    }

    public static boolean beautifulTriplet(int d, int i,int j, int k, List<Integer> arr) {


    	return arr.get(j) - arr.get(i) == arr.get(k) - arr.get(j) && arr.get(j) - arr.get(i) == d && arr.get(k) - arr.get(j) == d;

    }

	public static void main(String[] args) {

		// d = 1, arr = [2,2,3,4,5]
		int d = 1;
		List<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		boolean output = beautifulTriplet(d,0,2,3,arr);
		System.out.println("Output: " + output);
		
	}


}