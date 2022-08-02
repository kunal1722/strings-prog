package suyogSirAssignment;

public class RemoveCommonFrom2String {

	public static void main(String[] args) {
		String a = "india";
		String b = "china";
		char c [] = a.toCharArray();
		char d [] = b.toCharArray();
		int k ;
		for(int i=0 ; i<c.length ; i++) {
			k = 1;
			for (int j=0 ; j<d.length ; j++) 
			{
				if(c[i] == d[j] && c[i] !=' '){
					k++;
			//s.charAt(j) = '0';    // without converting to char array we cannot perform this
					d[j] =' ';   // value of j change to blank
					 break;
			}
				
		}
			if ( k>1 ) {
				System.out.println(c[i]);
				
				
			}
	}
  }
}

