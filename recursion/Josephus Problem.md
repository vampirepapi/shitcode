### [Josephus Problem Explained 🎯 ](https://youtu.be/ULUNeD0N9yI?si=7sCQtOfDpS8uWner)

## Brute Force Approach

To solve this problem using a brute-force approach, we can simulate the game step by step. This involves maintaining a list of friends and eliminating every \(k\)-th friend until only one friend remains. Here’s how we can implement this:

1. **Initialize the List**: Create a list of friends numbered from 1 to \(n\).
2. **Simulate the Elimination**: Start from the first friend and count \(k\) friends in the clockwise direction, wrapping around the list if necessary.
3. **Eliminate the Friend**: Remove the \(k\)-th friend from the list.
4. **Repeat**: Continue the process with the next friend immediately clockwise of the eliminated friend.
5. **Stop**: When only one friend is left, they are the winner.


### Explanation:

1. **Initialization**:
   - `friends` is a list of integers from 1 to \(n\) representing the friends.
   - `index` keeps track of the current position in the circle (0-based index).

2. **Elimination Loop**:
   - The loop runs until only one friend remains in the list.
   - In each iteration:
     - Calculate the index of the friend to eliminate: `(index + k - 1) % len(friends)`. This ensures that the counting wraps around the list correctly.
     - Remove the friend at the calculated index from the list.
     - The `index` automatically points to the next friend (because removing an element shifts all elements to the left).

3. **Winner**:
   - After the loop, the only remaining element in the `friends` list is the winner.

### Example Walkthrough (\(n = 5\), \(k = 2\)):

1. Initial list: `[1, 2, 3, 4, 5]`, start at `index = 0`.
2. Eliminate friend at `(0 + 2 - 1) % 5 = 1`, list becomes `[1, 3, 4, 5]`, next start at `index = 1`.
3. Eliminate friend at `(1 + 2 - 1) % 4 = 2`, list becomes `[1, 3, 5]`, next start at `index = 2`.
4. Eliminate friend at `(2 + 2 - 1) % 3 = 0`, list becomes `[3, 5]`, next start at `index = 0`.
5. Eliminate friend at `(0 + 2 - 1) % 2 = 1`, list becomes `[3]`.

Thus, the winner is friend number 3.

### Time Complexity (TC)

The brute-force approach has a time complexity that can be analyzed as follows:

1. **Initial List Creation**: Creating the list of friends takes \(O(n)\) time.

2. **Elimination Process**:
   - In each iteration, we need to find the \(k\)-th friend to eliminate. This involves calculating the next index and removing the element from the list.
   - Calculating the next index is an \(O(1)\) operation.
   - Removing an element from the list takes \(O(n)\) time in the worst case because it involves shifting elements in the list.
   - Since we perform the removal operation \(n-1\) times (once for each eliminated friend), the total time complexity for the elimination process is \(O(n \times n) = O(n^2)\).

Therefore, the overall time complexity of the brute-force approach is \(O(n + n^2) = O(n^2)\).

### Space Complexity (SC)

The space complexity can be analyzed as follows:

1. **Space for the List**: We maintain a list of friends, which requires \(O(n)\) space.
2. **Auxiliary Space**: No additional auxiliary space is required beyond the input and the list of friends.

Therefore, the overall space complexity is \(O(n)\).

### Summary

- **Time Complexity**: \(O(n^2)\)
- **Space Complexity**: \(O(n)\)

These complexities indicate that the brute-force approach is feasible for smaller values of \(n\), but may become inefficient for larger values due to the quadratic time complexity.



# Code
```
// package dailychallenge;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = IntStream.range(1, n + 1).boxed().collect(Collectors.toCollection(ArrayList::new));
        int idx = 0;
        while (friends.size() > 1) {
            idx = (idx + k - 1) % friends.size();
            friends.remove(idx);
        }
        return friends.get(0);
    }

    public static void main(String[] args) {
        int n = 6, k = 5;
        int theWinner = findTheWinner(n, k);
        System.out.println(theWinner);

    }
}
```
****
## Optimized Approach
To solve this problem optimally, we can use the mathematical approach known as the Josephus problem, which has a well-known efficient solution. The optimal approach leverages the recursive formula of the Josephus problem to find the winner in \(O(n)\) time and \(O(1)\) space.

