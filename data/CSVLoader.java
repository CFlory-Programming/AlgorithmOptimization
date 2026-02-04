package data;

import java.io.*;
import java.util.*;
import model.Product;

public class CSVLoader {

    public static List<Product> loadProducts(String filePath) {
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String SKU = data[0];
                double price = Double.parseDouble(data[1]);
                int popularity = Integer.parseInt(data[2]);

                products.add(new Product(SKU, price, popularity));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
