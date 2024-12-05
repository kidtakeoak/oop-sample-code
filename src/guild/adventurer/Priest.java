package guild.adventurer;

public class Priest extends Adventurer {
    public Priest(String name, int level, int hp) {
        super(name, level, hp);
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

