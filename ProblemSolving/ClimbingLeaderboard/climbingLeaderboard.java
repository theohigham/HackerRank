public class climbingLeaderboard{

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // This version needs to be optimised
    
        HashMap<Integer,Integer> ranks = new HashMap<Integer,Integer>();
        List<Integer> output = new ArrayList<Integer>();
        
        int rank = 0;
    
        for(int r : ranked){
            if(!ranks.containsKey(r)){
            
            ranks.put(r,++rank);
            
            }
        }
        
        for(int p : player){
            boolean added = false;
            
            for(int ra : ranked){
                if(p >= ra){
                    output.add(ranks.get(ra));
                    added = true;
                    break;
                }
            }
            
            if(!added){
                output.add(ranks.get(ranked.get(ranked.size()-1)) + 1); // The lowest rank + 1
            }
        }
    
        return output;
        
    }


}