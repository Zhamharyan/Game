package Warior;

import Weapon.Weapon;

public class Mag extends Warior{
    public Mag(int health){
        super();
        this.setHealth(health);
        this.setCoins(200);
    }
    public String getName(){
        return "Wizzard";
    }

    @Override
    public void takeAttack(int demage) {
        this.setHealth(this.getHealth()-demage);
    }
}
