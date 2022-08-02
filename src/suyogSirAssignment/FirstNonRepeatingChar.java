package suyogSirAssignment;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s = "irespecteveryreligion";
		boolean find = false;    // initialized and declare boolean
		for(int i=0 ; i<s.length() ; i++) {
			find = true;
			for(int j=0 ; j<s.length(); j++) {
				if( i != j && s.charAt(i) == s.charAt(j) ) {
					find = false;
                  break;
				}
				}
				if(find) {
				System.out.println(s.charAt(i));
					break;
				}
		}
		if (!find) {
			
			System.out.println("no result");
			}
		}

	}


