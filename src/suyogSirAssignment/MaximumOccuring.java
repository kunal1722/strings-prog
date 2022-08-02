package suyogSirAssignment;

import java.util.Arrays;

public class MaximumOccuring {

	public static void main(String[] args) {
		String a = "i love my india";
		int[] b = new int [a.length()];
		//Arrays.sort(b);
		for ( int i = 0 ; i<b.length ; i++) {
		System.out.print(b[i]);}
		for ( int u = 0 ; u<b.length-1 ; u++) {
			for (int j = u+1 ; j<b.length-1 ; j++) {
				if ( b[u] == b[j]) {
					int k = 0;
					k++;
				if (k>1) {
				System.out.println(k);
				}
			}
			
		}

		}}}


