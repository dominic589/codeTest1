package game;

import java.util.Random;

public class BattleArena {

    private Player player1;
    private Player player2;
    private Random random = new Random();

    public BattleArena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startBattle() {
        System.out.println("\n⚔️ Battle Start: " + player1.name + " vs " + player2.name + " ⚔️\n");

        while (player1.health > 0 && player2.health > 0) {
            if (random.nextBoolean()) {
                player1.attack(player2);
            } else {
                player2.attack(player1);
            }

            System.out.println(player1.name + " HP: " + player1.health + " | " + player2.name + " HP: " + player2.health);
            System.out.println("------------------------------------");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        declareWinner();
    }

    private void declareWinner() {
        if (player1.health <= 0 && player2.health <= 0) {
            System.out.println("It's a draw!");
        } else if (player1.health <= 0) {
            System.out.println("🏆 " + player2.name + " wins!");
        } else {
            System.out.println("🏆 " + player1.name + " wins!");
        }
    }
}
