
//1960. Number of Strings That Appear as Substrings in Word
//time complexity: O(n*m) n=length of word, m=length of patterns
//space complexity: O(1)

class NumberOfSubStrings{

    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;

        for(String pat:patterns){
            if(word.contains(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}