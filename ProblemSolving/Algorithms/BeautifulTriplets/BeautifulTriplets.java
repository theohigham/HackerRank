import java.util.*;

public class BeautifulTriplets {

	public static int beautifulTriplets(int d, List<Integer> arr) {
    
  		int output = 0;

  		for (int x : arr) {
  			if (arr.contains(x+d) && arr.contains(x+d+d)) {
  				output++;
  			}
  		}

  		return output;

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

		int output = beautifulTriplets(d,arr);
		System.out.println("Output: " + output);
		
	}


}