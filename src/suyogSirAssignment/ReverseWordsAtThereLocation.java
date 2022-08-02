package suyogSirAssignment;

public class ReverseWordsAtThereLocation {

	public static void main(String[] args) {
		String s ="prasad kunal ranjit swapnil";
		
		String [] a = s.split(" ");
		String b ="";
		for(int i=0 ; i<a.length ; i++) {
			String c = a[i];
			String d =" ";
			for(int j=c.length()-1 ; j>=0 ; j--) {
				d = d+c.charAt(j);
				}
			b = b+d;
		}
		System.out.println(" " + s);
		System.out.print(b);
		/*for ( int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		k = s.charAt(i);
		}
		*/

		
		
		
		
		
		
		
		
		
		
		}
}
		


