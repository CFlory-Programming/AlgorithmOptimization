import java.io.*;
import java.util.*;
import data.CSVLoader;
import model.Product;
import algorithms.searchAlgorithms;
import algorithms.sortAlgorithms;

public class Main {
    public static void main(String[] args) {

        List<Product> products = CSVLoader.loadProducts("data/productsLarge.csv");

        // long start = System.nanoTime();
        // Product found = searchAlgorithms.linearSearch(products, "SKU123");
        // long end = System.nanoTime();

        // System.out.println("Linear search result: " + found);
        // System.out.println("Time: " + (end - start) + " ns");

        // sortAlgorithms.bubbleSortByPopularity(products);
        // System.out.println("Sorted by Popularity (Bubble Sort):");
        products.forEach(System.out::println);
    }
}