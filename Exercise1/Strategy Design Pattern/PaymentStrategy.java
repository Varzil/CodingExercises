/**
 * PaymentStrategy interface defines a contract for various payment methods.
 * Each payment method will implement this interface to provide a specific payment process.
 */
public interface PaymentStrategy {
    /**
     * Method to be implemented by all payment strategies to process payment.
     *
     * @param amount The amount to be paid.
     */
    void pay(int amount);
}
