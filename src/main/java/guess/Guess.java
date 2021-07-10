package guess;

import java.util.Random;

/**
 * @author Veritas
 * @create 2021/7/10 15:13
 */
public class Guess {

    public static Choice normalGuess(Player p1) {

        Random random = new Random();
        int ans = random.nextInt(3);

        p1.choiceUpdate(ans);

        Choice choice = switch (ans) {
            case 0 -> Choice.ROCK;
            case 1 -> Choice.PAPER;
            case 2 -> Choice.SCISSOR;
            default -> throw new IllegalStateException("Unexpected value: " + ans);
        };

        return choice;
    }

    public static Choice specialGuess(Player p1) {

        int rock = 3, paper = 3, scissor = 2;

        Random random = new Random();
        int ans = random.nextInt(rock + paper + scissor);

        Choice choice = Choice.PAPER;

        if(ans < rock) {
            p1.choiceUpdate(0); choice =  Choice.ROCK;
        } else if(ans < rock + paper) {
            p1.choiceUpdate(1); choice =  Choice.PAPER;
        } else {
            p1.choiceUpdate(2); choice =  Choice.SCISSOR;
        }

        return choice;
    }


    public static Choice advancedGuess(Player p1,Player opponent) {

        int[] opp = opponent.getHistoryChoice();
        int op_rock = opp[0]; int op_paper = opp[1]; int op_scissor = opp[2];
        Random random = new Random();
        int ans = random.nextInt(op_rock + op_paper + op_scissor);

        Choice choice = Choice.PAPER;

        if(ans <= op_rock) {
            p1.choiceUpdate(1); choice =  Choice.PAPER;
        } else if(ans <= op_rock+ op_paper) {
            p1.choiceUpdate(2); choice =  Choice.SCISSOR;
        } else if(ans < op_rock + op_paper +op_scissor){
            p1.choiceUpdate(0); choice =  Choice.ROCK;
        }

        return choice;
    }
}
