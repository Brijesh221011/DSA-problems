
// 2515. Shortest Distance to Target String in Circular Array
//time complexity: O(n), where n is the length of words
//space complexity: O(1)


class ShortestDistanceToTarget{
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int shortest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
               int forward = (i - startIndex + n) % n;
                int backward = (startIndex - i + n) % n;
                int distance = Math.min(forward,backward);
                shortest=Math.min(shortest,distance);
            }
        }
        if(shortest==Integer.MAX_VALUE){
            return -1;
        }
        return shortest;
    }
}