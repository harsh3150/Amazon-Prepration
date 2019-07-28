/*
Author: harsh3150

Question: Find if two rectangles overlap
*/

import java.util.*;

public class rectangeOverlaps{
	public static void main(String[] args) {
	
		point l1=new point (0,10);
		point r1=new point (10,0);
		point l2=new point (5,5);
		point r2=new point (15,0);

		int x1=l1.x, y1=l1.y, x2=l1.x, y2=r1.y, x3=r1.x, y3=r1.y, x4=r1.x, y4=l1.y;

		int max_x=Math.max(l2.x, r2.x), 
			min_x=Math.min(l2.x, r2.x),
			max_y=Math.max(l2.y, r2.y), 
			min_y=Math.min(l2.y, r2.y);

		boolean check=false;
		if(x1<=max_x && x1>=min_x && y1<=max_y && y1>=min_y)
			check=true;
		else if(x2<=max_x && x2>=min_x && y2<=max_y && y2>=min_y)
			check=true;
		else if(x3<=max_x && x3>=min_x && y3<=max_y && y3>=min_y)
			check=true;
		else if(x4<=max_x && x4>=min_x && y4<=max_y && y4>=min_y)
			check=true;

		if(check)
			System.out.println("Overlaps");
		else 
			System.out.println("Doesn't Overlap");

	}

}


class point{
	int x;
	int y;

	public point(){

	}

	public point(int x, int y){
		this.x=x;
		this.y=y;
	}
}