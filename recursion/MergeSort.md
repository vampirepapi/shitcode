# Merge sort | Recursion

<u>Merge sort</u> is a sorting algorithm based on the divide-and-conquer strategy, involving the "divide" and "merge" phases shown in the figure below.

1. **Divide phase**: Recursively split the array from the midpoint, transforming the sorting problem of a long array into that of shorter arrays.
2. **Merge phase**: Stop dividing when the length of the sub-array is 1, start merging, and continuously combine two shorter ordered arrays into one longer ordered array until the process is complete.

![The divide and merge phases of merge sort](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_overview.png)

## Algorithm workflow

As shown in the figure below, the "divide phase" recursively splits the array from the midpoint into two sub-arrays from top to bottom.

1. Calculate the midpoint `mid`, recursively divide the left sub-array (interval `[left, mid]`) and the right sub-array (interval `[mid + 1, right]`).
2. Continue with step `1.` recursively until the sub-array interval length is 1 to stop.

The "merge phase" combines the left and right sub-arrays into a single ordered array from bottom to top. Note that merging starts with sub-arrays of length 1, and each sub-array is ordered during the merge phase.

=== "<1>"
    ![Merge sort process](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step1.png)

=== "<2>"
    ![merge_sort_step2](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step2.png)

=== "<3>"
    ![merge_sort_step3](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step3.png)

=== "<4>"
    ![merge_sort_step4](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step4.png)

=== "<5>"
    ![merge_sort_step5](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step5.png)

=== "<6>"
    ![merge_sort_step6](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step6.png)

=== "<7>"
    ![merge_sort_step7](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step7.png)

=== "<8>"
    ![merge_sort_step8](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step8.png)

=== "<9>"
    ![merge_sort_step9](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step9.png)

=== "<10>"
    ![merge_sort_step10](https://raw.githubusercontent.com/krahets/hello-algo/main/en/docs/chapter_sorting/merge_sort.assets/merge_sort_step10.png)

It is observed that the order of recursion in merge sort is consistent with the post-order traversal of a binary tree.

- **Post-order traversal**: First recursively traverse the left subtree, then the right subtree, and finally handle the root node.
- **Merge sort**: First recursively handle the left sub-array, then the right sub-array, and finally perform the merge.

The implementation of merge sort is shown in the following code. Note that the interval to be merged in `nums` is `[left, right]`, while the corresponding interval in `tmp` is `[0, right - left]`.

>Java Code
```java
public static void merge(int[] nums, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    List<Integer> ans = new ArrayList<>();
    while (left <= mid && right <= high) {
        if (nums[left] <= nums[right]) {
            ans.add(nums[left]);
            left++;
        } else {
            ans.add(nums[right]);
            right++;
        }
    }
    while (left <= mid) {
        ans.add(nums[left]);
        left++;
    }
    while (right <= high) {
        ans.add(nums[right]);
        right++;
    }
    // move all elements to the original array
    for (int i = low; i <= high; i++) {
        nums[i] = ans.get(i - low);
    }
}

private static void mergeSort(int[] nums, int low, int high) {
    if (low >= high) {
        return;
    }
    int mid = (low + high) / 2;
    mergeSort(nums, low, mid);
    mergeSort(nums, mid + 1, high);
    merge(nums, low, mid, high);
}

```
>Python Code
```Python
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

```

## Algorithm characteristics

- **Time complexity of $O(n \log n)$, non-adaptive sort**: The division creates a recursion tree of height $\log n$, with each layer merging a total of $n$ operations, resulting in an overall time complexity of $O(n \log n)$.
- **Space complexity of $O(n)$, non-in-place sort**: The recursion depth is $\log n$, using $O(\log n)$ stack frame space. The merging operation requires auxiliary arrays, using an additional space of $O(n)$.
- **Stable sort**: During the merging process, the order of equal elements remains unchanged.

### Ref :- 
- [merge_sort](https://www.hello-algo.com/en/chapter_sorting/merge_sort/#1163-linked-list-sorting)
- [YT- merge_sort](https://youtu.be/ogjf7ORKfd8)