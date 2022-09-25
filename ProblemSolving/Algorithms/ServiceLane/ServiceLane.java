import java.util.*;

// *NOTE* There is an error in the HackerRank problem statement
// Change method serviceLane input parameter int n to List<Integer> width
// In the code editor for Java 7, change line 82 to: List<Integer> result = Result.serviceLane(width, cases);

public class ServiceLane {

	public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {

		List<Integer> output = new ArrayList<>();

		for (List<Integer> case_ : cases) {

			int min = Integer.MAX_VALUE;
			for (int i = case_.get(0) ;i <= case_.get(1); i++ ) {

				int x = width.get(i);
				
				if (x < min) {
					min = x;
				}

			}

			output.add(min);

		}

		return output;

    }

    public static void main(String[] args) {
    	
		// width = [2, 3, 1, 2, 3, 2, 3, 3]
		List<Integer> width = new ArrayList<>();
		width.add(2);
		width.add(3);
		width.add(1);
		width.add(2);
		width.add(3);
		width.add(2);
		width.add(3);
		width.add(3);

    	// cases = cases = [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]
    	List<Integer> case1 = new ArrayList<>();
    	case1.add(0);
    	case1.add(3);

    	List<Integer> case2 = new ArrayList<>();
    	case2.add(4);
    	case2.add(6);

    	List<Integer> case3 = new ArrayList<>();
    	case3.add(6);
    	case3.add(7);

    	List<Integer> case4 = new ArrayList<>();
    	case4.add(3);
    	case4.add(5);

    	List<Integer> case5 = new ArrayList<>();
    	case5.add(0);
    	case5.add(7);

    	List<List<Integer>> cases = new ArrayList<>();
    	cases.add(case1);
    	cases.add(case2);
    	cases.add(case3);
    	cases.add(case4);
    	cases.add(case5);

    	List<Integer> output = new ArrayList<>();
    	output = serviceLane(width,cases);

    	for (int o : output) {
    		System.out.println(o);
    	}

    }

}