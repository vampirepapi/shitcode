class Solution:
    def merge(arr, low, mid, high):
        left = low
        right = mid + 1
        temp = []
        while left <= mid and right <= high:
            if arr[left] <= arr[right]:
                temp.append(arr[left])
                left += 1
            else:
                temp.append(arr[right])
                right += 1
        
        while left <= mid:
            temp.append(arr[left])
            left += 1
        
        while right <= high:
            temp.append(arr[right])
            right += 1
        
        for i in range(low, high + 1):
            arr[i] = temp[i - low]

    def mergeSort(arr, low, high):
        if low >= high:
            return
        mid = (low + high) // 2
        Solution.mergeSort(arr, low, mid)
        Solution.mergeSort(arr, mid + 1, high)
        Solution.merge(arr, low, mid, high)

    def sortArray(self, nums: List[int]) -> List[int]:
        Solution.mergeSort(nums, 0, len(nums) - 1)
        return nums


