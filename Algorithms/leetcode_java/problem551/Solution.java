package leetcode_java.problem551;

class Solution {
    public boolean checkRecord(String s) {
        boolean hasAbsent = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='A'){
                if(hasAbsent){ return false; }
                hasAbsent = true;
            }
            if(i>1 && s.charAt(i)=='L' && s.charAt(i-1)=='L' && s.charAt(i-2)=='L'){
                return false;
            }
        }
        return true;
    }
}