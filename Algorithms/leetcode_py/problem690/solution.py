"""
# Employee info
class Employee:
    def __init__(self, id, importance, subordinates):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution:
    def getImportance(self, employees, id):
        """
        :type employees: Employee
        :type id: int
        :rtype: int
        """
        id2employee = {e.id : e for e in employees}
        def dfs(i):
            employee = id2employee[i]
            return employee.importance + sum(dfs(s_id) for s_id in employee.subordinates)
        return dfs(id)