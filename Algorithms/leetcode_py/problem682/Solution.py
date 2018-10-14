
class Solution:
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        ans = 0
        history = []
        
        for op in ops:
            if op == "+":
                increment = history[-1] + history[-2]
                history.append(increment)
            elif op == "D":
                increment = history[-1] * 2
                history.append(increment)
            elif op =="C":
                increment = - history.pop()
            else:
                increment = int(op)
                history.append(increment)
                
            ans += increment
        
        return ans