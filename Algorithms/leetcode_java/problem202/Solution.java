package leetcode_java.problem202;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            int sum = 0;
            while(n!=0){
                sum += Math.pow(n%10,2);
                n = n/10;
            }
            n = sum;
        }
        return n==1;
    }
}