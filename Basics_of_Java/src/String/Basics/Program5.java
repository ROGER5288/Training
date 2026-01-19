package String.Basics;

public class Program5 {
	public static void main(String[] args) {
//		String s = "Hello";
//		
//		System.out.println();
//		
//		char[] ch = s.toCharArray();
//		for(int i = 0; i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
//		
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(2));
//		System.out.println(s.charAt(3));
//		System.out.println(s.charAt(4));
//		
//		
//		
//		for(int i = 0; i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
//		
//		byte[] b = s.getBytes();
//		for(int i = 0; i<b.length;i++) {
//			System.out.println(b[i]);
//		}
//		
//		System.out.println(s.startsWith("Ha"));
//		System.out.println(s.endsWith("o"));
//		
//		
//		String res = s.replaceAll("l", "a");
//		System.out.println(res);
//		
//		
//		System.out.println(s.contains("l"));
//		System.out.println(s.contains("z"));
//
//		
//		System.out.println(s.indexOf("l"));
//		System.err.println(s.indexOf("z"));
//		
//		
//		String s1 = "Java is a programming language";
//		
//		String[] res1 = s1.split(" ");
//		for(int i = 0; i<res1.length;i++) {
//			System.out.println(i);
//		}
		String s="Hello";
		
		System.out.println(s.length());
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
		 
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		//System.out.println(s.charAt(100));
		
		byte[] b=s.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println(s.startsWith("Ha"));
		System.out.println(s.endsWith("o"));
		
		String res = s.replaceAll("l", "a");
		System.out.println(res);
		
		System.out.println(s.contains("l"));
		System.out.println(s.contains("z"));
		
	    System.out.println(s.indexOf("l"));
	    System.out.println(s.indexOf("z"));
	    
	   String s1="Java is a programming language";
	   String[] res1=s1.split(" ");
	   for(int i=0;i<res1.length;i++) {
		   System.out.println(res1[i]);
	   }
	}
}
