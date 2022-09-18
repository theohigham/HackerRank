public class RepeatedString{


	public static void main(String[] args) {
		String s = "aaaaa";
		int n = 14;

		System.out.println(repeatedString(s,n));
	}

	public static long repeatedString(String s, long n){

		if( n <= s.length() ){
			return asInS(s.substring(0,(int)n));
		}

		long y = (int)n % s.length();

		return asInS(s) * ( (n-y)/s.length() )
			 + asInS(s.substring(0,(int)y));

	}

	public static long asInS(String s){

		long count = 0;

		for(char c : s.toCharArray()){
			if(c == 'a'){
				count++;}
		}

		return count;

	}


}