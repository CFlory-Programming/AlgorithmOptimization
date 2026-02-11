import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import data.CSVLoader;
import model.Product;
import algorithms.Timer;
import algorithms.SearchAlgorithms;
import algorithms.SortAlgorithms;

public class Main {
    public static void main(String[] args) {

        List<Product> products = CSVLoader.loadProducts("data/productsMediumRandom.csv");

        // ----- SEARCH TESTS -----
        long linearTime = Timer.timeSearch(() ->
                SearchAlgorithms.linearSearch(products, "17284A69")
        );

        long binaryTime = Timer.timeSearch(() ->
                SearchAlgorithms.binarySearch(SortAlgorithms.mergeSort(products, true, true), 5.22, true)
        );

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");

        // ----- SORT TESTS -----

        long insertTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.insertionSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsInsert.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long mergeTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.selectionSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsSelection.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long bubbleTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.bubbleSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsBubble.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long mergeSortTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.mergeSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsMerge.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long quickSortTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.quickSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsQuick.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long heapSortTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.heapSort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsHeap.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        long binaryInsertionSortTime = Timer.timeSort(() -> {
            List<Product> sorted = SortAlgorithms.insertionBinarySort(products, true, false);
            try (PrintWriter writer = new PrintWriter(new FileWriter("data/productsBinaryInsert.csv"))) {
                sorted.forEach(writer::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Insertion Sort Time: " + insertTime + " ns");
        System.out.println("Selection Sort Time: " + mergeTime + " ns");
        System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ns");
        System.out.println("Quick Sort Time: " + quickSortTime + " ns");
        System.out.println("Heap Sort Time: " + heapSortTime + " ns");
        System.out.println("Binary Insertion Sort Time: " + binaryInsertionSortTime + " ns");
        // Selection, insertion, bubble, merge, quick, heap, binary insertion
    }
}