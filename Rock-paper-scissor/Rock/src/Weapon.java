import java.util.Random;

/**
 * Created by moneychaudhary on 07/09/17.
 */
public class Weapon {
    private int strength;
    private String title;

    protected final String SCISSOR = "scissor";
    protected final String ROCK = "rock";
    protected final String PAPER = "paper";


    public Weapon() {
        this.strength = new Random().nextInt(1000);
    }


    protected void setTitle(String title) {
        this.title = title;
        System.out.println( this.title + " "+ this.strength);;
    }

    public String getTitle() {
        return this.title;
    }


    public int getStrength() {
        return this.strength;
    }

    public void setStrength() {
        this.strength = strength;
    }

    public boolean battle(Weapon weapon) {
        int weapon1Strength = this.getStrength();
        int weapon2Strength = weapon.getStrength();
        System.out.println("Player 1 "+ this.getTitle());
        System.out.println("Player 2 "+ weapon.getTitle());

        if (this.getTitle().equals(ROCK) && weapon.getTitle().equals(PAPER)) {
            weapon1Strength /= 2;
            weapon2Strength *= 2;
        } else if (this.getTitle().equals(PAPER) && weapon.getTitle().equals(ROCK)) {
            weapon1Strength *= 2;
            weapon2Strength /= 2;
        } else if (this.getTitle().equals(PAPER) && weapon.getTitle().equals(SCISSOR)) {
            weapon1Strength /= 2;
            weapon2Strength *= 2;
        } else if (this.getTitle().equals(SCISSOR) && weapon.getTitle().equals(PAPER)) {
            weapon1Strength *= 2;
            weapon2Strength /= 2;
        } else if (this.getTitle().equals(SCISSOR) && weapon.getTitle().equals(ROCK)) {
            weapon1Strength /= 2;
            weapon2Strength *= 2;
        } else if (this.getTitle().equals(ROCK) && weapon.getTitle().equals(SCISSOR)) {
            weapon1Strength *= 2;
            weapon2Strength /= 2;
        }

        if (weapon1Strength > weapon2Strength) {
            return true;
        } else {
            return false;
        }

    }


}
