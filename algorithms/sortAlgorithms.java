package algorithms;

import java.util.List;
import model.Product;

public class sortAlgorithms {
    public static void insertionSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        if (sortByPrice) {
            for (int i = 1; i < products.size(); i++) {
                Product key = products.get(i);
                int j = i - 1;

                while (j >= 0 && ((ascending && products.get(j).getPrice() > key.getPrice()) ||
                        (!ascending && products.get(j).getPrice() < key.getPrice()))) {
                    products.set(j + 1, products.get(j));
                    j--;
                }
                products.set(j + 1, key);
            }
        } else {
            for (int i = 1; i < products.size(); i++) {
                Product key = products.get(i);
                int j = i - 1;

                while (j >= 0 && ((ascending && products.get(j).getPopularity() > key.getPopularity()) ||
                        (!ascending && products.get(j).getPopularity() < key.getPopularity()))) {
                    products.set(j + 1, products.get(j));
                    j--;
                }
                products.set(j + 1, key);
            }
        }
    }

    public static void selectionSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        if (sortByPrice) {
            int n = products.size();
            for (int i = 0; i < n - 1; i++) {

                // Assume the current position holds
                // the minimum element
                int min_idx = i;

                // Iterate through the unsorted portion
                // to find the actual minimum
                for (int j = i + 1; j < n; j++) {
                    if (ascending && products.get(j).getPrice() < products.get(min_idx).getPrice()) {
                        min_idx = j;
                    } else if (!ascending && products.get(j).getPrice() > products.get(min_idx).getPrice()) {
                        min_idx = j;
                    }

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }

                // Move minimum element to its
                // correct position
                Product temp = products.get(i);
                products.set(i, products.get(min_idx));
                products.set(min_idx, temp);
            }
        } else {
            int n = products.size();
            for (int i = 0; i < n - 1; i++) {

                // Assume the current position holds
                // the minimum element
                int min_idx = i;

                // Iterate through the unsorted portion
                // to find the actual minimum
                for (int j = i + 1; j < n; j++) {
                    if (ascending && products.get(j).getPopularity() < products.get(min_idx).getPopularity()) {
                        min_idx = j;
                    } else if (!ascending && products.get(j).getPopularity() > products.get(min_idx).getPopularity()) {
                        min_idx = j;
                    }

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }

                // Move minimum element to its
                // correct position
                Product temp = products.get(i);
                products.set(i, products.get(min_idx));
                products.set(min_idx, temp);
            }
        }
    }


    public static void bubbleSort(List<Product> products, boolean ascending, boolean sortByPrice) {

    }

    public static void mergeSort(List<Product> products, boolean ascending, boolean sortByPrice) {

    }

    public static void quickSort(List<Product> products, boolean ascending, boolean sortByPrice) {

    }

    public static void heapSort(List<Product> products, boolean ascending, boolean sortByPrice) {

    }

    public static void binaryInsertionSort(List<Product> products, boolean ascending, boolean sortByPrice) {

    }
}
