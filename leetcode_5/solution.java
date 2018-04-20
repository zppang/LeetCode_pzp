class Solution {
    public static String longestPalindrome(String s) {
		if(s.isEmpty() || s.length() == 1)return s;
		String longestStr = s.substring(0, 1);
		
		for(int i = 0; i<s.length(); i++)
		{
			String tmp = isPalindrome(s,i,i);//判断回文串为奇数串时
			if(tmp.length() > longestStr.length())
				longestStr = tmp;
			tmp = isPalindrome(s, i, i+1);//判断回文串为偶数串时
			if(tmp.length() > longestStr.length())
				longestStr = tmp;
		}
		
		return longestStr;
	}
	
	
	public static String isPalindrome(String s, int start, int end){
		
		while(start>=0 && end<=s.length()-1 && s.charAt(start) == s.charAt(end))
		{
			start --;
			end ++;
		}
		return s.substring(start+1, end);	
	}
}