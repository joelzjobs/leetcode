package leetcode_java.problem819;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> banset = new HashSet<>();
        for(String banword : banned){ banset.add(banword); }
        String[] words = paragraph.toLowerCase().split("[!?',;.\\s]+");
        Map<String, Integer> counter = new HashMap<>();
        
        for(String word : words){
            if(!banset.contains(word)){
                Integer num = counter.getOrDefault(word, 0) + 1;
                counter.put(word, num);
            }
        }
        
        String ans = "";
        Integer maxFreq = 0;
        
        for(Map.Entry<String, Integer> entry : counter.entrySet()){
            String word = entry.getKey();
            Integer freq = entry.getValue();
            if(freq > maxFreq){
                ans = word;
                maxFreq = freq;
            }
        }
        return ans;
    }
}