package suyogSirAssignment;

public class ReverseTheSentence {

	public static void main(String[] args) {
		String s = "manual and automation testing";
		String [] a = s.split(" ");
			for (int i=a.length-1 ; i>=0 ; i--) {
				System.out.print(a[i] + " ");
			}
		}
	}
