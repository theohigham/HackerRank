import java.util.*;


public class JumpingOnTheClouds{

	public static int jumpingOnClouds(List<Integer> c) {

        // c is a list of clouds
        // 0 : safe (cumulus)
        // 1 : avoid (thunderhead)
        
        // Player can jump by one or two  
        // clouds at a time
        
        // Return no. of jumps to reach end
        
        int position = 0;
        int jumps = 0;
        int gap = 0;
        
        for (int i = 1; i < c.size(); i ++) {
            
			if(jump(c,i,position)){
        		// jump!
        		jumps ++;
        		position = i;
        		}

        }

        return jumps;
    }

    public static boolean isCumulus(List<Integer> c, int i) {

    	return c.get(i) == 0 ? true : false;

    }

    public static boolean jump(List<Integer> c, int i, int position) {

    	// Given cloud and current position,
    	// looks ahead to decide
    	// whether to jump onto this cloud

    	// On a cumulus, not the last
    	if (isCumulus(c,i) && i < c.size()-1) {
    		
    		// If the next cloud is a thunderhead
    		if(!isCumulus(c,i+1)) {
    			return true;
    		}
 
 			// If the next cloud is a cumulus
    		else if (position == i - 2) { 
    			return true;
    		}
    	}

    	return false;

    }

    public static void main(String[] args) {

    	// [0,1,0,0,0,1,0]
    	ArrayList<Integer> c = new ArrayList<Integer>();
    	c.add(0);
    	c.add(1);
    	c.add(0);
    	c.add(0);
    	c.add(0);
    	c.add(1);
    	c.add(0);

    	System.out.println("output: " + jumpingOnClouds(c));

    	// [0,0,1,0,0,1,0]
    	ArrayList<Integer> c2 = new ArrayList<Integer>();
    	c2.add(0);
    	c2.add(0);
    	c2.add(1);
    	c2.add(0);
    	c2.add(0);
    	c2.add(1);
    	c2.add(0);

    	System.out.println("output: " + jumpingOnClouds(c2));
    }

}