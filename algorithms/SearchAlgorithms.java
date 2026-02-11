package algorithms;

import java.util.List;
import model.Product;

public class SearchAlgorithms {
    public static Product linearSearch(List<Product> products, String sku) {
        for (Product product : products) {
            if (product.getSKU().equals(sku)) {
                return product;
            }
        }
        return null; // Not found
    }

    public static Product binarySearch(List<Product> products, String sku) {
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Get the middle number not the middle of the distance to get to the left and right numbers
            Product midProduct = products.get(mid);

            if (midProduct.getSKU().equals(sku)) {
                return midProduct; // Found
            } else if (midProduct.getSKU().compareTo(sku) < 0) { // mid SKU is less than target SKU
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // Not found
    }
}
