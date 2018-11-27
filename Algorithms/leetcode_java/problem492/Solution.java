package leetcode_java.problem492;

class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        ans[1] = (int)Math.sqrt(area);
        while(area%ans[1]!=0){
            ans[1]--;
        }
        ans[0] = area / ans[1];
        return ans;
    }
}
