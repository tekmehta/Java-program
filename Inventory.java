import java.util.Scanner;

public class Inventory{
  static Scanner sc = new Scanner(System.in);

  static class Product {
    int count;
    String name;
    int cost;

    Product(String name, int cost, int count) {
      this.count = count;
      this.name = name;
      this.cost = cost;
    }
  }

  static Product[] products = {
    new Product("Keyboard", 1800, 115),
    new Product("Mouse", 18000, 222),
    new Product("Mobile", 18000, 220),
    new Product("Charger", 18000, 200),
    new Product("Tablet", 7000, 105),
    new Product("TV", 40000, 150),
    new Product("Speaker", 1500, 850),
    new Product("Earphone", 1500, 80)
  };

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("--- Inventory Management System ---");
      System.out.println("1. Product List\n2. Number Of Product \n3. View Product details\n4. Edit Product\n5. Update Inventory\n6. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          viewProductList();
          break;
        case 2:
          viewProductCount();
          break;
        case 3:
          viewProductDetails();
          break;
        case 4:
          editProduct();
          break;
        case 5:
          updateInventory();
          break;
        case 6:
          System.out.println("Thank you for using Inventory Management System");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    } while (choice != 6);
  }

  private static void viewProductList() {
    System.out.println("Product List:");
    for (int i = 0; i < products.length; i++) {
      System.out.println((i + 1) + ". " + products[i].name);
    }
  }

  private static void viewProductCount() {
    System.out.print("Enter Product name: ");
    String name = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].name.equalsIgnoreCase(name)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.println("Quantity available: " + products[index].count);
    }
  }

  private static void viewProductDetails() {
    System.out.print("Enter Product name: ");
    String name = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].name.equalsIgnoreCase(name)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
     
      System.out.println("Product not found");
    } else {
      System.out.println("Product Name: " + products[index].name);
      System.out.println("Product Cost: " + products[index].cost);
      System.out.println("Product Quantity: " + products[index].count);
    }
  }

  private static void editProduct() {
    System.out.print("Enter Product name: ");
    String name = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].name.equalsIgnoreCase(name)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.print("Enter new Product name: ");
      String newName = sc.next();
      System.out.print("Enter new Product cost: ");
      int newCost = sc.nextInt();
      System.out.print("Enter new Product quantity: ");
      int newCount = sc.nextInt();
      products[index].name = newName;
      products[index].cost = newCost;
      products[index].count = newCount;
      System.out.println("Product updated successfully");
    }
  }

  private static void updateInventory() {
    System.out.print("Enter Product name: ");
    String name = sc.next();
    int index = -1;
    for (int i = 0; i < products.length; i++) {
      if (products[i].name.equalsIgnoreCase(name)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Product not found");
    } else {
      System.out.print("Enter quantity to add/delete: ");
      int count = sc.nextInt();
      products[index].count += count;
      System.out.println("Inventory updated successfully");
    }
  }
}
