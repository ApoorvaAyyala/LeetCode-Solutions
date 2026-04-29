# Number of Subarrays With LCM Equal to K
class Solution:
    def subarrayLCM(self, nums, k):
        def gcd(a, b):
            while b:
                a, b = b, a % b
            return a
        def lcm(a, b):
            return (a * b) // gcd(a, b)
        n = len(nums)
        ans = 0
        for i in range(n):
            curr = 1
            for j in range(i, n):
                if k % nums[j] != 0:
                    break
                curr = lcm(curr, nums[j])
                if curr == k:
                    ans += 1
                elif curr > k or k % curr != 0:
                    break
        return ans