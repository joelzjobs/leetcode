package leetcode_java.problem599;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap();
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }
        Map<String, Integer> common = new HashMap();
        int minSum = list1.length + list2.length;
        for(int i = 0; i < list2.length; i++){
            String res = list2[i];
            if(map1.containsKey(res)){
                int curSum = i+map1.get(res);
                common.put(res, curSum);
                minSum = minSum > curSum ? curSum : minSum;
            }
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : common.entrySet()){
            String res = entry.getKey();
            int s = entry.getValue();
            if(s==minSum){
                ans.add(res);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}