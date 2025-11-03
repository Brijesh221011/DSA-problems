public class MinimumWindow {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
         int[] freq=new int[256];

         for(int i=0;i<m;i++){
            freq[t.charAt(i)]++;
         }
          int j=0;
          int cnt=m;
          int sIdx=0;
          int minLen=Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
            if(freq[s.charAt(i)]>0){
                cnt--;
                
            }
            freq[s.charAt(i)]--;

            while(cnt==0){
                if(i-j+1<minLen){
                  minLen=i-j+1;
                  sIdx=j;
                }
                freq[s.charAt(j)]++;
                if(freq[s.charAt(j)]>0){
                    cnt++;
                }
                j++;
            }
          }
           return minLen == Integer.MAX_VALUE ? "" : s.substring(sIdx, sIdx + minLen);
    }
}
