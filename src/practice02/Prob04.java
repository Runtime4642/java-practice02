package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char []a = new char[str.length()];
		for(int i=0;i<str.length();i++)
			a[i]=str.charAt(str.length()-i-1);
		
		return a;
	}

	public static void printCharArray(char[] array){
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
