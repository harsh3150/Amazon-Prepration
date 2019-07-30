/* 
Author : harsh3150
Question: Write a one line function to return position of first 1 from right to left, in binary representation of an Integer.

*/

public class positionOf1InaBinary{
	public static void main(String[] args) {

		int num=8192;

		System.out.println(positionFromRightToLeftOfFirst1(num));

	}

	public static int positionFromRightToLeftOfFirst1(int num){
		return -Integer.toBinaryString(num).lastIndexOf("1")+Integer.toBinaryString(num).length();
	}
}