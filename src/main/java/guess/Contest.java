package guess;

/**
 * @author Veritas
 * @create 2021/7/10 16:02
 */
public class Contest {

    public static void compare(Player p1,Player p2) {

        Choice p1Choice = Guess.specialGuess(p1);
        Choice p2Choice = Guess.advancedGuess(p2,p1);

        if(p1Choice == p2Choice) {
            ;
        } else if(p1Choice == Choice.ROCK && p2Choice == Choice.SCISSOR) {
            p1.winUpdate();
        } else if(p1Choice == Choice.ROCK && p2Choice == Choice.PAPER) {
            p2.winUpdate();
        } else if(p1Choice == Choice.PAPER && p2Choice == Choice.ROCK) {
            p1.winUpdate();
        } else if(p1Choice == Choice.PAPER && p2Choice == Choice.SCISSOR) {
            p2.winUpdate();
        } else if(p1Choice == Choice.SCISSOR && p2Choice == Choice.PAPER) {
            p1.winUpdate();
        } else if(p1Choice == Choice.SCISSOR && p2Choice == Choice.ROCK) {
            p2.winUpdate();
        }
    }

    public static void main(String[] args) {

        double contest = 10;

        Player p1 = new Player(contest);
        Player p2 = new Player(contest);

        for(int i = 0; i < contest; ++i) {
            compare(p1,p2);
        }

        double win1 = p1.getWin();
        double win2 = p2.getWin();

        System.out.println("玩家1胜利局数："+p1.getWin());
        System.out.println("玩家1胜率："+win1/contest);
        System.out.println("玩家2胜利局数："+p2.getWin());
        System.out.println("玩家2胜率："+win2/contest);
    }
}
