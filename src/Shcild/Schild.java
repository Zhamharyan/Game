package Shcild;

public abstract class Schild {
    private int perCentDamage;
    public abstract int returnDamage(int damage);
    public int getPerCentDamage() {
        return perCentDamage;
    }
    public void setPerCentDamage(int perCentDamage) {
        this.perCentDamage = perCentDamage;
    }
}
