package suyogSirAssignment;

public class ConvertStringToInteger {

	public static void main(String [] args) {
		String s = "7999";
		char c = '@';
	    Integer i = Integer.valueOf(s);      //another way to change string to integer
	    System.out.println(i);
	    System.out.println(i + 1);
	    for (int j = 1 ; j<=1 ; j++) {
	    	System.out.println(j + i);
	    }
	    
	               //or//
	    
		System.out.println(c);
		String[] a = s.split("");
		System.out.println(a.length);
		for( int j=0 ; j<a.length ; j++) {
		System.out.print(a[j]);
		}

}
}
