// Problem 1759. Count Number of Homogenous Substrings
//time complexity: O(n),where n is the length of the string
//space complexity: O(1)


import java.util.HashMap;

public class HomogenousSubstring {
    int MOD=(int)1e9+7;
    public int countHomogenous(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int cnt = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            while(hm.size()>1){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0){
                    hm.remove(s.charAt(i));
                }
                i++;
            }
             cnt=(cnt+(j-i+1)%MOD)%MOD;
        }
        return cnt%MOD;
    }
}
