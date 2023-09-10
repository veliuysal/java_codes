package oop.enumeration;

public class EnumTest {

    public static void main(String[] args) {
        BagSize bagSize = BagSize.SHORT;

        System.out.print(bagSize.name() + " bag is ");
        System.out.println(bagSize.getPrice() + "$");
    }
}

//Buradan sonrası farklı bir class

enum BagSize {

    SHORT(15), MEDIUM(20), BIG(25);

    private int price;

    BagSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
