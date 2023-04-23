package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ScoreSum {

    public static void main(String[] args) {
        Player p1 = new Player("Rinku Singh", 30, "Batsman");
        Player p2 = new Player("Prasidh", 9, "Bowler");
        Player p3 = new Player("Shardul", 40, "Bowler");

        List<Player> players = new ArrayList<>();

        players.add(p1);
        players.add(p2);
        players.add(p3);

        Team kkr = new Team();
        kkr.setPlayers(players);

        System.out.println("Total Score of KKR is : "+kkr.getTotalScore());
    }
}
