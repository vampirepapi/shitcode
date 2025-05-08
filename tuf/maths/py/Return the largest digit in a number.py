class Solution:
    def largestDigit(self, n):
        maxD=0
        while n>0:
            maxD=max(maxD,n%10)
            n//=10
        return maxD