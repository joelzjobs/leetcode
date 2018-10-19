package leetcode_java.problem575;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> candySet = new HashSet<>();
        
        for(int candy : candies){ candySet.add(candy); }
        
        return Math.min(candySet.size(), candies.length / 2);
    }
}