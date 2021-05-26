package Shcild;

public class LowShild extends Schild{
    public LowShild(){
        super();
        this.setPerCentDamage(10);
    }
    @Override
    public int returnDamage(int damage) {
        damage -= (int)((double)damage/(double)100*this.getPerCentDamage());
        return damage;
    }
}
