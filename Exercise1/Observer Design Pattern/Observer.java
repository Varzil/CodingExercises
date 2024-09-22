// Observer.java
/**
 * Observer interface to be implemented by all observers.
 * This defines a contract for any class that wants to be notified of changes in the observed object.
 */
public interface Observer {
    /**
     * Method called when the observed object changes.
     *
     * @param price The new price of the product.
     */
    void update(float price);
}

