package baitaap04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baitap04 {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Product> products = new HashMap<Integer, Product>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Product Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Filter Products (Price > 100)");
            System.out.println("6. Total Value of Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    filterProducts();
                    break;
                case 6:
                    totalValueOfProducts();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }
private static void addProduct() {
        System.out.println("Enter product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        products.put(id, new Product(id, name, price));
    System.out.println("Product added successfully.");
    }
    private static void editProduct() {
        System.out.println("Enter Product ID to edit: ");
        int id = scanner.nextInt();
        if (products.containsKey(id)) {
            scanner.nextLine();
            System.out.println("Enter new product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter new product price: ");
            double price = scanner.nextDouble();
            products.put(id, new Product(id, name, price));
            System.out.println("Product edited successfully.");
        }else
            System.out.println("Product not found.");
    }
    private static void deleteProduct() {
        System.out.println("Enter product ID to delete: ");
        int id = scanner.nextInt();
        if(products.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        }else
            System.out.println("Product not found.");

    }
    private static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");

        }else
            products.values().forEach(System.out::println);
    }
    private static void filterProducts() {
        System.out.println("Products with price greater than 100:");
        products.values().stream().filter(product -> product.getPrice() > 100).forEach(System.out::println);
    }
    private static void totalValueOfProducts() {
        System.out.println("Total Value of Products: ");
        double totalValue = products.values().stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total Value of Products: " + totalValue);
    }

}
