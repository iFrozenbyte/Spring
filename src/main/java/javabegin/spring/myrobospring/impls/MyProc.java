package javabegin.spring.myrobospring.impls;

import javabegin.spring.myrobospring.interfaces.Processor;

public class MyProc implements Processor {
    private int cores;
    private String firm;

    public MyProc() {
        System.out.println("simple PARENT constructor ");
    }

    public MyProc(int cores, String firm) {
        this.cores = cores;
        this.firm = firm;
    }

    @Override
    public int power() {
        if (firm.equalsIgnoreCase("AMD")) return 1500;
        return 2000;
    }

    @Override
    public String toString() {
        System.out.println("****************** PROCESSOR INFO ****************");
        return "Cores: " + cores + "\nfirm: " + firm + " " + power() + " MHz";
    }

    public void myInitMethod(){
        System.out.println("This is PROC init method");
    }

    public void myDestroyMethod(){
        System.out.println("this is PROC destroy method");
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}