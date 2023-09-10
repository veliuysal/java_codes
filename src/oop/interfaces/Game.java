package oop.interfaces;

abstract class Enemy {
    protected int health;
    protected int damage;

    public abstract void attack(); // Soyut metot

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Enemy defeated!");
        }
    }
}

class Goblin extends Enemy {
    public Goblin() {
        health = 50;
        damage = 10;
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks with " + damage + " damage.");
    }
}

class Zombie extends Enemy {
    public Zombie() {
        health = 100;
        damage = 5;
    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks with " + damage + " damage.");
    }
}

// Oyun içinde kullanım
public class Game {
    public static void main(String[] args) {
        Enemy goblin = new Goblin();
        Enemy zombie = new Zombie();

        goblin.attack(); // Output: Goblin attacks with 10 damage.
        zombie.attack(); // Output: Zombie attacks with 5 damage.

        goblin.takeDamage(15); // Output: Enemy defeated!
    }
}
