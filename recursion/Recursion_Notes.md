# Recursion - 
IMP Links - 
- [Striver Recursion YT ](https://www.youtube.com/watch?v=un6PLygfXrA&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=2)
- [Aditya Verma - Recursion / good playlist on recursion](https://www.youtube.com/playlist?list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY)
- [awesome-leetcode-resources](https://github.com/ashishps1/awesome-leetcode-resources?tab=readme-ov-file)
- [Become Master In Recursion](https://leetcode.com/discuss/study-guide/1733447/become-master-in-recursion)
- [Recursion LC problems](https://leetcode.com/tag/recursion/)

**When a function calls itself until a specified condition is met, it is called recursion.**

### Recursion Example- 
```python
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
```
In the above example, the function factorial() calls itself until n is equal to 0. When n is equal to 0, the function returns 1 and the recursion stops.

#### Dryrun - 
```
factorial(3) = 3 * factorial(2)
factorial(2) = 2 * factorial(1)
factorial(1) = 1 * factorial(0)
factorial(0) = 1
```
So, factorial(3) = 3 * 2 * 1 * 1 = 6

#### Dryrun with stack diagram-
```
factorial(3) -> 3 * factorial(2) -> 3 * 2 * factorial(1) -> 3 * 2 * 1 * factorial(0) -> 3 * 2 * 1 * 1 
    factorial(2) -> 2 * factorial(1) -> 2 * 1
        factorial(1) -> 1
            factorial(0) -> 1
```

- In recursion, the function calls are stored in a stack. When the base condition is met, the function calls are popped from the stack and the final result is calculated.
- Base condition is very important in recursion, otherwise the function will keep calling itself infinitely and will lead to stack overflow error.

#### Base condition example - 
```python
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
```
here base condition is n == 0, when n is 0, the function returns 1 and recursion stops.

### Recursion vs Iteration -
Recursion is a powerful tool, but it is not always the best choice. Recursion can be slow and uses more memory than iteration. In some cases, recursion can lead to a stack overflow error. In general, recursion is best suited for problems that can be broken down into smaller, similar subproblems.

Iterative solutions are often more efficient and easier to understand than recursive solutions. However, there are some problems that are more naturally solved using recursion.
## Basics Recursion Problems - 
### 1. print name n times
```java 
public static void printName(String name, int n) {
    if (n == 0) {
        return;
    }
    System.out.println(name);
    printName(name, n-1);
}
```
dryrun -
```
printName("John", 3) -> John
    printName("John", 2) -> John
        printName("John", 1) -> John
            printName("John", 0) -> return
```
#### Tc = O(n)
#### Sc = O(n) // why? because n function calls are stored in stack.
### 2. print numbers from 1 to n
```java
public static void printNumbers(int n) {
    if (n == 0) {
        return;
    }
    printNumbers(n-1);
    System.out.println(n);
}
```
dryrun -
```
printNumbers(3) -> printNumbers(2) -> printNumbers(1) -> printNumbers(0) -> return
    1
    2
    3
```
### 3. print numbers from n to 1
```java
public static void printNumbers(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    printNumbers(n-1);
}
```
dryrun -
```
printNumbers(3) -> 3
    printNumbers(2) -> 2
        printNumbers(1) -> 1
            printNumbers(0) -> return
```
### 4. print linearly from 1 to n but by backtracking
```java
public static void printNumbers(int n) {
    if (n == 0) {
        return;
    }
    printNumbers(n-1);
    System.out.println(n);
    printNumbers(n-1);
}
```
dryrun -
```
printNumbers(3) -> printNumbers(2) -> printNumbers(1) -> printNumbers(0) -> return
    1
    printNumbers(1) -> printNumbers(0) -> return
        2
        printNumbers(2) -> printNumbers(1) -> printNumbers(0) -> return
            1
            printNumbers(1) -> printNumbers(0) -> return
                3
                printNumbers(3) -> printNumbers(2) -> printNumbers(1) -> printNumbers(0) -> return
                    1
                    printNumbers(1) -> printNumbers(0) -> return
                        2
                        printNumbers(2) -> printNumbers(1) -> printNumbers(0) -> return
                            1
                            printNumbers(1) -> printNumbers(0) -> return
```
**Output - 1 2 1 3 1 2 1**

### 5. print numbers from n to 1 but by backtracking
```java
public static void printNumbers(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    printNumbers(n-1);
    System.out.println(n);
}
```
dryrun -
```
printNumbers(3) -> 3
    printNumbers(2) -> 2
        printNumbers(1) -> 1
            printNumbers(0) -> return
        2
    3
```
**Output - 3 2 1 2 3**

### 6. sum of n natural numbers
- This can done using two ways
    - parametrized recursion - where we pass the sum so far as a parameter.
    - non-parametrized recursion - where we don't pass the sum so far as a parameter.

#### Non-Parametrized Recursion
```java
public static int sum(int n) {
    if (n == 0) {
        return 0;
    }
    return n + sum(n - 1);
}
```
dryrun -
```
sum(3) = 3 + sum(2)
sum(2) = 2 + sum(1)
sum(1) = 1 + sum(0)
sum(0) = 0
```
**Output - 6**

#### Parametrized Recursion
```java
public static int sum(int n) {
    return sumHelper(n, 0);
}

private static int sumHelper(int n, int acc) {
    if (n == 0) {
        return acc;
    }
    return sumHelper(n-1, acc + n);
}
```
dryrun -

Let's dry run the provided recursive method `sum(int n)` with an example input of `n = 3`. This method calculates the sum of all numbers from 1 to `n` using a helper function `sumHelper(int n, int acc)` where `n` is the current number and `acc` is the accumulator that holds the sum so far.

### Initial Call
- `sum(3)`
  - This calls `sumHelper(3, 0)`

### First Call to `sumHelper`
- `sumHelper(3, 0)`
  - `n` is not `0`, so it calls `sumHelper(n-1, acc + n)` which is `sumHelper(2, 3)`

### Second Call to `sumHelper`
- `sumHelper(2, 3)`
  - Again, `n` is not `0`, so it calls `sumHelper(n-1, acc + n)` which is `sumHelper(1, 5)`

### Third Call to `sumHelper`
- `sumHelper(1, 5)`
  - `n` is still not `0`, so it calls `sumHelper(n-1, acc + n)` which is `sumHelper(0, 6)`

### Fourth Call to `sumHelper`
- `sumHelper(0, 6)`
  - This time, `n` is `0`, so it returns `acc` which is `6`

### Conclusion
The recursive calls build up as follows:
1. `sumHelper(3, 0)` calls `sumHelper(2, 3)`
2. `sumHelper(2, 3)` calls `sumHelper(1, 5)`
3. `sumHelper(1, 5)` calls `sumHelper(0, 6)`
4. `sumHelper(0, 6)` returns `6`

Thus, the sum of numbers from 1 to 3 is `6`.

### 7. Reverse an array using recursion
> **First we will see how to reverse an array using iteration and then we will see how to reverse an array using recursion.**

#### Iterative Approach
```java
void reverse (int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
```

#### Recursive Approach
```java 
    public static void revArr(int[] arr, int i, int j) {
        if (i >= j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        revArr(arr, i + 1, j - 1);
    }
```
#### Dryrun - 
```
revArr([1, 2, 3, 4, 5], 0, 4) -> 5 2 3 4 1
    revArr([1, 2, 3, 4, 5], 1, 3) -> 5 4 3 2 1
        revArr([1, 2, 3, 4, 5], 2, 2) -> return
```
**Output - 5 4 3 2 1**

### Reverse array using single pointer -
```java
public static void revArr(int[] arr, int i) {
    if (i >= arr.length / 2)
        return;
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
    revArr(arr, i + 1);
}
```
#### 8. Check if a string is a plaindrome

#### Iterative Approach
```java
    public static boolean palindromeStr(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (j > i) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
```
#### Recursive Approach
```java
    public static boolean palindromeStr(String str, int i, int j) {
        if (j <= i)
            return true;
        if (str.charAt(i) != str.charAt(j))
            return false;
        return palindromeStr(str, i + 1, j - 1);
    }
```
#### Dryrun - 
```
palindromeStr("madam", 0, 4) -> true
    palindromeStr("madam", 1, 3) -> true
        palindromeStr("madam", 2, 2) -> true
```
**Output - true**

#### Recursive Approach - Single Pointer
```java
    public static boolean palindromeStr(String str, int i) {
        if (i >= str.length() / 2)
            return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return palindromeStr(str, i + 1);
    }
```  
#### TC = O(n) // why? because we are iterating through the string only once.
#### SC = O(n) // why? because n function calls are stored in stack.

#### 9. Fibonacci Series
> What is fibonacci series - 
> - The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

#### Iterative Approach
```java
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
```
#### Recursive Approach
```java
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
```
#### Dryrun - 
```
fibonacci(5) = fibonacci(4) + fibonacci(3)
fibonacci(4) = fibonacci(3) + fibonacci(2)
fibonacci(3) = fibonacci(2) + fibonacci(1)
fibonacci(2) = fibonacci(1) + fibonacci(0)
```
#### TC = O(2^n) // exponential time complexity // why? because for each n, we are calling two recursive calls.
#### SC = O(n) // why? because n function calls are stored in stack.
