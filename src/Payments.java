interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of" + amount + " paid using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of" + amount + " paid using PayPal");
    }
}

class CashOnDelivery implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of" + amount + " has to be paid when the order arrives");
    }
}

class Customer {
    void pay(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class Payments {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.pay(new CreditCard(), 700);
        customer.pay(new PayPal(), 299);
        customer.pay(new CashOnDelivery(), 913);
    }
}




// import java.util.Arrays;
// import java.util.List;

// interface Payment {
//     void pay(double amount);
// }

// class CreditCardPayment implements Payment {
//     @Override
//     public void pay(double amount) {
//         System.out.println("Paid $" + amount + " using a credit card.");
//     }
// }

// class PayPalPayment implements Payment {
//     @Override
//     public void pay(double amount) {
//         System.out.println("Paid $" + amount + " using PayPal.");
//     }
// }

// class CashOnDeliveryPayment implements Payment {
//     @Override
//     public void pay(double amount) {
//         System.out.println("$" + amount + " will be paid on delivery.");
//     }
// }

// class Customer {
//     public void payUsingAllMethods(List<Payment> paymentMethods, double amount) {
//         for (Payment payment : paymentMethods) {
//             payment.pay(amount);
//         }
//     }
// }

// public class Payments {
//     public static void main(String[] args) {
//         Customer customer = new Customer();

//         List<Payment> paymentMethods = Arrays.asList(
//             new CreditCardPayment(),
//             new PayPalPayment(),
//             new CashOnDeliveryPayment()
//         );

//         customer.payUsingAllMethods(paymentMethods, 100.00);
//     }
// }
