package guild.quest;

public class Quest {
	// ==== フィールド ====
	private String title;
	private int difficulty;
	private int reward;

	// -------- OOP MEMO --------
	// 【カプセル化】
	// フィールドのアクセス修飾子をprivateに設定
	// クエストの難易度や報酬を、直接操作できない
	// メソッド経由でのみアクセスできる
	// --------------------------

	// ==== コンストラクタ ====
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
