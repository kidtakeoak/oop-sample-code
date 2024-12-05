package guild.adventurer;


/**
 * 冒険者のスーパークラス
 */
public abstract class Adventurer {
	// ==== フィールド ====
	private String name;
	private int level;
	private int hp;
	private String job;
	
	// --------　OOP MEMO --------
	// 【カプセル化】
	// フィールドのアクセス修飾子をprivateに設定
	// 冒険者のHPやレベルを直接操作できない
	// メソッド経由でのみアクセスできる
	// --------------------------

	// ==== コンストラクタ ====
	public Adventurer(String name, int level, int hp, String job) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getHp() {
		return hp;
	}
	
	public String getJob() {
		return job;
	}

	// -------- OOP MEMO --------
	// 冒険者の共通機能はスーパークラスで実装
	// --------------------------
	
	/**
	 * ダメージを受ける
	 * 
	 * @param damage 受けるダメージ
	 */
	public void receiveDamage(int damage) {
		this.hp = Math.max(0, this.hp - damage);
	}

	/**
	 * HPを回復する
	 * 
	 * @param amount 回復量
	 */
	public void heal(int amount) {
		this.hp += amount;
	}

	/**
	 * レベルが1上がる
	 */
	public void levelUp() {
		this.level++;
		this.hp += 10; // レベルアップ時にHPが10増加する
	}

	// -------- OOP MEMO --------
	// 【抽象クラス】
	// 子クラスでのオーバーライド(実装)を強制
	// --------------------------
	public abstract void attack();
	public abstract void specialAction();
}
