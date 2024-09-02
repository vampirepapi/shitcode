class Solution:
    def quickSort(self, nums):
        self.quickSortAlgo(nums, 0, len(nums) - 1)
        return nums
    
    def quickSortAlgo(self, nums, low, high):
        if low >= high: return

        partitionIdx = self.partition(nums,low,high)

        self.quickSortAlgo(nums, low, partitionIdx-1)
        self.quickSortAlgo(nums, partitionIdx+1, high)
    
    def partition(self, nums, low, high):
        i=low
        j=high
        pivot = nums[low]

        while i<j:
            while nums[i] <= pivot and i<= high-1:
                i+=1
            
            while nums[j] > pivot and j>= low+1:
                j-=1
            
            if i<j:
                nums[i],nums[j] = nums[j],nums[i]

        nums[low],nums[j] = nums[j], nums[low]
        return j

