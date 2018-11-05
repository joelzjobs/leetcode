package leetcode_java.problem243;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int ans = words.length;
        int[] idx = {-1, -1};
        
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                idx[0] = i;
            }
            if(words[i].equals(word2)){
                idx[1] = i;
            }
            if(idx[0] != -1 && idx[1] != -1){
                int curDist = Math.abs(idx[0] - idx[1]);
                ans = ans > curDist ? curDist : ans;
            }
        }
        return ans;
    }
}