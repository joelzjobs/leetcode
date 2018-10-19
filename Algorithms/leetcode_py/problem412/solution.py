class Solution:
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        def func(num):
            if num % 15 == 0:
                return "FizzBuzz"
            if num % 3 == 0:
                return "Fizz"
            if num % 5 == 0:
                return "Buzz"
            return str(num)
        
        return [func(num) for num in range(1, n+1)]
