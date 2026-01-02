
public class LongestReplacement {
     public int characterReplacement(String s, int k) {
        int i=0;
        int maxLen=0, maxFreq=0;
        int []freq=new int[26];

        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(j)-'A']);

            while((j-i+1)-maxFreq>k){
                freq[s.charAt(i)-'A']--;
                maxFreq=0;

                for(int z=0;z<26;z++){
                    maxFreq=Math.max(maxFreq,freq[z]);
                }
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}
