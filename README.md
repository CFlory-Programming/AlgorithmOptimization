# AlgorithmOptimization

### Oberved Performance
[Link to Data](https://docs.google.com/spreadsheets/d/131lV4ZxYJfqi2vfX5j09Ra4F8IByvEtQokCkKtVR3EA/edit?gid=0#gid=0)

### Big-O mapping
Algorithm	| Observed Behavior |	Big-O	| Evidence / Notes
--- | --- | --- | ---
Linear Search | Time increased linearly | O(n) | 1,768,125 ns
Binary Search | Time increased slowly | O(log n) | 8,774,083 ns
Insertion Sort | Time increased exponentially | O(n<sup>2</sup>) | 137,351,333 ns
Selection Sort | Time increased exponentially | O(n<sup>2</sup>) | 139,900,417 ns
Bubble Sort | Time increased exponentially | O(n<sup>2</sup>) | 6,579,625 ns
Merge Sort | Time increased slowly | O(n x log n) | 23,645,458 ns
Quick Sort | Time increased slowly | O(n x log n) | 61,886,250 ns
Heap Sort | Time increased slowly | O(n x log n) | 8,086,709 ns
Binary Insertion Sort | Time increased slowly | O(n x log n) | 5,773,333 ns

### 3. Recommendations (Scenario-Based)

Which search algorithm is best?
* The best search algorithm is linear search.

Which sort algorithm is best?
* The best sort algorithm is binary insertion sort for us.
  
Justify using observations and Big-O reasoning
* The linear search algorithm uses linear time O(n), or as the data increases, the steps increase linearly. The binary insertion sort algorithm uses quasilinear time O(n log n). The binary insertion sort has a similar time complexity to the other quasilinear time algorithms, such as merge sort, quick sort, and heap sort.

### 4. Reflection

What surprised you most?
 - What surprised me most was that even for the largest data set, linear search was still faster than binary search in our data, even though the time complexity says otherwise. I would assume that the data we were searching for was just in a location that was difficult to find with a binary search.

Tradeoffs between simplicity vs performance
 - The more complex the algorithm, the better it tends to do with larger data sets, but it is slower for smaller data sets. For example, with small data sets linear search is the best, but for really large data sets, binary search will be way better.

Dataset size impact
 - The dataset size increasing affected each algorithm differently. Depending on the time complexity and data set size, each algorithm's run time increased by a different amount.

Anything you would change for real-world usage
 - For real world usage I see very little reason to keep the slower sorting algorithms, such as insertion sort, which will almost always be slower than something like merge sort.
