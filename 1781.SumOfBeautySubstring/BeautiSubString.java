import java.util.*;

public class BeautiSubString {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;

        for(int i=0;i<n;i++){
            Map<Character,Integer>hm=new HashMap<>();
            for(int j=i;j<n;j++){
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);

                int minVal=Integer.MAX_VALUE;
                int maxVal=Integer.MIN_VALUE;

                for(char key:hm.keySet()){
                    minVal=Math.min(minVal,hm.get(key));
                    maxVal=Math.max(maxVal,hm.get(key));
                }
                ans+=(maxVal-minVal);
            }
        }
        return ans;
    }
}
