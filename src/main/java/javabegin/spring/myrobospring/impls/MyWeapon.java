package javabegin.spring.myrobospring.impls;

import javabegin.spring.myrobospring.BaseModel;
import javabegin.spring.myrobospring.Colors;
import javabegin.spring.myrobospring.interfaces.Weapon;

public class MyWeapon extends BaseModel implements Weapon {
    private String weaponType;
    private int caliber;
    private Colors color;
    private int year;

    public MyWeapon() {
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyWeapon(String weaponType, int caliber) {
        this.weaponType = weaponType;
        this.caliber = caliber;
    }

    public void myInitMethod(){
        System.out.println("This is Weapon init method");
    }

    public void myDestroyMethod(){
        System.out.println("this is Weapon destroy method");
    }

    @Override
    public String weaponType() {
        return weaponType;
    }

    @Override
    public int caliber() {
        return caliber;
    }

    @Override
    public String toString() {
        System.out.println("****************** WEAPON INFO ****************");
        return "weaponType: " + weaponType + "\ncaliber: " + caliber + "\nColor: " + color + "\nYear: " + year;
    }

    @Override
    protected int abstractZavod() {
        return 1982;
    }
}