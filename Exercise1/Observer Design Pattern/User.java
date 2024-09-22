// User.java
/**
 * User class that acts as an observer. It receives updates about the product's price.
 */
public class User implements Observer {
    private String name;

    /**
     * Constructor to initialize the user with a name.
     *
     * @param name The name of the user.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Method called when the product price changes.
     *
     * @param price The new price of the product.
     */
    @Override
    public void update(float price) {
        System.out.println("User " + name + " notified. New Price: " + price);
    }
}

