import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Fill the csv with random data
        for (int i = 0; i < 100; i++) {
            String sku = UUID.randomUUID().toString().substring(0, 8);
            sku = sku.toUpperCase();

            String productCategory = switch (new Random().nextInt(9)) {
                case 0 -> "Electronics";
                case 1 -> "Clothing";
                case 2 -> "Home & Kitchen";
                case 3 -> "Books";
                case 4 -> "Sports & Outdoors";
                case 5 -> "Health & Personal Care";
                case 6 -> "Toys & Games";
                case 7 -> "Food & Grocery";
                default -> "Miscellaneous";
            };

            String productName = switch (productCategory) {
                case "Electronics" -> switch (new Random().nextInt(15)) {
                    case 0 -> "Wireless Headphones";
                    case 1 -> "Smartphone";
                    case 2 -> "Bluetooth Speaker";
                    case 3 -> "4K TV";
                    case 4 -> "Gaming Console";
                    case 5 -> "Smartwatch";
                    case 6 -> "Tablet";
                    case 7 -> "Digital Camera";
                    case 8 -> "External Hard Drive";
                    case 9 -> "Fitness Tracker";
                    case 10 -> "E-Reader";
                    case 11 -> "Drone";
                    case 12 -> "Wireless Charger";
                    case 13 -> "Smart Home Hub";
                    case 14 -> "Noise-Cancelling Earbuds";
                    default -> "Laptop";
                };
                case "Clothing" -> switch (new Random().nextInt(15)) {
                    case 0 -> "Men's Casual Shirt";
                    case 1 -> "Women's Summer Dress";
                    case 2 -> "Kids' Jeans";
                    case 3 -> "Men's Formal Suit";
                    case 4 -> "Women's Sneakers";
                    case 5 -> "Unisex Hoodie";
                    case 6 -> "Men's Running Shoes";
                    case 7 -> "Women's Handbag";
                    case 8 -> "Kids' T-Shirt";
                    case 9 -> "Men's Leather Jacket";
                    case 10 -> "Women's Winter Jacket";
                    case 11 -> "Kids' Sneakers";
                    case 12 -> "Men's Raincoat";
                    case 13 -> "Women's Scarf";
                    case 14 -> "Kids' Hat";
                    default -> "Men's Formal Shirt";
                };
                case "Home & Kitchen" -> switch (new Random().nextInt(30)) {
                    case 0 -> "Stainless Steel Cookware Set";
                    case 1 -> "Vacuum Cleaner";
                    case 2 -> "Air Fryer";
                    case 3 -> "Blender";
                    case 4 -> "Microwave Oven";
                    case 5 -> "Dishwasher";
                    case 6 -> "Refrigerator";
                    case 7 -> "Toaster";
                    case 8 -> "Electric Kettle";
                    case 9 -> "Rice Cooker";
                    case 10 -> "Slow Cooker";
                    case 11 -> "Stand Mixer";
                    case 12 -> "Food Processor";
                    case 13 -> "Coffee Grinder";
                    case 14 -> "Juicer";
                    case 15 -> "Pressure Cooker";
                    case 16 -> "Bread Maker";
                    case 17 -> "Ice Cream Maker";
                    case 18 -> "Water Purifier";
                    case 19 -> "Electric Skillet";
                    case 20 -> "Waffle Maker";
                    case 21 -> "Deep Fryer";
                    case 22 -> "Electric Griddle";
                    case 23 -> "Popcorn Maker";
                    case 24 -> "Yogurt Maker";
                    case 25 -> "Food Dehydrator";
                    case 26 -> "Electric Can Opener";
                    case 27 -> "Sous Vide Cooker";
                    case 28 -> "Electric Wine Opener";
                    case 29 -> "Milk Frother";
                    default -> "Coffee Maker";
                };
                case "Books" -> switch (new Random().nextInt(20)) {
                    case 0 -> "Mystery Novel";
                    case 1 -> "Science Fiction Book";
                    case 2 -> "Romance Novel";
                    case 3 -> "Historical Fiction";
                    case 4 -> "Fantasy Novel";
                    case 5 -> "Biography";
                    case 6 -> "Self-Improvement Book";
                    case 7 -> "Cookbook";
                    case 8 -> "Children's Book";
                    case 9 -> "Thriller Novel";
                    case 10 -> "Graphic Novel";
                    case 11 -> "Poetry Collection";
                    case 12 -> "Travel Guide";
                    case 13 -> "Science Book";
                    case 14 -> "Art Book";
                    case 15 -> "Photography Book";
                    case 16 -> "Business Book";
                    case 17 -> "Health & Wellness Book";
                    case 18 -> "Classic Literature";
                    case 19 -> "Young Adult Novel";
                    default -> "Self-Help Book";
                };
                case "Sports & Outdoors" -> switch (new Random().nextInt(20)) {
                    case 0 -> "Yoga Mat";
                    case 1 -> "Dumbbell Set";
                    case 2 -> "Tennis Racket";
                    case 3 -> "Camping Tent";
                    case 4 -> "Hiking Backpack";
                    case 5 -> "Cycling Helmet";
                    case 6 -> "Fishing Rod";
                    case 7 -> "Running Shoes";
                    case 8 -> "Golf Clubs";
                    case 9 -> "Basketball";
                    case 10 -> "Soccer Ball";
                    case 11 -> "Swim Goggles";
                    case 12 -> "Skateboard";
                    case 13 -> "Rollerblades";
                    case 14 -> "Boxing Gloves";
                    case 15 -> "Jump Rope";
                    case 16 -> "Kayak";
                    case 17 -> "Snowboard";
                    case 18 -> "Treadmill";
                    case 19 -> "Exercise Bike";
                    default -> "Running Shoes";
                };
                case "Health & Personal Care" -> switch (new Random().nextInt(20)) {
                    case 0 -> "Vitamin C Supplement";
                    case 1 -> "Protein Powder";
                    case 2 -> "Yoga Blocks";
                    case 3 -> "Massage Gun";
                    case 4 -> "Electric Toothbrush";
                    case 5 -> "Foam Roller";
                    case 6 -> "Hair Dryer";
                    case 7 -> "Facial Cleanser";
                    case 8 -> "Sunscreen Lotion";
                    case 9 -> "Lip Balm Set";
                    case 10 -> "Nail Care Kit";
                    case 11 -> "Body Lotion";
                    case 12 -> "Shampoo & Conditioner";
                    case 13 -> "Essential Oil Diffuser";
                    case 14 -> "Sleep Mask";
                    case 15 -> "Hand Sanitizer";
                    case 16 -> "Electric Razor";
                    case 17 -> "Bath Bombs Set";
                    case 18 -> "Hair Straightener";
                    case 19 -> "Facial Mask Set";
                    default -> "Essential Oils Set";
                };
                case "Toys & Games" -> switch (new Random().nextInt(20)) {
                    case 0 -> "Building Blocks Set";
                    case 1 -> "Remote Control Car";
                    case 2 -> "Puzzle Game";
                    case 3 -> "Action Figure";
                    case 4 -> "Dollhouse";
                    case 5 -> "Board Game";
                    case 6 -> "Stuffed Animal";
                    case 7 -> "Educational Toy";
                    case 8 -> "Outdoor Playset";
                    case 9 -> "Art & Craft Kit";
                    case 10 -> "Video Game";
                    case 11 -> "Train Set";
                    case 12 -> "Kite";
                    case 13 -> "Yo-Yo";
                    case 14 -> "Water Gun";
                    case 15 -> "Play-Doh Set";
                    case 16 -> "Magic Kit";
                    case 17 -> "Musical Instrument Toy";
                    case 18 -> "Slime Making Kit";
                    case 19 -> "Finger Paint Set";
                    default -> "Board Game";
                };
                case "Food & Grocery" -> switch (new Random().nextInt(30)) {
                    case 0 -> "Organic Almonds";
                    case 1 -> "Gluten-Free Bread";
                    case 2 -> "Dark Chocolate Bar";
                    case 3 -> "Herbal Tea Pack";
                    case 4 -> "Natural Peanut Butter";
                    case 5 -> "Granola Cereal";
                    case 6 -> "Dried Fruit Mix";
                    case 7 -> "Organic Honey";
                    case 8 -> "Whole Grain Pasta";
                    case 9 -> "Cold-Pressed Juice";
                    case 10 -> "Vegan Protein Bars";
                    case 11 -> "Quinoa Pack";
                    case 12 -> "Chia Seeds";
                    case 13 -> "Coconut Water";
                    case 14 -> "Kombucha Drink";
                    case 15 -> "Organic Popcorn";
                    case 16 -> "Almond Milk";
                    case 17 -> "Avocado Oil";
                    case 18 -> "Turmeric Powder";
                    case 19 -> "Cacao Nibs";
                    case 20 -> "Matcha Green Tea";
                    case 21 -> "Hemp Seeds";
                    case 22 -> "Spirulina Powder";
                    case 23 -> "Nutritional Yeast";
                    case 24 -> "Sunflower Seeds";
                    case 25 -> "Pumpkin Seeds";
                    case 26 -> "Goji Berries";
                    case 27 -> "Acai Powder";
                    case 28 -> "Maca Root Powder";
                    case 29 -> "Bee Pollen";
                    default -> "Extra Virgin Olive Oil";
                };
                default -> "Gift Card";
            };

            // Write to csv file
            try (FileWriter writer = new FileWriter("products.csv", true)) {
                // Clear csv file before writing
                if (i == 0) {
                    new PrintWriter("products.csv").close();

                    // Categories
                    writer.append("sku,productName,category,price,unitsSold,inStock");
                    writer.append("\n");
                }

                // Check for duplicate SKUs
                BufferedReader reader = new BufferedReader(new FileReader("products.csv"));
                String line;
                boolean duplicate = false;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith(sku)) {
                        duplicate = true;
                        break;
                    }
                }
                reader.close();
                if (duplicate) {
                    i--;
                } else {
                    writer.append(sku);
                    writer.append(",");
                    writer.append(productName);
                    writer.append(",");
                    writer.append(productCategory);
                    writer.append(",");
                    writer.append(String.format("%.2f", new Random().nextDouble(100) + 1)); // price with two decimals
                    writer.append(",");
                    writer.append(String.valueOf(new Random().nextInt(1000) + 1)); // unitsSold
                    writer.append(",");
                    writer.append(String.valueOf(new Random().nextInt(6) > 0)); // inStock
                    writer.append("\n");
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
