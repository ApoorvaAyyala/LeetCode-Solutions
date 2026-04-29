from functools import reduce

class Solution(object):
    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a
    
    def isGoodArray(self, nums):
        g = nums[0]
        for num in nums[1:]:
            g = self.gcd(g, num)
            if g == 1:
                return True
        return g == 1