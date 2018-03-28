package Solution;

import java.util.HashMap;

public class Solution {

	public static int lengthOfLongestSubstring(String s) {
        if(s == null)return 0;
        int start = 0;
        int length = 1;
        int maxLength = 0;
        HashMap<Character, Integer> mmHashMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++)
        {
        	if(!mmHashMap.containsKey(s.charAt(i)))
        	{
        		mmHashMap.put(s.charAt(i), i);
        		length = i - start + 1;
        		if(length >= maxLength)
        			maxLength = length;
        	}
        	else 
        	{
        		int temp = mmHashMap.get(s.charAt(i)) + 1;
        		if(temp>start)
        			start = temp;
				mmHashMap.replace(s.charAt(i), i);
				length = i - start + 1;
        		if(length >= maxLength)
        			maxLength = length;
				
			}
        }
        
        return maxLength;
    } 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));
		
	}

}
