package game;

public class Warrior extends Player {

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
