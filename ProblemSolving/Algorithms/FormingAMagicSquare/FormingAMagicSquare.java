public static int formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
    
    //ArrayList<ArrayList<ArrayList<Integer>>> allMagicSquares = new    ArrayList<ArrayList<ArrayList<Integer>>>();         
    
    //ArrayList<ArrayList<Integer>> magicSquareOne = Arrays.asList()
    
    List<List<List<Integer>>> magicSquares = generateMagicSquares();
    
    int minCost = Integer.MAX_VALUE;
    
    for(List magicSquare : magicSquares){
        int cost = calculateCost(s,magicSquare);
        if (cost < minCost){
            minCost = cost;
        }
    }
    
    return minCost;

    }
    
    public static int calculateCost(List<List<Integer>> s, List<List<Integer>> magicSquare){
        
        int totalCost = 0;
        
        for (int row = 0; row <= 2; row++){
            for (int column = 0; column <= 2; column++){
                int cost = Math.abs( s.get(row).get(column) - magicSquare.get(row).get(column) );
                totalCost += cost;
            }
        }
        
        return totalCost;
    }
    
    public static List<List<List<Integer>>> generateMagicSquares(){
        // Generates all 3x3 magic squares of unique elements n, 1<=n<=9
        
        List<List<Integer>> one = Arrays.asList( Arrays.asList(2,7,6), Arrays.asList(9,5,1),        Arrays.asList(4,3,8) );
        
        List<List<Integer>> two = Arrays.asList( Arrays.asList(6,1,8), Arrays.asList(7,5,3),        Arrays.asList(2,9,4) );
        
        List<List<Integer>> three = Arrays.asList( Arrays.asList(8,3,4), Arrays.asList(1,5,9),        Arrays.asList(6,7,2) );
        
        List<List<Integer>> four = Arrays.asList( Arrays.asList(4,9,2), Arrays.asList(3,5,7),        Arrays.asList(8,1,6) );
        
        List<List<Integer>> five = Arrays.asList( Arrays.asList(6,7,2), Arrays.asList(1,5,9),        Arrays.asList(8,3,4) );
        
        List<List<Integer>> six = Arrays.asList( Arrays.asList(8,1,6), Arrays.asList(3,5,7),        Arrays.asList(4,9,2) );
        
        List<List<Integer>> seven = Arrays.asList( Arrays.asList(4,3,8), Arrays.asList(9,5,1),        Arrays.asList(2,7,6) );
        
        List<List<Integer>> eight = Arrays.asList( Arrays.asList(2,9,4), Arrays.asList(7,5,3),        Arrays.asList(6,1,8) );
        
        return Arrays.asList(one,two,three,four,five,six,seven,eight);
    }

}