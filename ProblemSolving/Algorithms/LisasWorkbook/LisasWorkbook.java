import java.util.*;

public class LisasWorkbook {

	public static int workbook(int n, int k, List<Integer> arr) {
		int count = 0;
		int page = 1;

		System.out.println("k: " + k);

		for (int cN : arr) { // number of problems per Chapter

			System.out.println("cN: " + cN);

			int pP = 1; // Problem index per page
		
			for (int pN = 1; pN <= cN; pN++) {

				if (pP > k) {
					page++;
					pP = 1;
				}

				if (pN == page) {
					count ++;
				}

				System.out.println("Page: " + page);
				System.out.println("pN: " + pN);
				System.out.println("count: " + count);

				pP++;

			}

			page++;
			pP = 1;

		}

		return count;
    }

    public static void main(String[] args) {
    	int n = 1;
    	int k = 1;

    	List<Integer> arr = new ArrayList<>();
    	arr.add(100);

    	System.out.println(workbook(n,k,arr));
    }


}