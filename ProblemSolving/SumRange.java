import java.util.*;

public class SumRange{

public static int sumRange(List<Integer> s, int i, int j){

/*
 * Returns the sum of all integers from index i to index j,
 * within list s
 *
 * Returns -1 if i or j are outwith the bounds of s
 *
 */

	if(i<0 || j>s.size()-1){
		return -1;
	}

	int sum = 0;

	for(int x = i; x <= j; x++){
		sum += s.get(x);
	}

	return sum;

}

public static void main(String[] args) {
	
	// Example: sum [1,2,3,4,5] from index 1 to 3 
	// Answer: 9

	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);

	System.out.println(sumRange(list,1,3));

}


}