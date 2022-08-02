package example1;

public class Example {

	public static void main(String[] args) {
		String s = "kunal";
		String t = "Kunal";
		String r = "KUNAL3";
		String i = new String ("KK");
		String n = new String ("KUNAL");
		String g = new String ("KUNAL");
		String h = "KUNAL KRISHNA 17";
		System.out.println(s);
		System.out.println(t);
		System.out.println(r);
		System.out.println(i);
		System.out.println(s.equals(t));   // compares only data
		System.out.println(t.equals(r));
		System.out.println(r.equals(i));
		System.out.println(r.equals(n));
		System.out.println(i.equals(n));
		System.out.println(n.equals(s));
		if (s.equals(t)) {
			System.out.println("uy");
		}
		if (s.equalsIgnoreCase(t)) {
			System.out.println("pras");
		}
	    System.out.println(n.equalsIgnoreCase(s));    
		System.out.println(t.equalsIgnoreCase(i));
		System.out.println(t == r);   // compares address
		System.out.println(i == n);
		System.out.println(n == s);
		System.out.println(r == n);
		System.out.println(n == g);
		System.out.println(r == h);
		System.out.println(n.equals(g));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(0));   // space can also be read
		System.out.println(t.length());
		System.out.println(t.toUpperCase());
		System.out.println(r.toLowerCase());
		System.out.println(r.indexOf('U')  +"  "+  r.indexOf("3"));
		System.out.println(n.lastIndexOf(3));
		System.out.println(g.concat(s+r) );
		System.out.println(h.concat(t));
		System.out.println(n.replace('U' , 'O'));
		System.out.println(i.replaceAll(i , s));  // replaced string i with string s
		System.out.println(i.replaceAll(s, i));   // cannot replace bcz string which we should have to replace should be wrote first
		System.out.println(h.trim());
		String u = h.replaceAll("A","E");
		System.out.println(u);
		String a[] = h.split(" ");
		//for(int j=0 ; j<a.length ; j++) {
		System.out.println(a[2]);
		//System.out.println(h.split(" "));  //we cannot print split method directly
		String b [] = t.split("u");
		System.out.println(b[1]);
		int f = 5735276;
		String z = String.valueOf(f);
		String y [] = z.split("");
		System.out.println(y[4]);
		//System.out.println(y[1]);
		for (int l=z.length()-1 ; l>=0 ; l--) {
			System.out.println(z.charAt(l));
		}
		}

}
