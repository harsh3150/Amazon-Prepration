/*
Author: harsh3150

Question: How to check if given four points form a square?

*/

public class formASquare{
	public static void main(String[] args) {
		int x1=10, y1=10;
		int x2=20, y2=20;
		int x3=10, y3=20;
		int x4=20, y4=10;

		 // x1=10; y1=10;
		 // x2=10; y2=10;
		 // x3=10; y3=10;
		 // x4=10; y4=10;

		System.out.println(isSquare(x1 ,y1 ,x2 ,y2 ,x3 ,y3 ,x4 ,y4));
		
	}

	private static int distanceSquare(int x1, int y1, int x2, int y2){
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
	}

	private static boolean isSquare(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
		
		int a=distanceSquare(x1,y1,x2,y2);
		int b=distanceSquare(x1,y1,x3,y3);
		int c=distanceSquare(x1,y1,x4,y4);

		if(a==0 || b==0 || c==0)
			return false;
		
		if(a==b &&
		   2*a==c &&
		   distanceSquare(x2,y2,x3,y3)==c)
			return true;

		else if(a==c &&
			 	2*a==b &&
			 	distanceSquare(x2,y2,x4,y4)==b)
			return true;

		else if(c==b &&
			 	2*b==a &&
			 	distanceSquare(x4,y4,x3,y3)==a)
			return true;

		return false;
		

	}
}