package jrout.tutorial.batch27.spring.core.impl;

import jrout.tutorial.batch27.spring.core.ICompany;
import jrout.tutorial.batch27.spring.core.IMusic;

public class HondaCompanyImpl implements ICompany {
    String name;
    private IMusic musicSystem;

    public int sizeOfCompany() {
        return 200;
    }

    public String logoName() {
        return "HONDA";
    }

    public void musicSystem() {
        musicSystem.musicCompanyName();
    }

    public void printName() {
        System.out.println("Name is :"+ name);
    }

    public void printDetails() {
        System.out.println("Company Name is "+ name);
        musicSystem.musicCompanyName();
    }
}
