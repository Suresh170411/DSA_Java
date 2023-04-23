package StreamAPI;

import java.util.List;

public class Team {
    
    private List<Player> players;


    public int getTotalScore(){
        if (players != null){
            return players.stream().mapToInt(player -> player.getScore()).reduce(0, (a,b) -> a+b);
        }
        return 0;
    }

    public Team() {
    }

    public Team(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team [players=" + players + "]";
    }

    
    
}
