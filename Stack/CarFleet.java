package Stack;

import java.util.Arrays;
import java.util.Stack;

class Solution4{
    public int CarFleet(int target, int[] positions, int[] speed) {
        Stack<Double> st = new Stack<>();
        double time = 0;
        int[][] combine = new int[positions.length][2];
        for(int i=0;i<positions.length;i++){
            combine[i][0] = positions[i];
            combine[i][1] = speed[i];
        }
        Arrays.sort(combine, java.util.Comparator.comparingInt(o->o[0]));
        for(int i=positions.length-1;i>=0;i--){
            time = (double)(target-combine[i][0]/combine[i][1]);
            if(!st.isEmpty() && time<=st.peek()){
                continue;
            }else{
                st.push(time);
            }
        }
        return st.size();
    }
}
class Fleet{
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.CarFleet(12,new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }
}