
import java.util.Random;

abstract class Player {

    String name;
    int health;
    int attackPower;
    static int totalPlayers;

    public Player(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = 100;
        totalPlayers++;
    }

    abstract void attack(Player opponent);

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(this.name + " has been eliminated!");
        }
    }

    public void displayStats() {
        System.out.println("PLAYER: " + this.name + " has a current health of " + this.health);
    }
}

class Warrior extends Player {

    int defensePower;

    public Warrior(String name, int attackPower, int defensePower) {
        super(name, attackPower);
        this.defensePower = defensePower;
    }

    @Override
    void attack(Player opponent) {
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage.");
        opponent.takeDamage(this.attackPower);
    }

    @Override
    public void takeDamage(int damage) {
        int damageTaken = Math.max(0, damage - this.defensePower);
        System.out.println(this.name + " defends and reduces incoming damage by " + this.defensePower + ".");
        super.takeDamage(damageTaken);
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println(" -> Defense Power: " + this.defensePower);
    }
}

public class Demo {

    public static void main(String[] args) {
        Random random = new Random();
        Warrior player1 = new Warrior("Aragorn", random.nextInt(30), random.nextInt(5)); // Aragorn has 10 defense
        Warrior player2 = new Warrior("Lurtz", random.nextInt(50), random.nextInt(8));   // Lurtz has 5 defense

        player1.displayStats();
        player2.displayStats();
        System.out.println("--- Battle Starts ---");

        System.out.println("\nRound 1: Aragorn attacks Lurtz!");
        player1.attack(player2);
        player2.displayStats();

        System.out.println("\nRound 2: Lurtz retaliates!");
        player2.attack(player1);
        player1.displayStats();

        System.out.println("Total players: " + Player.totalPlayers);
    }
}
