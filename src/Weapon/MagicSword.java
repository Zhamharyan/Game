package Weapon;

public class MagicSword extends SwordsmanWeapon{

    public MagicSword(){
        super();
        this.setDemage(140);
    }

    @Override
    public String getName() {
        return "MagicSword";
    }
}
