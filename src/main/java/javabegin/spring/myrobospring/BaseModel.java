package javabegin.spring.myrobospring;

import javabegin.spring.myrobospring.interfaces.Weapon;

public abstract class BaseModel implements Weapon {
    public BaseModel() {
        System.out.println("CONSTRUCTOR BaseModel");
    }

    protected abstract int abstractZavod();
}