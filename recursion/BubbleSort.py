def bubbleSort(nums):
    for i in range(len(nums)-1,0,-1):
        flag=False;
        for j in range(i):
            if nums[j]>nums[j+1]:
                nums[j],nums[j+1]=nums[j+1],nums[j];
                flag=True;

        if not flag:
            break;
    return nums;
