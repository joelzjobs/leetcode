package leetcode_java.problem447;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for(int[] point1 : points){
            Map<Double, Integer> counter = new HashMap<>();
            for(int[] point2 : points){
                if(point1[0]!=point2[0] || point1[1]!=point2[1]){
                    double distance = Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2);
                    counter.put(distance, counter.getOrDefault(distance, 0)+1);
                }
            }
            for(int n : counter.values()){
                ans += n*(n-1);
            }
        }
        return ans;
    }
}