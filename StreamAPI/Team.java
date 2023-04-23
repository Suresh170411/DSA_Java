package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Team {
    
    private List<Player> players;

    // method for getting total score
    public int getTotalScore(){
        if (players != null){
            return players.stream().mapToInt(player -> player.getScore()).reduce(0, (a,b) -> a+b);
        }
        return 0;
    }

    // method for getting number of batsman / bowler
    public Map<String, List<Player>> givePlayerBySkillSet(){
        Map<String, List<Player>> bySkill = players.stream().collect(Collectors.groupingBy(Player::getRole)); 
        return bySkill;
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
