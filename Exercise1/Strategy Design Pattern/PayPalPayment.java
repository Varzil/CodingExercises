/**
 * PayPalPayment class implements the PaymentStrategy interface.
 * It simulates payment using PayPal.
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;

    /**
     * Constructor to initialize the PayPal email.
     *
     * @param email The PayPal account email.
     */
    public PayPalPayment(String email) {
        this.email = email;
    }

    /**
     * Processes payment using PayPal.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal with email: " + email);
    }
}
