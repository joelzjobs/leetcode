package leetcode_java.problem717;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int pointer = 0;
        while(pointer < bits.length - 1)
            pointer += (bits[pointer] == 1 ? 2 : 1);
        return pointer == bits.length - 1;
    }
}