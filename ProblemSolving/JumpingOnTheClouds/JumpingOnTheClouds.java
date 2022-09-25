import java.util.*;


public class JumpingOnTheClouds{

	public static int jumpingOnClouds(List<Integer> c) {

        // c is a list of clouds
        // 0 : safe (cumulus)
        // 1 : avoid (thunderhead)
        
        // Player can jump by own or two  
        // clouds at a time
        
        // Return no. of jumps to reach end
        
        int position = 0;
        int jumps = 0;
        int gap = 0;
        
        for (int i = 1; i < c.size(); i ++) {
            
            // Cumulus
            if (isCumulus(c,i)) {
        		
        		// jump!
        		jumps ++;
        		position = i;
        	
        	}	    

            // Thunderhead
            else {

            }
        }

        return jumps;
    }

    public static boolean isCumulus(List<Integer> c, int i){

    	return c.get(i) == 0 ? true : false;

    }

    public static void main(String[] args) {

    	ArrayList<Integer> c = new ArrayList<Integer>();
    	c.add(0);
    	c.add(0);
    	c.add(1);
    	c.add(0);
    	c.add(0);
    	c.add(1);
    	c.add(0);

    	System.out.println("output: " + jumpingOnClouds(c));
    }

}