package game;

public class Player {

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
