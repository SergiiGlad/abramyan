package cow;

public class draw {
	
	
	public static void space( int i ){
		for ( int k = 0; k < i; k++)
			System.out.print(" ");

	}

	public static void main(String[] args) {
		
		
		space( 10 );
		System.out.println("'__'");
		
		space ( 10 );
		System.out.println("(oo)");
		
		space ( 2 );
		System.out.println("+========\\/");
		
		space( 1 );
		System.out.println("/ || %%% ||");
		
		System.out.println("*  ||-----||");
		
		space( 3 );
		System.out.println("\"\"     \"\"");
	}

}
