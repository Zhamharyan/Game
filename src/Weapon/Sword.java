package Weapon;

public class Sword extends SwordsmanWeapon{
    public Sword(){
        super();
        this.setDemage(80);
    }
    @Override
    public String getName() {
        return "Sword";
    }
}
