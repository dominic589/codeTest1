package game;

import java.util.Random;

public class Archer extends Player {

    Random random = new Random();

    public Archer(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    void attack(Player opponent) {
        boolean criticalHit = random.nextInt(100) < 25; // 25% chance
        int damage = criticalHit ? attackPower * 2 : attackPower;

        if (criticalHit) {
            System.out.println(this.name + " lands a CRITICAL hit on " + opponent.name + " for " + damage + " damage!"); 
        }else {
            System.out.println(this.name + " shoots " + opponent.name + " for " + damage + " damage.");
        }

        opponent.takeDamage(damage);
    }
}