### Josephus Problem Recurrence Relation
The Josephus problem can be defined recursively:
\[
J(n, k) = (J(n-1, k) + k) \% n
\]
where \(J(n, k)\) is the position of the winner in a circle of size \(n\) with every \(k\)-th person being eliminated, and the base case is:
\[
J(1, k) = 0
\]

### Conversion to Iterative Approach
We can convert the recursive relation to an iterative approach to avoid the overhead of recursion and achieve an \(O(n)\) time complexity.

1. **Initialize the Winner's Position**: Start with \(J(1, k) = 0\) for one person.
2. **Iterate and Update**: Use the recurrence relation iteratively to update the winner's position for increasing sizes of the circle.
3. **Adjust for 1-Based Index**: The problem requires a 1-based index, so we convert the 0-based result to a 1-based result by adding 1 at the end.

### Python Code for the Optimal Solution

```python
def find_the_winner(n, k):
    winner = 0  # Base case: when there's only one person, they are the winner (0-based index).
    for i in range(2, n + 1):  # Iterate from 2 to n
        winner = (winner + k) % i  # Update the winner's position
    return winner + 1  # Convert from 0-based index to 1-based index

# Example usage:
n = 5
k = 2
print(find_the_winner(n, k))  # Output: 3
```

### Explanation

1. **Initialization**: Start with `winner = 0` (0-based index for \(n = 1\)).
2. **Iterate**: For each \(i\) from 2 to \(n\):
   - Update the winner's position using the recurrence relation: `winner = (winner + k) % i`.
   - This step ensures that the position of the winner is correctly computed as the circle grows.
3. **Convert to 1-Based Index**: After the loop, convert the result to a 1-based index by returning `winner + 1`.

### Complexity Analysis

- **Time Complexity**: The loop runs \(n-1\) times (from 2 to \(n\)), and each iteration involves a constant-time operation. Therefore, the time complexity is \(O(n)\).
- **Space Complexity**: The space complexity is \(O(1)\) because we only use a few variables regardless of the input size.

### Example Walkthrough (\(n = 5\), \(k = 2\))

1. Initial winner: `winner = 0` (for \(n = 1\)).
2. \(i = 2\): `winner = (0 + 2) % 2 = 0`
3. \(i = 3\): `winner = (0 + 2) % 3 = 2`
4. \(i = 4\): `winner = (2 + 2) % 4 = 0`
5. \(i = 5\): `winner = (0 + 2) % 5 = 2`

Convert to 1-based index: `2 + 1 = 3`. Thus, the winner is friend number 3.

The loop starts from 2 because we are building up the solution incrementally from the smallest case. Here’s a detailed explanation:

### Josephus Problem Explanation

The Josephus problem can be thought of as eliminating every \( k \)-th person in a circle until only one person remains. The position of the winner for \( n \) people can be derived from the position of the winner for \( n-1 \) people.

### Recursive Relation

The recursive relation for the Josephus problem is:
\[
J(n, k) = (J(n-1, k) + k) \% n
\]
This means:
- \( J(n, k) \) is the position of the winner in a circle of size \( n \).
- \( J(n-1, k) \) is the position of the winner in a circle of size \( n-1 \).

### Base Case

For \( n = 1 \) (a single person), the position of the winner is trivially 0 (0-based index):
\[
J(1, k) = 0
\]

### Iterative Approach

The iterative approach uses the recursive relation to build up the solution from the base case. Starting from the base case for \( n = 1 \), we iteratively compute the position of the winner for larger values of \( n \).

### Why Start the Loop from 2?

When \( n = 1 \), the winner is known to be at position 0. We use this as our starting point. The loop then iterates from 2 to \( n \) to compute the winner for larger circles:

1. **Base Case**: Initialize `winner` to 0 for \( n = 1 \).
2. **Iterate from 2 to \( n \)**: Update the winner's position using the recurrence relation.

Here’s the code with detailed comments:

```python
def find_the_winner(n, k):
    winner = 0  # Base case: for n = 1, the winner is at position 0 (0-based index).
    for i in range(2, n + 1):  # Iterate from 2 to n to build up the solution
        winner = (winner + k) % i  # Update the winner's position using the recurrence relation
    return winner + 1  # Convert from 0-based index to 1-based index

# Example usage:
n = 5
k = 2
print(find_the_winner(n, k))  # Output: 3
```

