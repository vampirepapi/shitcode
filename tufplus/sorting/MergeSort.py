class Solution:
    def mergeSort(self, nums):
        self.mergeSortAlgo(nums, 0, len(nums) - 1)
        return nums
    
    def mergeSortAlgo(self, nums, low, high):
        # base case
        if low >= high:
            return
        # find mid
        mid = (low + high) // 2
        # divide
        self.mergeSortAlgo(nums, low, mid)
        self.mergeSortAlgo(nums, mid + 1, high)
        # merge
        self.merge(nums, low, mid, high)
    
    def merge(self, nums, low, mid, high):
        # create temp array
        temp = []
        # two pointers
        i=low
        j=mid+1
        # traverse both arrays
        while i<=mid and j<=high:
            if nums[i] <= nums[j]:
                temp.append(nums[i])
                i+=1
            else:
                temp.append(nums[j])
                j+=1
        # copy remaining elements
        while i<=mid:
            temp.append(nums[i])
            i+=1
        while j<=high:
            temp.append(nums[j])
            j+=1
        # copy back to original array

        # for example, if nums=[3,5,7,2,1,4], low=0, high=5, temp=[1,2,3,4,5,7]
        # then, nums will be [1,2,3,4,5,7]
        for i in range(low, high + 1):
            nums[i] = temp[i - low]
        
