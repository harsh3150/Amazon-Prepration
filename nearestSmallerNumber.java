/*

author: harsh3150 
question: Find the nearest smaller numbers on left side in an array

*/

import java.util.*;

class nearestSmallerNumber{
	public static void main(String[] args) {
		//Enter the array here:
		int []arr={1, 3, 0, 2, 5};
		int len=arr.length;
		String ans[]=new String[len];
		ans[0]="_";

		for(int i=1;i<len;i++){
			boolean check=false;
			for(int j=i;j>=0;j--){
				if(arr[j]<arr[i]){
					ans[i]=Integer.toString(arr[j]);
					check=true;
					break;
				}

			}
			if(!check)
				ans[i]="_";
		}

		
		System.out.println(Arrays.toString(ans));
	}
}