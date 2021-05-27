import Shcild.LowShild;
import Shcild.MagicSchild;
import Skills.DoubleAttack;
import Warior.Warior;

import java.util.Random;
import java.util.Scanner;
import Warior.*;
import Weapon.Arch;
import Weapon.MagWeapon;
import Weapon.Sword;
import Weapon.Weapon;
import Weapon.*;
import java.util.*;
public class Start {
    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        Warior[] wariors = new Warior[2];
        wariors[0] = createPlayerWarior();
        int passedLevels = 0;
        compCreateNewHero:
        while(wariors[0].getHealth()>=0){
            Warior compHero = createCompPlayer();
            wariors[1] = compHero;
            System.out.println("Your hero is "+wariors[0].getName()+"\nComp hero is "+wariors[1].getName());
            int whoIsStart = decideWhoToStart();
            while(whoIsStart==2){
                whoIsStart = decideWhoToStart();
            }
            if(whoIsStart == 0){
                System.out.println("Your health is "+wariors[0].getHealth()+" You have "+wariors[0].getCoins()+" coins");
                System.out.println("Computer health is "+wariors[1].getHealth());
                System.out.println("Game start You");
                while(true){
                    if(wariors[0] instanceof DoubleAttack) {
                        DoubleAttack doubleAttack = (DoubleAttack) wariors[0];
                        if(doubleAttack.getCount()==0) {
                            System.out.println("Once in a game you can take skill DoubleAttack");
                        }
                        System.out.println("You are attacking\nPress enter to continue\nEnter market to go to market\nInput double to take skill DoubleAttack");
                    }
                    else{
                        System.out.println("You are attacking\nPress enter to continue\nEnter market to go to market");
                    }
                    String response = scanner.nextLine();
                    if(response.equals("")) {
                        attackFirst(wariors);
                        if (wariors[1].getHealth() <= 0) {
                            System.out.println("You win,go to next step");
                            wariors[0].setCoins(wariors[0].getCoins()+100);
                            passedLevels++;
                            continue compCreateNewHero;
                        }
                    }
                    else if(response.equals("double")){
                        DoubleAttack doubleAttackWarior = (DoubleAttack)wariors[0];
                        boolean responseToGetSkill = doubleAttackWarior.dubleAttack();

                        if(responseToGetSkill){
                            doubleAttackWarior.addToCount();
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                        }
                        else{
                            System.out.println("You have already take this skill");
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                        }
                    }
                    else if(response.equals("market")){
                        goToMarket(wariors[0]);
                        attackFirst(wariors);
                        if (wariors[1].getHealth() <= 0) {
                            System.out.println("You win,go to next step");
                            wariors[0].setCoins(wariors[0].getCoins()+100);
                            passedLevels++;
                            continue compCreateNewHero;
                        }
                    }
                    System.out.println("Computer is attacking,press enter to continue");
                    response = scanner.nextLine();
                    if(response.equals("")){
                        attackSecond(wariors);
                        if(wariors[0].getHealth()<=0){
                            System.out.println("Computer win,You have passed "+passedLevels);
                            break compCreateNewHero;
                        }
                    }
                }
            }
            else{
                System.out.println("Your health is "+wariors[0].getHealth()+" You have "+wariors[0].getCoins()+" coins");
                System.out.println("Computer health is "+wariors[1].getHealth()+" Computer has "+wariors[1].getCoins()+" coins");
                System.out.println("Game start Computer");
                while(true){
                    System.out.println("Computer is attacking,press enter to continue");
                    String response = scanner.nextLine();
                    if(response.equals("")) {
                        attackSecond(wariors);
                        if (wariors[0].getHealth() <= 0) {
                            System.out.println("Computer win,You have passed "+passedLevels);
                            break compCreateNewHero;
                        }
                    }
                    if(wariors[0] instanceof DoubleAttack) {
                        DoubleAttack doubleAttack = (DoubleAttack) wariors[0];
                        if(doubleAttack.getCount()==0) {
                            System.out.println("Once in a game you can take skill DoubleAttack");
                        }
                        System.out.println("You are attacking\nPress enter to continue\nEnter market to go to market\nInput double to take skill DoubleAttack");
                    }
                    else{
                        System.out.println("You are attacking\nPress enter to continue\nEnter market to go to market");
                    }
                    response = scanner.nextLine();
                    if(response.equals("")){
                        attackFirst(wariors);
                        if(wariors[1].getHealth()<=0){
                            System.out.println("You win,go to next step");
                            wariors[0].setCoins(wariors[0].getCoins()+100);
                            passedLevels++;
                            continue compCreateNewHero;
                        }
                    }
                    else if(response.equals("double")){
                        DoubleAttack doubleAttackWarior = (DoubleAttack)wariors[0];
                        boolean responseToGetSkill = doubleAttackWarior.dubleAttack();

                        if(responseToGetSkill){
                            doubleAttackWarior.addToCount();
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                        }
                        else{
                            System.out.println("You have already take this skill");
                            attackFirst(wariors);
                            if (wariors[1].getHealth() <= 0) {
                                System.out.println("You win,go to next step");
                                wariors[0].setCoins(wariors[0].getCoins()+100);
                                passedLevels++;
                                continue compCreateNewHero;
                            }
                        }
                    }
                    else if(response.equals("market")){
                        goToMarket(wariors[0]);
                        attackFirst(wariors);
                        if(wariors[1].getHealth()<=0){
                            System.out.println("You win,go to next step");
                            wariors[0].setCoins(wariors[0].getCoins()+100);
                            passedLevels++;
                            continue compCreateNewHero;
                        }
                    }
                }
            }
        }
    }
    private static void goToMarket(Warior warior){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have "+warior.getCoins()+" coins");
        System.out.println("Press 1 to buy 150 health -> 100 coins");
        System.out.println("Press exit to exit");
        String response = scanner.nextLine();
        if(response.equals("exit")){
           return;
        }
        else if(response.equals("1")){
            if(warior.getCoins()>=100) {
                warior.setCoins(warior.getCoins() - 100);
                warior.setHealth(warior.getHealth() + 150);
                return;
            }
            else{
                System.out.println("You do not have enought coins");
            }
        }
    }
    private static Warior createCompPlayer(){
        System.out.println("Comp is creating her hero");
        Random random = new Random();
        int compChoose = random.nextInt(3)+1;
        Warior compHero = createWarior(compChoose);
        return compHero;
    }
    private static Warior createPlayerWarior(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your hero");
        System.out.print("Press 1 to choose Archer\nPress 2 to choose Swordsman\nPress 3 to choose Mag\n");
        int choose = scanner.nextInt();
        Warior myHero = createWarior(choose);
        return myHero;
    }
    private static void changeWeapon(Warior[] wariors){
        Scanner scanner = new Scanner(System.in);
        if(wariors[0] instanceof Swordsman){
            System.out.println("If you want to change your weapon select one of this,it will cost you -100 health");
            Weapon[] swordsManWeapons = GetAllClasses.getAllSwordsWeapon();/*new Weapon[]{ new Sword(),new MagicSword()};*/
            for(int i = 0;i<swordsManWeapons.length;i++){
                if(wariors[0].getWeapon().getClass()==swordsManWeapons[i].getClass()){
                    continue;
                }
                System.out.println("Press "+(i)+" To change to "+swordsManWeapons[i].getName()+" is's damage is "+swordsManWeapons[i].getStaticDemage()+" + or - [0-10]%");
            }
            System.out.println("Press other anything to continue");
        }
        String responseToChange = scanner.nextLine();
        boolean isChanged = false;
        if(!responseToChange.equals("")&&responseToChange.replaceAll("[0-9]","").equals("")) {
            for(int i = 0;i<GetAllClasses.getAllSwordsWeapon().length;i++){
                if(Integer.parseInt(responseToChange)==i){
                    wariors[0].setWeapon(GetAllClasses.getAllSwordsWeapon()[i]);
                    isChanged = true;
                    wariors[0].setHealth(wariors[0].getHealth()-100);
                    System.out.println("You have changed your weapon to "+GetAllClasses.getAllSwordsWeapon()[i].getName()+" and your health become "+wariors[0].getHealth());
                    break;
                }
            }
        }

    }
    private static void attackFirst(Warior[] wariors){
            changeWeapon(wariors);
            int demageToOponent = wariors[0].getWeapon().getDemage();
            int oponentOldHealth = wariors[1].getHealth();
            if (wariors[1] instanceof WariorWithSchilds) {
                WariorWithSchilds wariorWithSchild = (WariorWithSchilds) wariors[1];
                if (oponentOldHealth > 100) {
                    wariorWithSchild.setSchild(new LowShild());
                } else {
                    wariorWithSchild.setSchild(new MagicSchild());
                }
                int oldDamageToOponent = demageToOponent;
                demageToOponent = wariorWithSchild.getSchild().returnDamage(demageToOponent);
                wariors[1].takeAttack(demageToOponent);
                System.out.println("Your damage = " + oldDamageToOponent + " Opponent has shild because your damage become " + demageToOponent);
                System.out.println("Oponent helth was " + oponentOldHealth + " after attack is " + wariors[1].getHealth());
            } else {
                wariors[1].takeAttack(demageToOponent);
                System.out.println("Your damage = " + demageToOponent);
                System.out.println("Oponent helth was " + oponentOldHealth + " after attack is " + wariors[1].getHealth());
            }
        System.out.println();
    }
    private static void attackSecond(Warior[] wariors){
        int demageToOponent = wariors[1].getWeapon().getDemage();
        int oponentOldHealth = wariors[0].getHealth();
        if(wariors[0] instanceof WariorWithSchilds){
            WariorWithSchilds wariorWithSchild = (WariorWithSchilds)wariors[0];
            if(oponentOldHealth>100){
                wariorWithSchild.setSchild(new LowShild());
            }
            else{
                wariorWithSchild.setSchild(new MagicSchild());
            }
            int oldDamageToOponent = demageToOponent;
            demageToOponent = wariorWithSchild.getSchild().returnDamage(demageToOponent);
            wariors[0].takeAttack(demageToOponent);
            System.out.println("Computer damage = "+oldDamageToOponent+" You have shild because opponent damage become "+demageToOponent);
            System.out.println("Your helth was "+oponentOldHealth+" after attack is "+wariors[0].getHealth());
        }
        else{
            wariors[0].takeAttack(demageToOponent);
            System.out.println("Computer damage = "+demageToOponent);
            System.out.println("Your helth was "+oponentOldHealth+" after attack is "+wariors[0].getHealth());
        }
        System.out.println();
    }
    private static int decideWhoToStart(){
        System.out.println("Please turn cubes to decide who is starting");
        Random random = new Random();
        int myCubeNumber = random.nextInt(6)+1;
        int compCubeNumber = random.nextInt(6)+1;
        printCube(myCubeNumber);
        System.out.println();
        printCube(compCubeNumber);
        System.out.println();
        return myCubeNumber>compCubeNumber?0:myCubeNumber==compCubeNumber?2:1;
    }
    private static void printCube(int i){
        String[][] cube = new String[3][3];
        if(i==1){
            cube = new String[][]{{" "," ",""},{" ","*"," "},{" "," "," "}};
        }
        else if(i==2){
            cube = new String[][]{{" "," ",""},{"*"," ","*"},{" "," "," "}};
        }
        else if(i==3){
            cube = new String[][]{{"*"," "," "},{" ","*"," "},{" "," ","*"}};
        }
        else if(i==4){
            cube = new String[][]{{"*"," ","*"},{" "," "," "},{"*"," ","*"}};
        }
        else if(i==5){
            cube = new String[][]{{"*"," ","*"},{" ","*"," "},{"*"," ","*"}};
        }
        else if(i==6){
            cube = new String[][]{{"*"," ","*"},{"*"," ","*"},{"*"," ","*"}};
        }
        for(int j = 0;j<3;j++){
            for(int k = 0;k<3;k++){
                System.out.print(cube[j][k]);
            }
            System.out.print("\n");
        }
    }
    /*private static Warior[] creatingWariors(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose your hero");
        System.out.print("Press 1 to choose Archer\nPress 2 to choose Swordsman\nPress 3 to choose Mag\n");
        int choose = scanner.nextInt();
        Warior myHero = createWarior(choose);
        int compChoose = random.nextInt(3)+1;
        Warior compHero = createWarior(compChoose);
        Warior[] wariors = new Warior[2];
        wariors[0] = myHero;
        wariors[1] = compHero;
        System.out.println("Your hero is "+myHero.getName()+"\nComp hero is "+compHero.getName());
        return wariors;
    }*/
    private static Warior createWarior(int n){
        Warior warior;
        if(n==1){
            warior = new Archer(500);
            warior.setWeapon(new Arch());
        }
        else if(n==2){
            warior = new Swordsman(800);
            warior.setWeapon(new Sword());
        }
        else{
            warior = new Mag(1000);
            warior.setWeapon(new MagWeapon());
        }
        return warior;
    }
}
