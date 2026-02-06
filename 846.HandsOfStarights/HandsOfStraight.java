//Problem 846. Hand of Straights
//time complexity: O(nlogn) where n is the number of cards in the hand
//space complexity: O(n) where n is the number of cards in the hand


import java.util.TreeMap;


public class HandsOfStraight {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if((n%groupSize)!=0){
            return false;
        }
        TreeMap<Integer,Integer>tm=new TreeMap<>();

        for(int el:hand){
            tm.put(el,tm.getOrDefault(el,0)+1);
        }

        while(!tm.isEmpty()){
            int key=tm.firstKey();
            int val=tm.get(key);
            for(int i=0;i<groupSize;i++){
                int card=key+i;

                if(!tm.containsKey(card) || tm.get(card)<val){
                    return false;
                }
                 // Decrease the frequency
                if (tm.get(card) == val){
                    tm.remove(card);
                }
                else{
                     tm.put(card, tm.get(card) - val);
                } 
            }
        }
        return true;
    }
}
