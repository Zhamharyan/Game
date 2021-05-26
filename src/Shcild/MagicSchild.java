package Shcild;

public class MagicSchild extends Schild{
    public MagicSchild(){
        super();
        this.setPerCentDamage(25);
    }
    @Override
    public int returnDamage(int damage) {
        damage -= (int)((double)damage/(double)100*this.getPerCentDamage());
        return damage;
    }
}
