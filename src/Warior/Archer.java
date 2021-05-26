package Warior;

import Weapon.Weapon;

public class Archer extends WariorWithSchilds{

    public Archer(int health){
        super();
        this.setCoins(200);
        this.setHealth(health);
    }
    public String getName(){
        return "Archer";
    }

    @Override
    public void takeAttack(int demage) {
        this.setHealth(this.getHealth()-demage);
    }
}
