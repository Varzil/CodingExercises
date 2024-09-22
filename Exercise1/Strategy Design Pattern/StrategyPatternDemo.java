/**
 * Main class to demonstrate the Strategy pattern.
 * Different payment methods can be used dynamically during runtime.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200);

        // Pay using Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300);
    }
}
