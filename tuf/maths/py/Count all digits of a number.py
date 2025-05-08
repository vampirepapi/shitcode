class Solution:
    def countDigit(self, n):
        cnt=0
        if n==0: return 1
        while n>0:
            cnt+=1
            n//=10
        return cnt

n = 234
ob = Solution()
print(ob.countDigit(n))