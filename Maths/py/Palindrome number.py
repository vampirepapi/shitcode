class Solution:
    def isPalindrome(self, n):
        rev=0
        temp=n
        while n>0:
            rev=rev*10+n%10
            n//=10
        if rev==temp:
            return True
        else:
            return False

# TC = Ologn
# SC = O1