1. Implement heap sort 

### **Heap Sort Algorithm**
Heap Sort works in two phases:
1. **Heapify the Array**: Transform the array into a max-heap, where the largest element is at the root.
2. **Sort the Array**: Repeatedly remove the root (largest element) and rebuild the heap with the remaining elements.

---

### **Java Code Implementation**
```java
public class HeapSort {
    // Main function to sort an array using Heap Sort
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the current root (largest) with the last element
            swap(arr, 0, i);

            // Re-heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to build a max heap
    private void heapify(int[] arr, int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Utility function to swap two elements in an array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        HeapSort sorter = new HeapSort();
        sorter.heapSort(arr);

        System.out.println("Sorted array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

### **How It Works**
1. **Heapify Process**:
   - The `heapify` method ensures the subtree rooted at `i` follows the max-heap property.
   - Recursively ensures every parent node is larger than its children.

2. **Swapping and Sorting**:
   - The largest element (root of the heap) is swapped with the last unsorted element.
   - The size of the heap is reduced, and the process is repeated.

---

### **Input/Output Example**
#### Input:
```java
arr = {12, 11, 13, 5, 6, 7};
```
#### Output:
```
Sorted array is:
5 6 7 11 12 13
```

This code sorts the array in **ascending order** using the max-heap approach. Let me know if you need further clarification!