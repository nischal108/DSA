

## Sorting Algorithms

### 1. Cyclic Sort
- **What it is:** A sorting algorithm that places each number directly in its correct position in one pass.
- **When to use:** Sorting integers within a fixed range, like 1 to n.
- **Key Idea:** Iterate through the array and swap numbers to their correct indices until all numbers are sorted.

### 2. Quick Sort
- **What it is:** A divide-and-conquer algorithm that partitions the array around a pivot and recursively sorts the partitions.
- **When to use:** General-purpose sorting; handles large datasets efficiently but not stable (doesn’t preserve order of equal elements).
- **Key Idea:** Choose a pivot, rearrange elements smaller than pivot to its left and larger to its right, then sort the partitions.

### 3. Merge Sort
- **What it is:** A divide-and-conquer algorithm that splits the array into halves, sorts them, and merges them back together.
- **When to use:** When stability is required or for sorting linked lists.
- **Key Idea:** Continuously divide the array and merge sorted parts.

### 4. Selection Sort
- **What it is:** A simple sorting algorithm that repeatedly selects the smallest element and places it at the beginning.
- **When to use:** Small datasets where simplicity is valued over speed.
- **Key Idea:** Find the smallest element in the unsorted part and swap it with the first unsorted element.

### 5. Insertion Sort
- **What it is:** Builds the sorted array one element at a time by inserting each new element into its correct position.
- **When to use:** Small datasets or nearly sorted arrays.
- **Key Idea:** Iterate and place each element into its correct position relative to the already sorted part.

### 6. Bubble Sort
- **What it is:** A simple algorithm that repeatedly swaps adjacent elements if they are in the wrong order.
- **When to use:** Educational purposes; rarely used in real-world applications.
- **Key Idea:** Keep passing through the array until it’s sorted, with larger elements "bubbling" to the top.

### 7. Counting Sort
- **What it is:** A non-comparison-based algorithm that counts the occurrences of each element and uses this to place them in order.
- **When to use:** Sorting integers in a small, known range.
- **Key Idea:** Count occurrences, calculate cumulative counts, and place elements accordingly.

### 8. Radix Sort
- **What it is:** A non-comparison-based algorithm that sorts elements digit by digit, starting from the least significant digit.
- **When to use:** Sorting numbers or strings with a fixed digit/length.
- **Key Idea:** Use a stable sort like counting sort for each digit, starting from the least significant.

---

## Searching Algorithms

### 1. Binary Search
- **What it is:** A divide-and-conquer algorithm that repeatedly divides the search range in half to locate an element.
- **When to use:** Searching in sorted arrays.
- **Key Idea:** Check the middle element, decide whether to search left or right, and repeat until the element is found.

### 2. Sliding Window
- **What it is:** A technique for maintaining a subset of the array that dynamically changes as you move through it.
- **When to use:** Problems involving subarray or substring properties (e.g., max sum, unique characters).
- **Key Idea:** Use a window with two boundaries and adjust its size/position as needed.

### 3. Two Pointers
- **What it is:** A technique where two indices traverse the array from different directions or positions.
- **When to use:** Pair or triplet problems (e.g., finding pairs with a given sum, removing duplicates).
- **Key Idea:** Use one pointer to start from the beginning and another from the end or at a specific offset.

### 4. Ternary Search
- **What it is:** A searching algorithm that splits the range into three parts and reduces the search space to one-third each time.
- **When to use:** Finding extrema (maximum/minimum) in unimodal functions.
- **Key Idea:** Compare values at two points in the range and decide which third to eliminate.

---

## Complexity Table

| Algorithm Type   | Algorithm        | Time Complexity (Worst) | Space Complexity   | When to Use                                                                 |
|------------------|------------------|--------------------------|--------------------|-----------------------------------------------------------------------------|
| **Sorting**      | Cyclic Sort      | O(n)                    | O(1)               | Sorting integers in a fixed range (e.g., 1 to n).                           |
|                  | Quick Sort       | O(n^2)                  | O(log n)           | General-purpose fast sorting; not stable.                                   |
|                  | Merge Sort       | O(n log n)              | O(n)               | Stable sorting; useful for linked lists.                                    |
|                  | Selection Sort   | O(n^2)                  | O(1)               | Simple implementation; small datasets.                                      |
|                  | Insertion Sort   | O(n^2)                  | O(1)               | Nearly sorted datasets or small input size.                                 |
|                  | Bubble Sort      | O(n^2)                  | O(1)               | Rarely used; educational purposes.                                          |
|                  | Counting Sort    | O(n + k)                | O(k)               | Non-comparison sort for integers in small range.                            |
|                  | Radix Sort       | O(nk)                   | O(n + k)           | Fixed digit sorting; integers/strings.                                      |
| **Searching**    | Binary Search    | O(log n)                | O(1)               | Searching in sorted arrays.                                                 |
|                  | Sliding Window   | O(n)                    | O(1) or O(k)       | Problems involving subarray or substring sums.                              |
|                  | Two Pointers     | O(n)                    | O(1)               | Pair/triplet problems, usually with sorted arrays.                          |
|                  | Ternary Search   | O(log n)                | O(1)               | Optimization problems in unimodal functions.                                |

---

