// Product.java
import java.util.ArrayList;
import java.util.List;

/**
 * The Product class acts as the observable entity.
 * It maintains a list of observers and notifies them of any price changes.
 */
public class Product {
    private List<Observer> observers;
    private float price;

    /**
     * Constructor to initialize the observer list.
     */
    public Product() {
        observers = new ArrayList<>();
    }

    /**
     * Adds an observer to the list of observers.
     *
     * @param observer The observer to be added.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Sets the price of the product and notifies all observers of the change.
     *
     * @param price The new price of the product.
     */
    public void setPrice(float price) {
        this.price = price;
        notifyAllObservers();
    }

    /**
     * Notifies all registered observers of the price change.
     */
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
