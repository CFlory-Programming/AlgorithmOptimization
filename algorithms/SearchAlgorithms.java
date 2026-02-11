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

    public static Product binarySearch(List<Product> products, double target, boolean searchByPrice) {
        if (searchByPrice) {
            int left = 0;
            int right = products.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Get the middle number not the middle of the distance to get to
                                                     // the left and right numbers
                Product midProduct = products.get(mid);

                if (midProduct.getPrice() == target) {
                    return midProduct; // Found
                } else if (midProduct.getPrice() < target) { // mid price is less than target price
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
            return null; // Not found
        } else {
            int left = 0;
            int right = products.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Get the middle number not the middle of the distance to get to
                                                     // the left and right numbers
                Product midProduct = products.get(mid);

                if (midProduct.getPopularity() == target) {
                    return midProduct; // Found
                } else if (midProduct.getPopularity() < target) { // mid popularity is less than target popularity
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
            return null; // Not found
        }
    }
}
