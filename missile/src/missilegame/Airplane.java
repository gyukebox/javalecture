package missilegame;

import missilegame.enemy.Enemy;
import missilegame.missile.Missile;

public class Airplane implements Attackable {
    private Missile currentMissile;

    public Airplane(Missile missile) {
        this.currentMissile = missile;
    }

    public Missile getCurrentMissile() {
        return currentMissile;
    }

    public void setCurrentMissile(Missile currentMissile) {
        this.currentMissile = currentMissile;
    }

    @Override
    public void attack(Enemy target) {
        target.setHealthPower(target.getHealthPower() - this.currentMissile.getAttackDamage());
    }
}
