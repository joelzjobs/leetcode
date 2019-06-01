class Solution:
    def toHex(self, num):
        if 0 <= num < 10:
            return str(num)
        if num < 0:
            num = num + 2**32
        chars = [str(i) if i < 10 else chr(i-10+ord('a')) for i in range(16)]
        res = []
        while num:
            res.append(chars[num&15])
            num >>= 4
        return "".join(res[::-1])