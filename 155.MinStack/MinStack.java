import java.util.Stack;

class MinStack {
     Stack<Integer>st;
     int minVal;
    public MinStack() {
        st=new Stack<>();
        minVal=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(minVal>=val){
            st.push(minVal);
            minVal=val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop()==minVal){
            minVal=st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        return minVal;
    }
}
