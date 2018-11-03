package leetcode_java.problem811;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> lookup = new HashMap<>();
        
        for(String cpdomain : cpdomains){
            String[] temp = cpdomain.split(" ");
            String[] sub = temp[1].split("\\.");
            
            for(int i = 0; i < sub.length; i++){
                String subdomain = String.join(".", Arrays.copyOfRange(sub, i, sub.length));
                int new_num = lookup.getOrDefault(subdomain, 0) + Integer.parseInt(temp[0]);
                lookup.put(subdomain, new_num);
            }
        }
        List<String> ans = new ArrayList<>();
        
        for(String domain : lookup.keySet()){
            ans.add(Integer.toString(lookup.get(domain)) + " " + domain);
        }
        
        return ans;
    }
}