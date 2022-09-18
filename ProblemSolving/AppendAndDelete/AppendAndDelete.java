public class AppendAndDelete{

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