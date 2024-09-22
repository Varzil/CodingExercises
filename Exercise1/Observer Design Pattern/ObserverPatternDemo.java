// ObserverPatternDemo.java
/**
 * Main class to demonstrate the Observer pattern.
 * This class creates a product and users that subscribe to the product's price updates.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a product
        Product product = new Product();

        // Create users and add them as observers
        User user1 = new User("A");
        User user2 = new User("B");

        product.addObserver(user1);
        product.addObserver(user2);

        // Change the product price and notify observers
        product.setPrice(100); // Both users will be notified
        product.setPrice(150); // Both users will be notified again
    }
}
