package suyogSirAssignment;

public class Reverse {

	public static void main(String[] args) {
		String s = "kunalkrishna1722";
		for (int j=0 ; j<s.length() ; j++) {
		System.out.print(s.charAt(j));
		}
		System.out.println();
		for (int i=s.length()-1 ; i>=0 ; i--) {
			
			System.out.print( s.charAt(i));
		}

	}

}
