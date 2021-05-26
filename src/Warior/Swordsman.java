package Warior;

import Weapon.Weapon;

public class Swordsman extends WariorWithSchilds{
    public Swordsman(int health){
        super();
        this.setHealth(health);
        this.setCoins(200);
    }
    public String getName(){
        return "Swordsman";
    }


    @Override
    public void takeAttack(int demage) {
        this.setHealth(this.getHealth()-demage);
    }
}
