package com.company.section9.savable;

import java.util.ArrayList;
import java.util.List;

public class Game implements ISaveable {
    private String playerName;
    private int power;
    private int damage;
    private String weapon;

    public Game(String playerName, int power, int damage, String weapon){
        this.playerName = playerName;
        this.power = power;
        this.damage = damage;
        this.weapon = weapon;
    }
    public Game(){
        this("guest", 50,50,"sword");
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerName='" + playerName + '\'' +
                ", power=" + power +
                ", damage=" + damage +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<String>();
        value.add(0,playerName);
        value.add(1,""+power);
        value.add(2,""+damage);
        value.add(3, weapon);
        return value;
    }

    @Override
    public void read(List<String> saveAble) {
        if(saveAble.size()>0 && saveAble!=null) {
            playerName = saveAble.get(0);
            power = Integer.parseInt(saveAble.get(1));
            damage = Integer.parseInt(saveAble.get(2));
            weapon = saveAble.get(3);
            System.out.println(playerName + " " + power + " " + damage + " " + " " + weapon);
        }
    }
}
