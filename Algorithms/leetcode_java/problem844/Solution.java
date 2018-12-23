package leetcode_java.problem844;

class Solution {
    private String getString(String st){
        String s = "";
        for(char c : st.toCharArray()){
            if(c == '#'){
                int end = (s.length()-1) >= 0 ? (s.length()-1) : 0;
                s = s.substring(0, end);
            }else{
                s += c;
            }
        }
        return s;
    }
    
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }
}