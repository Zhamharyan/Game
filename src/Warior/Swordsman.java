package Warior;

import Skills.DoubleAttack;
import Weapon.Weapon;

public class Swordsman extends WariorWithSchilds  implements DoubleAttack {
    public Swordsman(int health){
        super();
        this.setHealth(health);
        this.setCoins(200);
    }

    private int doubleAttackCount = 0;

    public int getDoubleAttackCount() {
        return doubleAttackCount;
    }

    public void setDoubleAttackCount(int doubleAttackCount) {
        this.doubleAttackCount = doubleAttackCount;
    }
    @Override
    public boolean dubleAttack() {
        if(doubleAttackCount==1){
            return false;
        }
        return true;
    }
    @Override
    public void addToCount(){
        doubleAttackCount++;
    }
    @Override
    public int getCount(){
        return doubleAttackCount;
    }
    public String getName(){
        return "Swordsman";
    }
    @Override
    public void takeAttack(int demage) {
        this.setHealth(this.getHealth()-demage);
    }


}
