import java.util.*;

public class EqualizeTheArray {

	public static int equalizeArray(List<Integer> arr) {

		int output = 0;
		int mostFrequentElement = findMostFrequent(arr);

		for (int x : arr) {
			if (x != mostFrequentElement) {
				output++;
			}
		}

		return output;

	}

	public static int findMostFrequent(List<Integer> arr) {

		int output = arr.get(1);
		HashMap<Integer, Integer> map = new HashMap<>();

		// Count element frequencies
		for (int x : arr) {
			Integer count = map.get(x);
			map.put(x, count == null ? 1 : count + 1);
		}

		// Find the most frequent element
		for (int key : map.keySet()){
			if (map.get(key) > map.get(output)) {
				output = key;
			}
		}

		return output;

	}

	public static void main(String[] args) {
		// [1,2,2,3]
		// Output = 2

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);

		System.out.println(equalizeArray(arr));


	}

}