package leetcode_java.prolbem350;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums1){
            counter.put(num, counter.getOrDefault(num, 0)+1);
        }
        for(int num : nums2){
            if(counter.getOrDefault(num,0)>0){
                res.add(num);
                counter.put(num, counter.get(num)-1);
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}