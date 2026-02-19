// 686. Repeated String Match
// time: O(m+n) where m is the length of the repeated string and n is the length of the pattern string
// space: O(n) where n is the length of the pattern string for the lps array


class RepStringMatch {
    
    public int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];

        // Length of the previous longest prefix suffix
        int len = 0;

        // Start from index 1 (as lps[0] is always 0)
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                // If mismatch occurs after at least one match
                if (len != 0) {
                    len = lps[len - 1];
                } else {

                    // No prefix match, set lps[i] to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    
    public boolean search(String text, String pattern) {
        int[] lps = buildLPS(pattern);
        // Indices for text and pattern
        int i = 0, j = 0;

        // Traverse the entire text
        while (i < text.length()) {

            // If characters match, increment both pointers
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            // If full pattern matched
            if (j == pattern.length()) {
               return true;
            }

            // If mismatch occurs after some matches
            else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {

                // Use LPS to skip unnecessary comparisons
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public int repeatedStringMatch(String a, String b) {
        StringBuilder s=new StringBuilder();
        int cnt=0;

        while(s.length()<b.length()){
            s.append(a);
            cnt++;
        }

        if(search(s.toString(),b)){
            return cnt;
        }
        s.append(a);
        cnt++;
         
         if(search(s.toString(),b)){
            return cnt;
        }
        
        return -1;
    }
}