//17. Letter Combinations of a Phone Number

//Time Complexity: O(4^n) where n is the length of the input digits string. This is because each digit can map to at most 4 letters (e.g., digit '7' maps to 'pqrs').
//Space Complexity: O(n) for the recursion stack, where n is the length of the input digits string. Additionally, the space complexity for storing the results can be O(4^n) in the worst case if all combinations are generated.

class LetterCombination{
    public List<String> letterCombinations(String digits) {
         Map<Integer,String>hm=new HashMap<>();
         hm.put(2,"abc");
         hm.put(3,"def");
         hm.put(4,"ghi");
         hm.put(5,"jkl");
         hm.put(6,"mno");
         hm.put(7,"pqrs");
         hm.put(8,"tuv");
         hm.put(9,"wxyz");

         List<String>res=new ArrayList<>();
          helper(0,digits,new StringBuilder(),res,hm);
          return res;
    } 

    public void helper(int idx,String digits,StringBuilder str,List<String>res,Map<Integer,String>hm){
        //base case
         if(idx==digits.length()){
              res.add(str.toString());
              return;
         }

        String curr=hm.get(digits.charAt(idx)-'0');

        for(char ch:curr.toCharArray()){
               str.append(ch);
               helper(idx+1,digits,str,res,hm);
               str.deleteCharAt(str.length()-1);
        }
    }
}