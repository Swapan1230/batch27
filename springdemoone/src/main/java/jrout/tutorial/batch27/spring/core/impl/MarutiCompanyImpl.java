package jrout.tutorial.batch27.spring.core.impl;

import jrout.tutorial.batch27.spring.core.ICompany;
import jrout.tutorial.batch27.spring.core.IMusic;

import java.util.Date;

public class MarutiCompanyImpl implements ICompany {

    private IMusic musicSystem;
    private String name;
    private Date date;

    public MarutiCompanyImpl() {
        System.out.println("Constructor is invoked...");
    }

    public MarutiCompanyImpl(IMusic musicSystem , String name , Date date) {
        this.musicSystem = musicSystem;
        this.name = name;
        this.date = date;
    }

    public int sizeOfCompany() {
        return 1000;
    }

    public String logoName() {
        return "Maruti";
    }

    public void musicSystem() {
        musicSystem.musicCompanyName();
    }

    public void setMusicSystem(IMusic musicSystem){
        this.musicSystem = musicSystem;
    }

    public void printName() {
        System.out.println("Name is :"+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void printDetails(){
        System.out.println("Company Name is "+ name +"\n"
        + "Date Created is "+ date);
        musicSystem.musicCompanyName();
        System.out.println("Logo Name "+ logoName());
    }
}
