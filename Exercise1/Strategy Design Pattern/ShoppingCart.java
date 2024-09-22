/**
 * ShoppingCart class uses a PaymentStrategy to process payments.
 * The strategy can be changed dynamically at runtime.
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    /**
     * Sets the payment strategy to be used by the shopping cart.
     *
     * @param paymentStrategy The PaymentStrategy to be used.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Executes the payment process using the set payment strategy.
     *
     * @param amount The amount to be paid.
     */
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
