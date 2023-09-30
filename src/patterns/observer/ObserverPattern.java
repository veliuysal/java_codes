package patterns.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String productName);
}

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class Product implements Subject {

    private String productName;

    private boolean available;

    private List<Observer> listofObservers = new ArrayList<>();

    // ürünün varolup/olmadığı bilgisini döner.
    public boolean isAvailable() {
        return available;
    }

    // ürünün durumunu günceller.
    public void setAvailable(boolean available) {
        this.available = available;
        if (available == true) {
            notifyObservers();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // üründen haber almak isteyen müşterileri döner.
    public List<Observer> getListofObservers() {
        return listofObservers;
    }

    public void setListofObservers(List<Observer> listofObservers) {
        this.listofObservers = listofObservers;
    }

    // üründen haber almak isteyen müşteriyi ekler.
    @Override
    public void registerObserver(Observer observer) {
        listofObservers.add(observer);

    }

    // üründen haber almaktan vazgeçen müşteriyi siler.
    @Override
    public void removeObserver(Observer observer) {
        listofObservers.remove(observer);
    }

    // ürün ile ilgili değişikliği haber bekleyen müşterilere bildirir.
    @Override
    public void notifyObservers() {
        System.out.println("Haberdar olmak isteyen musterilere urun geldiginde haber vermektedir.");

        for (Observer observer : listofObservers) {
            observer.update(productName);
        }
    }
}

class Customer implements Observer {

    private String customerName;
    private Subject subject;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello " + customerName + ", " + productName + "urunu gelmistir. ");
    }

}

public class ObserverPattern {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("Bilge");

        Customer customer2 = new Customer();
        customer2.setCustomerName("Adem");

        Product iphone7 = new Product();
        iphone7.setProductName("Apple Iphone 7");
        iphone7.setAvailable(false);

        //iphone7 geldiğinde bildirim almak istiyorlar.
        iphone7.registerObserver(customer1);
        iphone7.registerObserver(customer2);

        // ürün geldi.
        iphone7.setAvailable(true);

        // ürün bitti
        iphone7.setAvailable(false);

        // customer1 üründen haber almaktan vazgeçti.
        iphone7.removeObserver(customer1);

        // ürün geldi.
        iphone7.setAvailable(true);
    }
}