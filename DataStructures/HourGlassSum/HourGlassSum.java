public class HourGlassSum{
// HackerRank: Traversing a 2D Array

// Calculate the maximum "Hourglass Sum" within
// a 6 x 6 2D array

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        // arr.get(i).get(j) Returns the jth element of the ith row of arr
        
            int max = -Integer.MAX_VALUE;
        
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    
                    int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                    int mid = arr.get(i+1).get(j+1);
                    int bot = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                    
                    int sum = top + mid + bot;
                    if (sum > max){
                        max = sum;
                    }
                    
                }
            }

            return max;
    }

}