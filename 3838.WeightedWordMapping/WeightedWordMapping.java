//3838. Weighted Word Mapping
//time complexity: O(n*m) where n is the number of words and m is the average length of the words
//space complexity: O(1) 

class WeightedWordMapping{
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        
        for(String word:words){
             int sum=0;
             for(char ch:word.toCharArray()){
                sum=(sum+weights[ch-'a'])%26;
             }
             int idx=sum%26;
             char map=(char)('z'-idx);
              sb.append(map);
        }
         return sb.toString();
    }
}