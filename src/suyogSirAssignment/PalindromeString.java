package suyogSirAssignment;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "radar";
		String r = "";
		for (int i=s.length()-1 ; i>=0 ; i--) {
			r = r + s.charAt(i);
		}
		if (s.equals(r)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}	
     }
}
