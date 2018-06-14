package missilegame.missile;

public abstract class Missile {
    private String name;
    private int attackDamage;

    public Missile(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
