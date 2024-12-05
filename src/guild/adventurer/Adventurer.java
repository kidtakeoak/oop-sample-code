package guild.adventurer;

public abstract class Adventurer {
	// ==== フィールド ====
	private String name;
	private int level;
	private int hp;

	// ==== コンストラクタ ====
	public Adventurer(String name, int level, int hp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
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

	public abstract void attack();

	public abstract void specialAction();
}
