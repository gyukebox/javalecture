package missilegame.enemy;

public class Enemy {
    private String name;
    private int healthPower;

    public Enemy(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
        System.out.println(this.name + "의 체력: " + healthPower);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
