package oop.interfaces;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for amount: " + amount);
        // Burada gerçek ödeme işlemleri gerçekleştirilebilir.
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for amount: " + amount);
        // Burada gerçek ödeme işlemleri gerçekleştirilebilir.
    }
}

// Uygulama içinde kullanım
public class ECommerceApp {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment("1234-5678-9101-1121", "12/25");
        PaymentMethod paypalPayment = new PayPalPayment("example@email.com");

        double totalPrice = 100.0;

        creditCardPayment.processPayment(totalPrice); // Output: Credit card payment processed for amount: 100.0
        paypalPayment.processPayment(totalPrice); // Output: PayPal payment processed for amount: 100.0
    }
}