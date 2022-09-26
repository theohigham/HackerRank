public class ChocolateFeast{ 

	public static int chocolateFeast(int n, int c, int m) {
    
    	// n is budget
    	// c is chocolate price
    	// m is wrappers exchange rate
    	// return total number of chocolates obtained

    	return (n/c) + ( (n/c) / m ); 

    }

    public static void main(String[] args) {
    	System.out.println(chocolateFeast(6,2,2));
    }

}