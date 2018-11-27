package leetcode_java.problem349;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n : nums1){ set1.add(n); }
        for(int n : nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }
        int[] ans = new int[set2.size()];
        int i = 0;
        for(int val : set2)
            ans[i++] = val;
        return ans;
    }
}
