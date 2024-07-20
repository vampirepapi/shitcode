# Pattern-1: Rectangular Star Pattern
![alt text](img/image.png)

There are 4 general rules for solving a pattern-based question: 

1. We always use nested loops for printing the patterns.
2. For the outer loop, we count the number of lines/rows and loop for them.
3. Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
4. We print the ‘*’ inside the inner loop.
5. Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.

# Pattern-2: Right-Angled Triangle Pattern

Problem Statement: Given an integer N, print the following pattern : 

![alt text](img/image-0.png)

Here, N = 5.

**In this problem, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright, the inner loop will run for the row number in each iteration. For eg: 1 star for row 1, 5 stars for row 5, and so on.**

# Pattern - 3: Right-Angled Number Pyramid

![alt text](img/image-1.png)

Here, N = 5. 

**In this pattern, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright, so the inner loop will run for the row number in each iteration. For eg: 1 number for row 1, 5 numbers for row 5, and so on. The only difference between this pattern and pattern 2 is that here we print numbers looping from 1 to the row number for each row instead of printing stars.**

# Pattern - 4: Right-Angled Number Pyramid - II

![alt text](img/image-2.png)

Here, N = 5.

**In this pattern, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright, so the inner loop will run for the row number in each iteration. For eg: 1’s for row 1, 5’s 5 times for row 5, and so on. The only difference between this pattern and pattern 2 is that here we print numbers in each row instead of printing stars.**

# Pattern-5: Inverted Right Pyramid

![alt text](img/image-3.png)

Here, N = 5.

**In this pattern, we run the outer loop for N times as we have to print N rows and since we have to print a right-angled triangle/pyramid which must be inverted, the inner loop will run in decreasing order of stars, for eg: Row 1 (i=0) would contain N stars, Row 2 (i=1) would contain (N -1) stars and so on.**

# Pattern - 6: Inverted Numbered Right Pyramid

![alt text](img/image-4.png)

Here, N = 5.

**In this pattern, we run the outer loop for N times as we have to print N rows and since we have to print a right-angled triangle/pyramid which must be inverted, so the inner loop will run from 1 to (N-i)th integer in every row till we reach the Nth row where only ‘1’ would be left to get printed. For eg: in the 1st-row numbers from 1 to N get printed, in the 2nd-row numbers from 1 to (N-1) get printed, and so on.**

# Pattern - 7: Star Pyramid

![alt text](img/image-5.png)

**In this particular pattern, we run the outer loop for N times as we have to print N rows as usual. Now, the question arises what will be the logic behind the inner loop?**

**As we can clearly observe that for each row there are some spaces that get printed then some stars and then again some spaces giving it a final pyramidal look. For eg: In the first row (i=0) there are 4 spaces, 1 star, then again 4 spaces. In the second row (i=1) there are 3 spaces, 3 stars, then again 3 spaces so we can say that there are N-i-1 spaces, 2*i+1 stars, and then again N-i-1 spaces for each row where i is the row index. We thus simply run 3 inner loops first for printing the spaces, then the stars, and then the spaces again.**

# Pattern - 8: Inverted Star Pyramid

![alt text](img/image-6.png)

Here, N = 5.

**In this particular pattern, we run the outer loop for N times as we have to print N rows as usual. Now, the question arises what will be the logic behind the inner loop?**

**Similar to the last pattern, we can clearly observe that for each row there are some spaces that get printed then some stars, and then again some spaces giving it an inverse pyramidal look. For eg: In the first row (i=0) there are 0 spaces, 9 stars, then again 0 spaces. In the second row (i=1) there is 1 space, 7 stars, then again 1 space so we can say that there are i spaces, 2*N - (2*i+1) stars, and then again i space for each row where i is the row index. We thus simply run 3 inner loops, first for printing the spaces, then the stars, and then the spaces again.**

# Pattern - 9: Diamond Star Pattern

![alt text](img/image-7.png)

Here, N = 5.

**This pattern is just a mixture of the last two patterns ( erect pyramid and inverted pyramid). Firstly, we will print the erect pyramid and then an inverted pyramid below it.**

# Pattern - 10: Half Diamond Star Pattern

![alt text](img/image-8.png)

Here, N = 5.

**In this problem, we have to print only the right half of the star diamond pattern as discussed in the previous article. So, as we can observe from the examples for N = 3 we have 5 rows, and for N = 6 we have 11 rows, hence the outer loop will run for 2*N -1 times. For the inner loop where we print the stars if row no. is less than or equal to N, then we observe that the stars which are printed in each row are equal to the row index itself. But, when i becomes more than N, then the no. of stars decreases by 1 with each increasing row. So, therefore the stars printed would be 2*N - i after i becomes greater than N.**