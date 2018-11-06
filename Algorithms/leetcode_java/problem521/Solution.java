package leetcode_java.problem521;

class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){ return -1; }
        return a.length() > b.length() ? a.length() : b.length();
    }
}