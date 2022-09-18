import java.util.*;

public class RankSearch{

	public static int rankSearch(List<Integer> ranked, int p){
        // Returns the index of the highest number <= p within ranked
        
        int low = 0;
        int high = ranked.size()-1;
        int guess = 0;
        
        while(low <= high){
            guess = (low + high) / 2;
            
            if (ranked.get(guess) == p){
                return guess;
            }
            
            else if(ranked.get(guess) > p){ // The opposite from usual because ranked is reverse-sorted
                low = guess + 1;
            }
            
            else{
                high = guess-1;
            }
            
        }
        
        return ranked.get(guess) <= p ? guess : guess + 1;
        
    }

    public static void main(String[] args) {
    	
    	List<Integer> ranked = new ArrayList<Integer>();
    	ranked.add(100);
    	ranked.add(100);
    	ranked.add(50);
    	ranked.add(40);
    	ranked.add(40);
    	ranked.add(20);
    	ranked.add(10);

    	System.out.println(rankSearch(ranked,25));

    }

}