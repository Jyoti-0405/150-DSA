package Stack;

import java.util.Stack;

//Intuition behind the problem - in min stack the min value will always be on top of the stack so, in order to achieve that functionality
// we take two stacks one to do all the normal operations and other is to store min value specifically, while pushing value on the storeMin stack
// we make sure to compare whether it is the min value so far or not. top is taken from the normal stack while min value is taken from storeMin stack.

class MinStack {
    Stack<Integer> st;
    Stack<Integer> storeMin;
    public MinStack(){
        st = new Stack<>();
        storeMin = new Stack<>();
    }
    public void push(int val){
      st.push(val);
      val = Math.min(val,st.isEmpty()?val: storeMin.peek());
      storeMin.push(val);
    }
    public void pop(){
        st.pop();
        storeMin.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return storeMin.peek();
    }
}


