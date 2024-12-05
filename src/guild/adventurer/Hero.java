package guild.adventurer;

/**
 * 勇者クラス (スーパークラスを継承)
 */
public class Hero extends Adventurer {
	// ==== コンストラクタ ====
	public Hero(String name, int level, int hp) {
		super(name, level, hp, "勇者");
	}

	// -------- OOP MEMO --------
	// 冒険者の共通機能はスーパークラスで実装
	// --------------------------
	
	// -------- OOP MEMO --------
	// 【オーバーライド】
	// スーパークラスのメソッドを、子クラスで上書きする
	// --------------------------
	@Override
	public void attack() {
		System.out.println(getName() + " は、剣で攻撃した!");
	}

	@Override
	public void specialAction() {
		System.out.println(getName() + " は、剣で衝撃波を放った!!");
	}
}
