/**
 * Created by itakg on 9/7/2017.
 */
public class PlayGame {
    private static final int NO_OF_GAMES = 20;
    private static final int NO_OF_ROUNDS = 3;

    public static void main(String[] args) {
        System.out.println("PLAYER 1");
        Player player1 = new Player();
        System.out.println();
        System.out.println("PLAYER 2");
        Player player2 = new Player();
        System.out.println();

        for (int i = 1; i <= NO_OF_GAMES; i++) {
            System.out.println("Game NO : " + i);
            System.out.println();
            player1.storeWeapons();
            player2.storeWeapons();
            int player1TempScore = 0;
            int player2TempScore = 0;

            for (int j = 1; j <= NO_OF_ROUNDS; j++) {
                System.out.println("ROUND : " + j);
                if (player1.getWeapon().battle(player2.getWeapon())) {
                    player1TempScore++;
                    System.out.println("ROUND WIN BY PLAYER 1");

                } else {
                    player2TempScore++;
                    System.out.println("ROUND WIN BY PLAYER 2");
                }
                System.out.println();
            }
            if (player1TempScore > player2TempScore) {
                System.out.println("GAME WIN BY PLAYER 1");
                player1.incScore();
            } else {
                System.out.println("GAME WIN BY PLAYER 2");
                player2.incScore();
            }
            System.out.println();
        }
        System.out.println("********FINAL SCORES********");
        System.out.println("SCORE OF PLAYER 1: " + player1.getScore());
        System.out.println("SCORE OF PLAYER 2: " + player2.getScore());
        if (player1.getScore() > player2.getScore())
            System.out.println("PLAYER 1 WINS THE TOURNAMENT");
        else if (player1.getScore() < player2.getScore())
            System.out.println("PLAYER 2 WINS THE TOURNAMENT");
        else
            System.out.println("NO RESULT");
    }

}
