package guild.adventurer;

public class Wizard extends Adventurer {
    public Wizard(String name, int level, int hp) {
        super(name, level, hp);
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

