package Weapon;

import java.util.Random;

public abstract class Weapon {

    Random random = new Random();
    private int demage;


    public int getDemage() {
        int number = random.nextInt(2);
        int countToChange = random.nextInt(10);
        if(number==1){
            demage += (double)demage/(double)(100)*countToChange;
        }
        else{
            demage -= (double)demage/(double)(100)*countToChange;
        }
        return demage;
    }
    public int getStaticDemage(){
        return demage;
    }
    public void setDemage(int demage) {
        this.demage = demage;
    }
    public String getName() {
        return "";
    }
}
