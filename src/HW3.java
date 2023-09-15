import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ID товара: ");
            int productId = scanner.nextInt();
            System.out.print("Введите количество: ");
            int quantity = scanner.nextInt();

            try {
                double totalPrice = ShopManager.purchaseProduct(productId, quantity);
                System.out.println("Общая стоимость: $" + totalPrice);
            } catch (ProductNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductNotFoundException {
        Product product = ProductDatabase.getProduct(productId);

        if (product == null) {
            throw new ProductNotFoundException("Товар не найден");
        }

        if (product.getAvailableQuantity() < quantity) {
            try {
                throw new InsufficientQuantityException("Недостаточное количество товара");
            } catch (InsufficientQuantityException e) {
                e.printStackTrace();
            }
        }

        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}

class ProductDatabase {
    public static Product getProduct(int productId) {
        // Здесь должен быть код для получения информации о товаре из базы данных или хранилища по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product("Товар 1", 10, 5.99);
        }

        return null;
    }
}

class Product {
    private String name;
    private int availableQuantity;
    private double price;

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class InsufficientQuantityException extends Exception {
    public InsufficientQuantityException(String message) {
        super(message);
    }
}
