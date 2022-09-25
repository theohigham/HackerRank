import java.util.*;


public class JumpingOnTheClouds{

	public static int jumpingOnClouds(List<Integer> c) {

        // c is a list of clouds
        // 0 : safe (cumulus)
        // 1 : avoid (thunderhead)
        
        // Player can jump by one or two  
        // clouds at a time
        
        // Return no. of jumps to reach end
        
        int jumps = 0;
        int consecutive = 1; // The number of consecutive 0s encountered
        
        for (int i = 1; i < c.size(); i ++) {
        	int cloud = c.get(i);

			if (cloud == 0) {
				jumps++;
				consecutive++;
			}

			else {
				consecutive = 0;
			}

			if (consecutive == 3){ // Three consecutive 0s allows for a double jump
				jumps--;
				consecutive = 1;
			}

        }

        return jumps;

    }

    public static void main(String[] args) {

    	// [0,1,0,0,1,0]
    	ArrayList<Integer> c = new ArrayList<Integer>();
    	c.add(0);
    	c.add(1);
    	c.add(0);
    	c.add(0);
    	c.add(1);
    	c.add(0);

    	System.out.println("output: " + jumpingOnClouds(c));

    	// [0,1,0,0,0,1,0]
    	ArrayList<Integer> c2 = new ArrayList<Integer>();
    	c2.add(0);
    	c2.add(1);
    	c2.add(0);
    	c2.add(0);
    	c2.add(0);
    	c2.add(1);
    	c2.add(0);

    	System.out.println("output: " + jumpingOnClouds(c2));

    }

}