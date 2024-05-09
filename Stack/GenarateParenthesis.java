//package Stack;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Stack;
//import java.util.function.Consumer;
//
//// Time complexity - O(2^n * n);
//// space complexity - O(2n+2^n⋅n)
//class Solution3{
//    Stack<Character> st = new Stack<>();
//    List<String> res = new ArrayList<>();
//    public List<String> GenerateParenthesis(int n) {
//        //Intuition behind  - only add an open paranthesis if open<n
//        //only add a closing parenthesis if close<open
//        //valid iif open == close == n
//        backtrack(0,0,n);
//        return res;
//    }
//    private void backtrack(int openN, int closeN, int n) {
//        if(openN == closeN && closeN==n){
//            Iterator it = new Stack.Solution3.iterator();
//            String temp = "";
//            if(it.hasNext()){
//                temp = temp+it.next();
//            }
//            res.add(temp);
//        }
//        if(openN<n){
//            st.push('(');
//            backtrack(openN+1,closeN,n);
//            st.pop();
//        }
//        if(closeN<openN){
//            st.push(')');
//            backtrack(openN,closeN+1,n);
//            st.pop();
//        }
//    }
//    private class iterator implements Iterator {
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public Object next() {
//            return null;
//        }
//
//        @Override
//        public void remove() {
//            Iterator.super.remove();
//        }
//
//        @Override
//        public void forEachRemaining(Consumer action) {
//            Iterator.super.forEachRemaining(action);
//        }
//    }
//}
//class Generate{
//    public static void main(String[] args) {
//        Solution3 s = new Solution3();
//        System.out.println(s.GenerateParenthesis(3));
//    }
//}