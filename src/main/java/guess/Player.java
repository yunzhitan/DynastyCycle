package guess;

import lombok.Data;

/**
 * @author Veritas
 * @create 2021/7/10 15:08
 */

@Data
public class Player {

    private int[] historyChoice = new int[3];

    private int win = 0;

    private double contestNumber = 0;

    public Player(double contestNumber) {
        this.contestNumber = contestNumber;
    }

    public void choiceUpdate(int choice) {
        historyChoice[choice]++;
    }

    public void winUpdate() {
        win++;
    }

}
