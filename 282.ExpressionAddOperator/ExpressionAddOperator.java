
//282. Expression Add Operators
//Time Complexity: O(4^n) where n is the length of the input string num. In the worst case, we have 4 choices (add operator, subtract operator, multiply operator, or no operator) for each of the n-1 positions between the digits. Therefore, the total number of expressions generated can be up to 4^(n-1), which simplifies to O(4^n).
//Space Complexity: O(n) for the recursion stack and the expression string. In the worst case, the depth of the recursion can go up to n (when we consider each digit as a separate number), and the expression string can also grow up to length n in the worst case. Therefore, the space complexity is O(n). 

class ExpressionAddOperator{
    public List<String> addOperators(String num, int target) {
        List<String> res=new ArrayList<>();
        helper(num,target,0,0,0,"",res);
        return res;
    }
   
    //helper function to generate all possible expressions.
    public void helper(String num,int tar,int idx,long curr,long lastOp,String exp,List<String>res){
        //base case
        if(idx==num.length()){
           if(curr==tar){
            res.add(exp);
           }
           return;
        }

        for(int i=idx;i<num.length();i++){
            if(i>idx && num.charAt(idx)=='0'){
                break;
            }
            String currStr=num.substring(idx,i+1);

            long currVal=Long.parseLong(currStr);

            //pick first number without an operator
            if(idx==0){
                helper(num,tar,i+1,currVal,currVal,currStr,res);
            }else{
                //addition
                helper(num,tar,i+1,curr+currVal,currVal,exp+"+"+currStr,res);
                //subtraction
                helper(num,tar,i+1,curr-currVal,-currVal,exp+"-"+currStr,res);
                //multiplication
                helper(num,tar,i+1,curr-lastOp+lastOp*currVal,lastOp*currVal,exp+"*"+currStr,res);
            }
        }
    }
}