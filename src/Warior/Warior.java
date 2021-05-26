package Warior;

import Weapon.*;

public abstract class Warior {
    private int health;
    public abstract void takeAttack(int demage);
    private Weapon weapon;
    private int coins;

    public int getCoins() {
        return coins;
    }
    public void setCoins(int coins) {
        this.coins = coins;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract String getName();
    /*abstract void takeAttack();*/
}
