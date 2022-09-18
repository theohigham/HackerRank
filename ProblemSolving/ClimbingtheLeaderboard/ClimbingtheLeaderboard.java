public class ClimbingtheLeaderboard{

    // An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:

    // The player with the highest score is ranked number  on the leaderboard.
    // Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

    // *Example*:

    // ranked = [100,90,90,80]
    // player = [70,80,105]

    // The ranked players will have ranks 1, 2, 2, and 3, respectively. 
    // If the player's scores are 70, 80 and 105, their rankings after each game are 4th, 3rd  and 1st. Return [4,3,1].

    // *Function Description*:

    // Complete the climbingLeaderboard function in the editor below.

    // climbingLeaderboard has the following parameter(s):

    // int ranked[n]: the leaderboard scores
    // int player[m]: the player's scores
    // Returns

    // int[m]: the player's rank after each new score

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