### Detailed Example Walkthrough

For \( n = 5 \), \( k = 2 \):

1. **Initialization**: Start with `winner = 0` (for \( n = 1 \)).
2. **Iteration**:
   - For \( i = 2 \): 
     \[
     \text{winner} = (0 + 2) \% 2 = 0
     \]
   - For \( i = 3 \):
     \[
     \text{winner} = (0 + 2) \% 3 = 2
     \]
   - For \( i = 4 \):
     \[
     \text{winner} = (2 + 2) \% 4 = 0
     \]
   - For \( i = 5 \):
     \[
     \text{winner} = (0 + 2) \% 5 = 2
     \]

3. **Convert to 1-Based Index**: `2 + 1 = 3`.

Thus, the winner is friend number 3.

### Summary

- **Loop Starting from 2**: The loop starts from 2 because we already know the base case for \( n = 1 \). We build up the solution from this base case to the desired \( n \) using the recurrence relation.
- **Efficiency**: This approach efficiently computes the winner in \( O(n) \) time and \( O(1) \) space.

## Dryrun : 
Let's perform a dry run of the recursive solution for \( n = 5 \) and \( k = 2 \).

### Dry Run of the Recursive Solution

We use the function `josephus_recursive(n, k)` to determine the position of the winner in a circle of size \( n \) with every \( k \)-th person being eliminated.

Here's the code again for reference:

```python
def josephus_recursive(n, k):
    if n == 1:
        return 0
    else:
        return (josephus_recursive(n - 1, k) + k) % n

def find_the_winner(n, k):
    return josephus_recursive(n, k) + 1
```

### Steps and Recursive Calls

1. **Initial Call**:
   ```python
   find_the_winner(5, 2)
   ```
   This calls `josephus_recursive(5, 2)`.

2. **Recursive Calls**:
   - `josephus_recursive(5, 2)` calls `josephus_recursive(4, 2)`.
   - `josephus_recursive(4, 2)` calls `josephus_recursive(3, 2)`.
   - `josephus_recursive(3, 2)` calls `josephus_recursive(2, 2)`.
   - `josephus_recursive(2, 2)` calls `josephus_recursive(1, 2)`.

3. **Base Case**:
   - `josephus_recursive(1, 2)` returns 0 because the base case is reached (\( n = 1 \)).

4. **Unwinding the Recursion**:
   - `josephus_recursive(2, 2)`:
     \[
     (josephus_recursive(1, 2) + 2) \% 2 = (0 + 2) \% 2 = 0
     \]
     Returns 0.
   - `josephus_recursive(3, 2)`:
     \[
     (josephus_recursive(2, 2) + 2) \% 3 = (0 + 2) \% 3 = 2
     \]
     Returns 2.
   - `josephus_recursive(4, 2)`:
     \[
     (josephus_recursive(3, 2) + 2) \% 4 = (2 + 2) \% 4 = 0
     \]
     Returns 0.
   - `josephus_recursive(5, 2)`:
     \[
     (josephus_recursive(4, 2) + 2) \% 5 = (0 + 2) \% 5 = 2
     \]
     Returns 2.

5. **Convert to 1-Based Index**:
   - `find_the_winner(5, 2)`:
     \[
     josephus_recursive(5, 2) + 1 = 2 + 1 = 3
     \]
     Returns 3.

### Summary of Recursive Calls

- `josephus_recursive(5, 2)` returns 2.
- Convert the 0-based index to a 1-based index: \( 2 + 1 = 3 \).

The winner is friend number 3.

### Step-by-Step Visualization

1. **\( n = 1 \)**:
   - Returns 0.

2. **\( n = 2 \)**:
   - \( (0 + 2) \% 2 = 0 \)
   - Returns 0.

3. **\( n = 3 \)**:
   - \( (0 + 2) \% 3 = 2 \)
   - Returns 2.

4. **\( n = 4 \)**:
   - \( (2 + 2) \% 4 = 0 \)
   - Returns 0.

5. **\( n = 5 \)**:
   - \( (0 + 2) \% 5 = 2 \)
   - Returns 2.

Convert the result to 1-based index: \( 2 + 1 = 3 \).

Thus, the winner is friend number 3.