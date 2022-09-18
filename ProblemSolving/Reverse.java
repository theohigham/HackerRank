public class Reverse{

//Returns the reverse of an integer
//Eg. 31 -> 13

public static int reverse(int n){
        String reversed = "";
        String digits = String.valueOf(n);
        char[] c = digits.toCharArray();
        
        for(int i = c.length - 1; i >= 0; i--){ // Iterate backwards through char array
            reversed += c[i];
        }
        
        return Integer.parseInt(reversed);
    }

}