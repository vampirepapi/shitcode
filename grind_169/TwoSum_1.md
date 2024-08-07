### Solving the Two Sum Problem: Three Approaches in Java

The Two Sum problem is a classic algorithmic challenge that appears frequently in coding interviews and competitive programming. The problem statement is simple: given an array of integers and a target sum, find the indices of the two numbers that add up to the target sum. In this post, we'll explore three different approaches to solve this problem in Java.

### Problem Statement

Given an array of integers [`nums`](command:_github.copilot.openSymbolFromReferences?%5B%22nums%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A8%2C%22character%22%3A30%7D%7D%5D%5D "Go to definition") and an integer [`target`](command:_github.copilot.openSymbolFromReferences?%5B%22target%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A8%2C%22character%22%3A40%7D%7D%5D%5D "Go to definition"), return the indices of the two numbers such that they add up to the target.

### Example

```java
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Best Approach
- Best way to solve this problem is using HashMap.
- Compute the difference between the target and the current element.
- If the difference exists in the HashMap, return the indices.

### Approach 1: Two Pointer Technique

If the array is sorted, we can use the two-pointer technique to solve this problem efficiently.

#### Algorithm

1. Initialize two pointers: [`left`](command:_github.copilot.openSymbolFromReferences?%5B%22left%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A9%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition") at the start of the array and [`right`](command:_github.copilot.openSymbolFromReferences?%5B%22right%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A10%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition") at the end.
2. While [`left`](command:_github.copilot.openSymbolFromReferences?%5B%22left%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A9%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition") is less than [`right`](command:_github.copilot.openSymbolFromReferences?%5B%22right%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A10%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition"):
   - If the sum of [`nums[left]`](command:_github.copilot.openSymbolFromReferences?%5B%22nums%5Bleft%5D%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A8%2C%22character%22%3A30%7D%7D%5D%5D "Go to definition") and [`nums[right]`](command:_github.copilot.openSymbolFromReferences?%5B%22nums%5Bright%5D%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A8%2C%22character%22%3A30%7D%7D%5D%5D "Go to definition") equals the target, return the indices.
   - If the sum is greater than the target, decrement the [`right`](command:_github.copilot.openSymbolFromReferences?%5B%22right%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A10%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition") pointer.
   - If the sum is less than the target, increment the [`left`](command:_github.copilot.openSymbolFromReferences?%5B%22left%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A9%2C%22character%22%3A12%7D%7D%5D%5D "Go to definition") pointer.
3. If no solution is found, return `[0, 0]`.

#### Code

```java
public int[] twoSum(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        if (nums[left] + nums[right] == target) {
            return new int[]{left, right};
        } else if (nums[left] + nums[right] > target) {
            right--;
        } else {
            left++;
        }
    }
    return new int[]{0, 0};
}
```

#### Time Complexity

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

### Approach 2: Brute Force

The brute force approach involves checking all possible pairs of numbers to find the solution. This approach has a time complexity of O(n^2).

#### Algorithm

1. Iterate through each element in the array.
2. For each element, iterate through the remaining elements to check if their sum equals the target.
3. If a pair is found, return their indices.
4. If no solution is found, return `[0, 0]`.

#### Code

```java
public int[] twoSum_2(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{0, 0};
}
```

#### Time Complexity

- **Time Complexity**: O(n^2)
- **Space Complexity**: O(1)

### Approach 3: HashMap

The optimized approach uses a HashMap to store the elements and their indices. This approach has a time complexity of O(n).

#### Algorithm

1. Create a HashMap to store the elements and their indices.
2. Iterate through the array:
   - Calculate the difference between the target and the current element.
   - If the difference exists in the HashMap, return the indices.
   - Otherwise, add the current element and its index to the HashMap.
3. If no solution is found, return [`null`](command:_github.copilot.openSymbolFromReferences?%5B%22null%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Cshubhsou%5C%5CShubham%5C%5Cshitcode%5C%5Cgrind_169%5C%5CTwoSum_1.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2Fshubhsou%2FShubham%2Fshitcode%2Fgrind_169%2FTwoSum_1.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A49%2C%22character%22%3A15%7D%7D%5D%5D "Go to definition").

#### Code

```java
public int[] twoSum_3(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        int diff = target - num;
        if (map.containsKey(diff)) {
            return new int[]{i, map.get(diff)};
        }
        map.put(nums[i], i);
    }
    return null;
}
```

#### Time Complexity

- **Time Complexity**: O(n)
- **Space Complexity**: O(n)



