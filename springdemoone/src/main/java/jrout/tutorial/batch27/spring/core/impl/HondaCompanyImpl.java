package jrout.tutorial.batch27.spring.core.impl;

import jrout.tutorial.batch27.spring.core.ICompany;

public class HondaCompanyImpl implements ICompany {
    String name;

    public int sizeOfCompany() {
        return 200;
    }

    public String logoName() {
        return "HONDA";
    }
}
