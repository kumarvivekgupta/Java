import java.util.ArrayList;
import java.util.Random;

/**
 * Created by moneychaudhary on 07/09/17.
 */
public class Player {

    private ArrayList<Weapon> weapons = new ArrayList<>();
    private Paper paper;
    private Rock rock;
    private Scissor scissor;
    private int count;
    private Random random;
    private int score=0;


    public Player() {
        this.paper = new Paper();
        this.rock = new Rock();
        this.scissor = new Scissor();
        random =  new Random();
    }

    public void storeWeapons() {
        weapons.add(paper);
        weapons.add(rock);
        weapons.add(scissor);
        this.count =4;
    }

    public Weapon getWeapon()
    {
        this.count --;
        int randomNumber = this.random.nextInt(count);
        Weapon weapon =  this.weapons.get(randomNumber);
        this.weapons.remove(randomNumber);
        return weapon;
    }

    public void incScore()
    {
        this.score++;
    }

    public int getScore()
    {
        return this.score;
    }
}
