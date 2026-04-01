
// 2351. First Letter to Appear Twice
//time complexity: O(n), where n is the length of the string
//space complexity: O(1), as the frequency array has a fixed size of 26

class  FirstLetterAppearTwice{
    public char repeatedCharacter(String s) {
        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;

            if(freq[ch-'a']==2){
                return ch;
            }
        }
        return '0';
    }
}