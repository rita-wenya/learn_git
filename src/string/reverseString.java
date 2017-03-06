package string;
//344Write a function that takes a string as input and returns the string reversed.
public class reverseString {
	 public String reverseString(String s) {
	        char[] word = s.toCharArray();
	        int i = 0;
	        int j = s.length() - 1;
	        while (i < j) {
	            char temp = word[i];
	            word[i] = word[j];
	            word[j] = temp;
	            i++;
	            j--;
	        }
	        return new String(word);
	    }
}
//public String reverseString(String s) {
//    StringBuilder sb =new StringBuilder();

//    for(int i = 0 ;i<s.length();i++){
//        sb.append(s.charAt(s.length()-1-i)+""); 加""是将其转换为字符串类型
//    }

//   return sb.toString() ;
//}