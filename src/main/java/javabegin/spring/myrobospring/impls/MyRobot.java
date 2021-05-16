package javabegin.spring.myrobospring.impls;

import javabegin.spring.myrobospring.interfaces.Kiborg;
import javabegin.spring.myrobospring.interfaces.Processor;
import javabegin.spring.myrobospring.interfaces.Weapon;

public class MyRobot implements Kiborg {
    private Weapon weapon;
    private Processor proc;
    private String roboModel;

    public MyRobot() {
    }

    public MyRobot(Weapon weapon, Processor proc, String model) {
        this.weapon = weapon;
        this.proc = proc;
        this.roboModel = model;
    }

    @Override
    public void powerOn() {
        try {
            System.out.println("Starting diagnostic");
            System.out.println("Scanning processor...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(proc);
        System.out.println(weapon);
        System.out.println("****************** END STATUS ****************");
        System.out.println("All systems is on.\n" + roboModel + ": I'm ready to kill");
    }

    public void myInitMethod(){
        System.out.println("This is MyRobot init method");
    }

    public void myDestroyMethod(){
        System.out.println("this is MyRobot destroy method");
    }

    @Override
    public void fire() {
        System.out.println("FIRE!");
    }

    @Override
    public void powerOff() {
        System.out.println("System shutdown");
    }
}