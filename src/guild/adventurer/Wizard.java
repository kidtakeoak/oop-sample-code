package guild.adventurer;

/**
 * 魔法使いクラス (スーパークラスを継承)
 */
public class Wizard extends Adventurer {
	public Wizard(String name, int level, int hp) {
		super(name, level, hp, "魔法使い");
	}

	@Override
	public void attack() {
		System.out.println(getName() + " は、ファイアを唱えた!");
	}

	@Override
	public void specialAction() {
		System.out.println(getName() + " は、ファイガを唱えた!");
	}
}
