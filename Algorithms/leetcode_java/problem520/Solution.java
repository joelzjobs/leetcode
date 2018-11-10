package leetcode_java.problem520;

class Solution {
    public boolean detectCapitalUse(String word) {
        return (word.equals(word.toLowerCase())) || (word.equals(word.toUpperCase())) || (word.equals(Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase()));
    }
}