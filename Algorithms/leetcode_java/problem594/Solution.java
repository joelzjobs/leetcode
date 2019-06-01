package leetcode_java.problem594;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int res = 0;
        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0)+1);
        }
        for(int num : counter.keySet()){
            if(counter.containsKey(num+1)){
                int curRes = counter.get(num)+counter.get(num+1);
                res = curRes > res ? curRes : res;
            }
        }
        return res;
    }
}