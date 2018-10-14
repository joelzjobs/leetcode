package leetcode_java.problem682;

import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        int ans = 0;
        int increment = 0;
        Stack<Integer> history = new Stack<>();
        
        for(String op : ops){
            if(op.equals("+")){
                int lastOne = history.pop();
                int lastTwo = history.peek();
                increment = lastOne + lastTwo;
                history.push(lastOne);
                history.push(increment);
            }else if(op.equals("D")){
                increment = history.peek() * 2;
                history.push(increment);
            }else if(op.equals("C")){
                increment = -history.pop();
            }else {
                increment = Integer.parseInt(op);
                history.push(increment);
            }
            
            ans += increment;
        }
        
        return ans;        
    }
}