package Assignment.ASS3;
public class LongestSubstring {
   
	public static int ls(String s) {

        StringBuilder sb = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (sb.indexOf(String.valueOf(ch)) != -1) {
                sb.deleteCharAt(0);
            }

            sb.append(ch);
            maxLength = Math.max(maxLength, sb.length());
        }

        return maxLength;
    }
	
	
	
	public static void main(String[] args) {

        String s = "abcabcbb";   
        System.out.println("Length: " + ls(s));
    }
	

}
