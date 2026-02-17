//Problem 28. Index of First Occurrence in String
//time: O(m+n) where m is the length of haystack and n is the length of needle
//space: O(n) where n is the length of needle for the lps array

class FirstOccInString {
    public int[] LPS(String pat){
        int n=pat.length();
        int[] lps=new int[n];
       
        int len=0; //length of prev longest prefix which is also suffix
        int i=1;

        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int strStr(String haystack, String needle) {
        int[] lps=LPS(needle);
        int i=0,j=0;

        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }

            if(j==needle.length()){
               return i-j;
            }else if(i<haystack.length() && haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
            
        }
        return -1;
    }
}