package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample1 {

    //Player isminde bir sınıfımız olsun. bu sınıfta Oyuncunun ismini tutsun. Bu Oyuncudan türeyen Futbolcu ve Basketbolcu sınıflarımız olsun.
    // Bir generics class olsun ve o sınıfta bu oyuncudan türeyen tüm sınıfları desteklesin. Bu Generics içinde bizim oyuncu listemiz olsun
    // ve listeye ekleme işlemi gerçekleştirilebilsin. Bir de bu listeyi ekrana yazdıran bir metodumuz olsun.

    public static void main(String[] args) {
        Team<FootballPlayer> footballPlayerTeam = new Team<>("Java Devs");
        Team<BasketPlayer> basketPlayerTeam = new Team<>("Others");

        FootballPlayer footballPlayer1 = new FootballPlayer("Generics");
        FootballPlayer footballPlayer2 = new FootballPlayer("Collections");

        footballPlayerTeam.addPlayer(footballPlayer1);
        footballPlayerTeam.addPlayer(footballPlayer2);

        footballPlayerTeam.listPlayers();

        BasketPlayer basketPlayer=new BasketPlayer("JS");
        basketPlayerTeam.addPlayer(basketPlayer);
    }
}

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class FootballPlayer extends Player {
    FootballPlayer(String name) {
        super(name);
    }
}

class BasketPlayer extends Player {
    BasketPlayer(String name) {
        super(name);
    }
}

class Team<T extends Player> {
    private String name;
    private List<T> players;

    Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(T player) {
        this.players.add(player);
        System.out.println(player.getName() + " added to team " + name);
    }

    public void listPlayers() {
        System.out.print("Players of team " + name + ": ");
        for (T player : players) {
            System.out.print(player.getName() + " - ");
        }
    }
}
