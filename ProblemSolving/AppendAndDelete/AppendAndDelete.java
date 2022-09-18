public class AppendAndDelete{

    // You have two strings of lowercase English letters. You can perform two types of operations on the first string:

    // Append a lowercase English letter to the end of the string.
    // Delete the last character of the string. Performing this operation on an empty string results in an empty string.
    // Given an integer, k, and two strings, s and t, determine whether or not you can convert  to  by performing exactly  of the above operations on . If it's possible, print Yes. Otherwise, print No.

    // *Example*:

    // s = [a, b, c]
    // t = [d, e, f]
    // k = 6

    // To convert s to t, we first delete all of the characters in 3 moves. Next we add each of the characters of  in order. On the  move, you will have the matching string. Return Yes.

    // If there were more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than  moves, we would not have succeeded in creating the new string.

    // *Function Description*:

    // Complete the appendAndDelete function in the editor below. It should return a string, either Yes or No.

    // appendAndDelete has the following parameter(s):
    
    // string s: the initial string
    // string t: the desired string
    // int k: the exact number of operations that must be performed

    // Returns

    // string: either Yes or No


public static String appendAndDelete(String s, String t, int k) {
    // Write your code here

        for(int i = 1; i <= k; i++){
            
            if(t.equals(s)){
                System.out.println("Ops: " + k + "-" + i);
                return wasteOperations(s.length(), k-i + 1);
            }
            
            if(s.equals("")){
                return k - i + 1 >= t.length() ? "Yes" : "No";
            }
            
            if(s.length() < t.length() && s.equals(t.substring(0,s.length())) ){
                s = append(s,t);
            }
            
            else{
                s = delete(s);
            }
            
            System.out.println(s);
        }

        return s.equals(t) ? "Yes" : "No";

    }
        
    public static String append(String s, String t){
        //Adds appropriate char from t to s
        
        return s + t.charAt(s.length() - 1 + 1); 
    }
    
    public static String delete(String s){
        //Removes last char from s
        
        return s .length() == 1 ? "" : s.substring(0,s.length() - 1);
    }
    
    public static String wasteOperations(int length, int k){
        // If the strings are already equal, we need
        // a way to use up the leftover operations
        
        //Add and remove strategy
        if(k%2 == 0){
            return "Yes";
        }
        
        //Delete all, delete more, append
        if(k - length >= length){
            return "Yes";
        }
        
        return "No";
    }

}