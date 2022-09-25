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
        boolean justJumped = false; // Whether the player jumped at the previous cloud
        
        for (int i = 1; i < c.size(); i ++) {
        	int cloud = c.get(i);

			if(jump(cloud, justJumped)){
        		// jump!
        		jumps ++;
        	}

        	justJumped = jump(cloud,justJumped);

        }

        return jumps;
    }

    public static boolean isCumulus(int c) {

    	return c == 0 ? true : false;

    }

    public static boolean jump(int cloud, boolean justJumped) {

    	return cloud == 0 && justJumped == false;

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

    }

}