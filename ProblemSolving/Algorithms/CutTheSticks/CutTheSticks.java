import java.util.*;

public class CutTheSticks{
	
	public static List<Integer> cutTheSticks(List<Integer> arr){
		
		List<Integer> output = new ArrayList<Integer>();

		/* Debug */

		for(int stick : arr){
			System.out.print(stick + " ");
		}
		System.out.println();

		/* Debug */

		while(arr.size() > 0){	

			/* Cut */

			output.add(arr.size());
			List<Integer> temp = new ArrayList<Integer>();
			int min = Collections.min(arr); 

			for(int stick : arr){
				if( stick - min > 0){
					temp.add(stick-min);
					System.out.print(stick-min + " "); /* Debug */
				}
			}

			arr = temp;
			System.out.println(); /* Debug */

			/* Cut */

		}	

		return output;

	}

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		List<Integer> output = cutTheSticks(arr);

		/* Debug */

		for(int x : output){
			System.out.println("OUTPUT: " + x);
		}

		/* Debug */

	}

}