package StreamAPI;

public class Player {
    private String playerName;
    private int score;
    private String role;
    
    public Player(){
        
    }

    public Player(String playerName, int score, String role) {
        this.playerName = playerName;
        this.score = score;
        this.role = role;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player [playerName=" + playerName + ", score=" + score + ", role=" + role + "]";
    }

    
}
