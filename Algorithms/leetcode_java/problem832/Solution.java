package leetcode_java.problem832;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++){
            int rowLen = A[i].length;
            int[] temp = new int[rowLen];
            for(int j = rowLen - 1; j >= 0; j--){
                temp[rowLen-1-j] = 1 - A[i][j];
            }
            A[i] = temp;
        }
        return A;
    }
}