/*
Author: harsh3150

Question: Check if a string can be obtained by rotating another string 2 places ?

*/

public class stringRotation2Places{
	public static void main(String[] args) {
		System.out.println(rotate("amazon","onamaz"));
		System.out.println(rotate("amazon","azonam"));
		System.out.println(rotate("amazon","harsh"));

	}

	private static boolean rotate(String s, String temp){
		String temp2=temp.substring(2);
		temp2+=temp.substring(0,2);
		
		if(s.equals(temp2))
			return true;

		temp2=	temp.substring(temp.length()-2,temp.length())+""+temp.substring(0,temp.length()-2);
		
		if(s.equals(temp2))
			return true;

		return false;
	}

}
