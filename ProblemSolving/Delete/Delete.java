public class Delete{

	public static String delete(String s){

		return(s.substring(0,s.length() - 1));


	}

	public static void main(String[] args) {
		
		String s = "ashley";
		s = delete(s);

		System.out.println(s);

	}



}