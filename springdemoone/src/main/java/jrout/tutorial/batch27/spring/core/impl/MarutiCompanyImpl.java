package jrout.tutorial.batch27.spring.core.impl;

import jrout.tutorial.batch27.spring.core.ICompany;

public class MarutiCompanyImpl implements ICompany {

    public MarutiCompanyImpl() {
        System.out.println("Constructor is invoked...");
    }
    public int sizeOfCompany() {
        return 1000;
    }

    public String logoName() {
        return "Maruti";
    }


}
