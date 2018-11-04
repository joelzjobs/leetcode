class MovingAverage:

    def __init__(self, size):
        """
        Initialize your data structure here.
        :type size: int
        """
        self._size = size
        self._array = []
        self._sum = 0

    def next(self, val):
        """
        :type val: int
        :rtype: float
        """
        self._sum += val
        self._array.append(val)
        if len(self._array) > self._size:
            self._sum -= self._array.pop(0)
        return self._sum / len(self._array)
        


# Your MovingAverage object will be instantiated and called as such:
# obj = MovingAverage(size)
# param_1 = obj.next(val)