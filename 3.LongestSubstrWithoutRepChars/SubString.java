//leetcode-3: Longest Substring Without Repeating Characters
//Time Complexity: O(n)
//Space Complexity: O(min(m,n)) where m is the size of charMap and n is the length of the string

import java.util.*;

public class SubString {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>hm=new HashMap<>();
        int n=s.length();
        int maxLen=0;
        int j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                j=Math.max(j,hm.get(ch)+1);
            }
            hm.put(ch,i);
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}
