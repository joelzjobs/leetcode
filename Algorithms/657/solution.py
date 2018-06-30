class Solution:
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        record = {}
        for move in moves:
            record[move] = record.get(move, 0) + 1
        return record.get('U', 0) == record.get('D', 0) and record.get('L', 0) == record.get('R', 0)