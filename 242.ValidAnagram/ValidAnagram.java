class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>hm=new HashMap<>();

        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int freq[]=new int[26];
        for(char ch:t.toCharArray()){
           freq[ch-'a']++;
        }

        for(char ch:t.toCharArray()){
            if(!hm.containsKey(ch)){
                return false;
            }else{
                if(hm.get(ch)!=freq[ch-'a']){
                    return false;
                }
            }
        }
        return true;
    }
}