package oop.enumeration;

import java.util.Arrays;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class PizzaOrder {
    Size size;
    PizzaOrder(Size size){
        this.size = size;
    }

    public void pizzaOrderSize(){
        switch (size){
            case SMALL:
                System.out.println("Small pizza");
                break;
            case MEDIUM:
                System.out.println("Medium pizza");
                break;
            case LARGE:
                System.out.println("Large pizza");
                break;
            case EXTRALARGE:
                System.out.println("Extra Large pizza");
                break;
            default:
                System.out.println("No Implementation");
        }
    }
}

public class SwitchCaseExample {

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder(Size.EXTRALARGE);
        pizzaOrder.pizzaOrderSize();
        System.out.println(pizzaOrder.size.ordinal());
        System.out.println(pizzaOrder.size == Size.EXTRALARGE);
        System.out.println(pizzaOrder.size.compareTo(Size.EXTRALARGE));
        System.out.println(Size.SMALL.compareTo(Size.EXTRALARGE));
        System.out.println(Size.LARGE.toString());
        System.out.println(Size.MEDIUM.name());

        System.out.println(Size.valueOf("SMALL") == Size.SMALL);
        Size[] sizes = Size.values();
        System.out.println(Arrays.toString(sizes));
    }
}
