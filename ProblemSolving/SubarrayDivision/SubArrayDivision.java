public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        
        int count = 0; 
        for(int i = 0; i < s.size()-1; i++){ 
                if (sumRange(s,i,i+(m-1)) == d){ 
                    count++;
                }
        }
        return count;
    }
    
public static int sumRange(List<Integer> s, int i, int j){

/*
 * Returns the sum of all integers from index i to index j,
 * within list s
 *
 * Returns -1 if i or j are outwith the bounds of s
 *
 */

    if(i<0 || j>s.size()-1){
        return -1;
    }
    
    if(s.size() == 1){
        return s.get(0);
    }

    int sum = 0;

    for(int x = i; x <= j; x++){
        sum += s.get(x);
    }

    return sum;

}