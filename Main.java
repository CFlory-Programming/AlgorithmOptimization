import java.util.*;
import data.CSVLoader;
import model.Product;
import algorithms.Timer;
import algorithms.SearchAlgorithms;
import algorithms.SortAlgorithms;

public class Main {
    public static void main(String[] args) {

        List<Product> products = CSVLoader.loadProducts("data/productsLargeRandom.csv");

        // long start = System.nanoTime();
        // Product found = searchAlgorithms.linearSearch(products, "SKU123");
        // long end = System.nanoTime();

        // System.out.println("Linear search result: " + found);
        // System.out.println("Time: " + (end - start) + " ns");

        // sortAlgorithms.bubbleSortByPopularity(products);
        // System.out.println("Sorted by Popularity (Bubble Sort):");
        products.forEach(System.out::println);

        // ----- SEARCH TESTS -----
        long linearTime = Timer.timeSearch(() ->
                SearchAlgorithms.linearSearch(products, "SKU1003")
        );

        long binaryTime = Timer.timeSearch(() ->
                SearchAlgorithms.binarySearch(products, "SKU1003")
        );

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");

        // ----- SORT TESTS -----

        long insertTime = Timer.timeSort(() ->
                SortAlgorithms.insertionSort(products, true, false)
        );

        long mergeTime = Timer.timeSort(() ->
                SortAlgorithms.selectionSort(products, true, false)
        );

        long bubbleTime = Timer.timeSort(() ->
                SortAlgorithms.bubbleSort(products, true, false)
        );

        long mergeSortTime = Timer.timeSort(() ->
                SortAlgorithms.mergeSort(products, true, false)
        );

        long quickSortTime = Timer.timeSort(() ->
                SortAlgorithms.quickSort(products, true, false)
        );

        long heapSortTime = Timer.timeSort(() ->
                SortAlgorithms.heapSort(products, true, false)
        );

        long binaryInsertionSortTime = Timer.timeSort(() ->
                SortAlgorithms.binaryInsertionSort(products, true, false)
        );

        System.out.println("Insertion Sort Time: " + insertTime + " ns");
        System.out.println("Selection Sort Time: " + mergeTime + " ns");
        System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ns");
        System.out.println("Quick Sort Time: " + quickSortTime + " ns");
        System.out.println("Heap Sort Time: " + heapSortTime + " ns");
        System.out.println("Binary Insertion Sort Time: " + binaryInsertionSortTime + " ns");
        // Selection, insertion, bubble, merge, quick, heap
    }
}