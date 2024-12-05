package guild.quest;

public class Quest {
    private String title;
    private int difficulty;
    private int reward;

    public Quest(String title, int difficulty, int reward) {
        this.title = title;
        this.difficulty = difficulty;
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getReward() {
        return reward;
    }
}

