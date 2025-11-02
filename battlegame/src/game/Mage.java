package game;

public class Mage extends Player {

    int mana;

    public Mage(String name, int attackPower, int mana) {
        super(name, attackPower);
        this.mana = mana;
    }

    @Override
    void attack(Player opponent) {
        if (mana > 0) {
            System.out.println(this.name + " casts a spell on " + opponent.name + " for " + this.attackPower + " magic damage!");
            opponent.takeDamage(this.attackPower + 5);
            mana -= 10;
        } else {
            System.out.println(this.name + " is out of mana and performs a weak attack!");
            opponent.takeDamage(this.attackPower / 2);
        }
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println(" -> Mana: " + this.mana);
    }
}
