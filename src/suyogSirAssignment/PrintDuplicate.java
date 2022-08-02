package suyogSirAssignment;

public class PrintDuplicate {

	public static void main(String[] args) {
		String s = "i love my indians";
		String[] b = s.split(" ");
		System.out.println(b.length);
		char a [] = s.toCharArray();
		int k ;
		for(int i=0 ; i<a.length ; i++) {
			k = 1;
			for (int j=i+1 ; j<a.length ; j++) 
			{
				if(a[i] == a[j] && a[i] !=' '){
					k++;
			//s.charAt(j) = '0';    // without converting to char array we cannot perform this
					a[j] = ' ';
			break;
			}
		}
			if ( k >1 ) {
				System.out.println(a[i]);
				
			}
	}

	}

}
