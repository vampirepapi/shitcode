class Solution:
    def countOddDigit(self, n):
        cntOdd=0
        while n>0:
            if ((n%10)%2)==1:
                cntOdd+=1
            n=n//10
        return cntOdd

n = 123
s = Solution();
print(s.countOddDigit(n))