public class Append{

	public static String append(String s, String t){
		/*
		  i is the last index of s
		  Adds t(i + 1) to the end of s
		*/
		  int index = s.length()-1;
		  s = s + t.charAt(index + 1);
		  return s;

	}

	public static void main(String[] args) {
		String s = "ash";
		String t = "ashley";

		s = append(s,t);
		System.out.println(s);
	}

}