
//3120. Count Number of Special Character I
//time complexity: O(n), where n is the length of the string
//space complexity: O(n)

class SpecialCharacter {
   public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(char ch:word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        
        for(char ch='a';ch<='z';ch++){
            if(hm.containsKey(ch) && hm.containsKey((char)(ch-'a'+'A'))){
                cnt++;
            }
        }
        return cnt;
    }
}