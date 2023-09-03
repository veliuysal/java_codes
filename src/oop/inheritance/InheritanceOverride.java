package oop.inheritance;

class AnimalFamily {
    public void eat() {
        System.out.print("I can eat");
    }
}

class Carnivour extends AnimalFamily {

    @Override
    public void eat() {
        System.out.println("I can only eat meat");
    }
}

class Herbivour extends AnimalFamily {

    @Override
    public void eat() {
        System.out.println("I can only eat herb");
    }
}

class Omnivour extends AnimalFamily {
    @Override
    public void eat() {
        super.eat();
        System.out.println(" both them");
    }
}

public class InheritanceOverride {
    public static void main(String[] args) {
        Carnivour etcil = new Carnivour();
        Herbivour otcul = new Herbivour();
        Omnivour hepsiniYer = new Omnivour();

        etcil.eat();
        otcul.eat();
        hepsiniYer.eat();
    }
}
