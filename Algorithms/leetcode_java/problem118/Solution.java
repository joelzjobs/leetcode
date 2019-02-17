package leetcode_java.problem118;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int r = 0; r < numRows; r++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int c = 1; c < r; c++){
                row.add(result.get(r-1).get(c-1)+result.get(r-1).get(c));
            }
            if(r>0){ row.add(1); }
            result.add(row);
        }
        return result;
    }
}
