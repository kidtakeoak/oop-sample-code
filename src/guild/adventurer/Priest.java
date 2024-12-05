package guild.adventurer;

/**
 * 僧侶クラス (スーパークラスを継承)
 */
public class Priest extends Adventurer {
	public Priest(String name, int level, int hp) {
		super(name, level, hp, "僧侶");
	}

	@Override
	public void attack() {
		System.out.println(getName() + " は、杖で攻撃した!");
	}

	@Override
	public void specialAction() {
		System.out.println(getName() + " は、バリアーを唱えた!");
	}
}
