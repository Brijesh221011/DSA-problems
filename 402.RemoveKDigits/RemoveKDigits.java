//Problem 402. Remove K Digits
//time complexity: O(n),where n is the length of the input string
//space complexity: O(n)

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();

        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            if(st.isEmpty() && ch=='0'){
                continue;
            }
            st.push(ch);
        }

        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        if(st.isEmpty()){
            return "0";
        }

        StringBuilder res=new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
