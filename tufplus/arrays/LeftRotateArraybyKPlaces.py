class Solution:
    def rotateArray(self, nums, k):
        k = k % len(nums)
        ans = []
        for i in range(k,len(nums)):
            ans.append(nums[i])
        for j in range(k):
            ans.append(nums[j])
        
        x=0
        for ele in ans:
            nums[x] = ele
            x+=1
        