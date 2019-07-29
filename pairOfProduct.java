/* 
Author: harsh3150

Question: Given an array of distinct elements and a number x, find if there is a pair with a product equal to x.

*/

import java.util.*;

public class pairOfProduct{
	public static void main(String[] args) {
		int []arr={10, 20, 9, 40};

		int x=90;

		int len=arr.length;

		boolean check=false;
		for(int i=0;i<len;i++){
			if(x%arr[i]==0){
				if(search(arr, x/arr[i])){
					System.out.println("Yes");
					check=true;
					break;
				}
			}
		}

		if(!check)
			System.out.println("No");

	}


	public static boolean search(int []arr, int element){
		if(Arrays.binarySearch(arr, element)>=0)
			return true;
		return false;
	}
}