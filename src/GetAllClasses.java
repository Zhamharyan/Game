import Weapon.*;
public class GetAllClasses {
    public static Weapon[] getAllSwordsWeapon(){
        return new Weapon[]{new Sword(),new MagicSword()};
    }
    public static Weapon[] getAllArcherWeapon(){
        return new Weapon[]{new Arch()};
    }
    public static Weapon[] getAllWizzardWeapon(){
        return new Weapon[]{new MagWeapon()};
    }
}
