package guild.adventurer;

public class Hero extends Adventurer {
	// ==== コンストラクタ ====
	public Hero(String name, int level, int hp) {
		super(name, level, hp);
	}

	@Override
	public void attack() {
		System.out.println(getName() + " は、剣で攻撃した!");
	}

	@Override
	public void specialAction() {
		System.out.println(getName() + " は、剣で衝撃波を放った!!");
	}
}
