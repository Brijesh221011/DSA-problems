
public class CountPrefixes {
     public int countPrefixes(String[] words, String s) {
         int ans=0;
        for(int i=0;i<words.length;i++){
            String pref=words[i];
            if(s.indexOf(pref)==0){
                ans++;
            }
        }
        return ans;
    }
}
