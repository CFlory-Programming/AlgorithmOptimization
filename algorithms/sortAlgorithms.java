package algorithms;

import java.util.Arrays;
import java.util.List;
import model.Product;

public class SortAlgorithms {
    public static List<Product> insertionSort(List<Product> products, boolean ascending, boolean sortByPrice) {
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

        return products;
    }

    public static List<Product> selectionSort(List<Product> products, boolean ascending, boolean sortByPrice) {
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
                }

                // Move minimum element to its
                // correct position
                Product temp = products.get(i);
                products.set(i, products.get(min_idx));
                products.set(min_idx, temp);
            }
        }

        return products;
    }

    public static List<Product> bubbleSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        if (sortByPrice) {
            int i, j, n = products.size();
            Product temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (ascending && products.get(j).getPrice() > products.get(j + 1).getPrice()) {

                        // Swap arr[j] and arr[j+1]
                        temp = products.get(j);
                        products.set(j, products.get(j + 1));
                        products.set(j + 1, temp);
                        swapped = true;
                    }
                }

                // If no two elements were
                // swapped by inner loop, then break
                if (swapped == false)
                    break;
            }
        } else {
            int i, j, n = products.size();
            Product temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (ascending && products.get(j).getPopularity() > products.get(j + 1).getPopularity()) {

                        // Swap arr[j] and arr[j+1]
                        temp = products.get(j);
                        products.set(j, products.get(j + 1));
                        products.set(j + 1, temp);
                        swapped = true;
                    }
                }

                // If no two elements were
                // swapped by inner loop, then break
                if (swapped == false)
                    break;
            }
        }
        return products;
    }

    private static void merge(List<Product> products, int l, int m, int r, boolean ascending, boolean sortByPrice) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp lists
        List<Product> L = new java.util.ArrayList<>();
        List<Product> R = new java.util.ArrayList<>();

        // Copy data to temp lists
        for (int i = 0; i < n1; i++)
            L.add(products.get(l + i));
        for (int j = 0; j < n2; j++)
            R.add(products.get(m + 1 + j));

        // Merge the temp lists
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            boolean shouldTakeLeft = false;

            if (sortByPrice) {
                double leftPrice = L.get(i).getPrice();
                double rightPrice = R.get(j).getPrice();
                shouldTakeLeft = ascending ? leftPrice <= rightPrice : leftPrice >= rightPrice;
            } else {
                int leftPop = L.get(i).getPopularity();
                int rightPop = R.get(j).getPopularity();
                shouldTakeLeft = ascending ? leftPop <= rightPop : leftPop >= rightPop;
            }

            if (shouldTakeLeft) {
                products.set(k, L.get(i));
                i++;
            } else {
                products.set(k, R.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            products.set(k, L.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            products.set(k, R.get(j));
            j++;
            k++;
        }
    }

    private static void mergeSortHelper(List<Product> products, int l, int r, boolean ascending, boolean sortByPrice) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSortHelper(products, l, m, ascending, sortByPrice);
            mergeSortHelper(products, m + 1, r, ascending, sortByPrice);

            // Merge the sorted halves
            merge(products, l, m, r, ascending, sortByPrice);
        }
    }

    public static List<Product> mergeSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        if (products.size() > 0) {
            mergeSortHelper(products, 0, products.size() - 1, ascending, sortByPrice);
        }
        return products;
    }

    private static int partition(List<Product> products, int low, int high, boolean ascending, boolean sortByPrice) {
        Product pivot = products.get(high);
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            boolean shouldMove = false;

            if (sortByPrice) {
                double pivotPrice = pivot.getPrice();
                double currentPrice = products.get(j).getPrice();
                shouldMove = ascending ? currentPrice < pivotPrice : currentPrice > pivotPrice;
            } else {
                int pivotPop = pivot.getPopularity();
                int currentPop = products.get(j).getPopularity();
                shouldMove = ascending ? currentPop < pivotPop : currentPop > pivotPop;
            }

            if (shouldMove) {
                i++;
                swapProducts(products, i, j);
            }
        }

        swapProducts(products, i + 1, high);
        return i + 1;
    }

    private static void swapProducts(List<Product> products, int i, int j) {
        Product temp = products.get(i);
        products.set(i, products.get(j));
        products.set(j, temp);
    }

    private static void quickSortHelper(List<Product> products, int low, int high, boolean ascending,
            boolean sortByPrice) {
        if (low < high) {
            int pi = partition(products, low, high, ascending, sortByPrice);
            quickSortHelper(products, low, pi - 1, ascending, sortByPrice);
            quickSortHelper(products, pi + 1, high, ascending, sortByPrice);
        }
    }

    public static List<Product> quickSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        if (products.size() > 0) {
            quickSortHelper(products, 0, products.size() - 1, ascending, sortByPrice);
        }
        return products;
    }

    private static void heapify(List<Product> products, int n, int i, boolean ascending, boolean sortByPrice) {
        int extremeIdx = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (sortByPrice) {
            double extreme = products.get(extremeIdx).getPrice();

            if (l < n) {
                double left = products.get(l).getPrice();
                if ((ascending && left > extreme) || (!ascending && left < extreme)) {
                    extremeIdx = l;
                    extreme = left;
                }
            }

            if (r < n) {
                double right = products.get(r).getPrice();
                if ((ascending && right > extreme) || (!ascending && right < extreme)) {
                    extremeIdx = r;
                }
            }
        } else {
            int extreme = products.get(extremeIdx).getPopularity();

            if (l < n) {
                int left = products.get(l).getPopularity();
                if ((ascending && left > extreme) || (!ascending && left < extreme)) {
                    extremeIdx = l;
                    extreme = left;
                }
            }

            if (r < n) {
                int right = products.get(r).getPopularity();
                if ((ascending && right > extreme) || (!ascending && right < extreme)) {
                    extremeIdx = r;
                }
            }
        }

        if (extremeIdx != i) {
            swapProducts(products, i, extremeIdx);
            heapify(products, n, extremeIdx, ascending, sortByPrice);
        }
    }

    public static List<Product> heapSort(List<Product> products, boolean ascending, boolean sortByPrice) {
        int n = products.size();

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(products, n, i, ascending, sortByPrice);

        for (int i = n - 1; i > 0; i--) {
            swapProducts(products, 0, i);
            heapify(products, i, 0, ascending, sortByPrice);
        }

        return products;
    }

    // binary search to find insertion location for a Product
    static int binarySearch(List<Product> products, Product item, int low, int high, boolean ascending,
            boolean sortByPrice) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortByPrice) {
                double midVal = products.get(mid).getPrice();
                double itemVal = item.getPrice();
                if (itemVal == midVal)
                    return mid + 1;
                if (ascending) {
                    if (itemVal > midVal)
                        low = mid + 1;
                    else
                        high = mid - 1;
                } else {
                    if (itemVal > midVal)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            } else {
                int midVal = products.get(mid).getPopularity();
                int itemVal = item.getPopularity();
                if (itemVal == midVal)
                    return mid + 1;
                if (ascending) {
                    if (itemVal > midVal)
                        low = mid + 1;
                    else
                        high = mid - 1;
                } else {
                    if (itemVal > midVal)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }

        return low;
    }

    // Binary-insertion sort for Product lists
    public static List<Product> insertionBinarySort(List<Product> products, boolean ascending,
            boolean sortByPrice) {
        int n = products.size();

        for (int i = 1; i < n; ++i) {
            int j = i - 1;
            Product selected = products.get(i);

            // find location where selected should be inserted
            int loc = binarySearch(products, selected, 0, j, ascending, sortByPrice);

            // Move all elements after location to create space
            while (j >= loc) {
                products.set(j + 1, products.get(j));
                j--;
            }
            products.set(j + 1, selected);
        }

        return products;
    }
}
