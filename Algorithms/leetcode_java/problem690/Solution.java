package leetcode_java.problem690;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    private Map<Integer, Employee> id2employee = new HashMap<>();
    
    private int dfs(int id){
        Employee employee = id2employee.get(id);
        int ans = employee.importance;
        for(int i : employee.subordinates){
            ans += dfs(i);
        }
        return ans;
    }
    
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e : employees){
            id2employee.put(e.id, e);
        }
        return dfs(id);
    }
}