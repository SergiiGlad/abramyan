
public class abramyn6 {
	
	public static int Max ( int x, int y ){
		 
		return x > y ? x : y;
	}
	
	public static int Min ( int x, int y ) {
		return x < y ? x : y;
	}

	public static void main(String[] args) {
	
		/*
		 *  Abramyn, Chapter 6 , lf12 - lf18 
		 */
		
		int a = 25, b = 20, c = 30;
		
		
		// lf12 find smallest
		System.out.println("The smallest :" +Min ( Min(a, b), c));
		
		// lf13 find  value between other
		
		if ( a < b && b < c ) System.out.println("b between a and c : "+ b);
		if ( b < a && a < c ) System.out.println("a between b and c : "+ a);
		if ( a < c && c < b ) System.out.println("c between a and b : "+ c);
		
		// lf14 , print smallest and biggest
		
		System.out.println("The smallest :" +Min ( Min(a, b), c)+" The biggest :"+Max(Max(a,b),c));
		
		// lf15, find sum couple of the biggest
		
		int sum = 0;
		if ( Max(Max(a,b),c) == a ) sum = a + ( b < c ? c : b );
		if ( Max(Max(a,b),c) == b ) sum = b + ( a < c ? c : a );
		if ( Max(Max(a,b),c) == c ) sum = c + ( a < b ? b : a );
		
		System.out.println("Sum = "+ sum );
		
		// lf16  lf17 , check a<b<c a>b>c
		
		a = 15; b = 10; c = 5;
		
		if ( (a < b && b < c ) || (a > b && b > c) ) {
			a *= a;
			b *= b;
			c *= c;
		} else {
			a *= -1;
			b *= -1;
			c *= -1;
		}
		
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		// lf18 which sequence number
		
		a = 15; b = 10; c = 15;
		
		int index = 1;
		
		if ( a == b ) index = 3;
		if ( a == c ) index = 2;
		
		System.out.println("Index different value :"+index);
		
		
	}

}
