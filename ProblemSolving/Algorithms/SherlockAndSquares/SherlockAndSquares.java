public class SherlockAndSquares{

	public static void main(String[] args) {
		
		System.out.println(squares(3,3));

	}

	public static int squares(int a, int b) {
   
   		int count = 0;
   		int smallestSquare = (int)Math.ceil(Math.sqrt(a));
   		
   		while(Math.pow(smallestSquare,2) <= b){
   			count++;
   			smallestSquare++;
   		}

   		return count;

    }

}