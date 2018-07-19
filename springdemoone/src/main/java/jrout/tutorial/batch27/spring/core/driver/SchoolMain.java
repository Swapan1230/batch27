package jrout.tutorial.batch27.spring.core.driver;

import jrout.tutorial.batch27.spring.core.ICompany;
import jrout.tutorial.batch27.spring.core.impl.HondaCompanyImpl;
import jrout.tutorial.batch27.spring.core.impl.MarutiCompanyImpl;

public class SchoolMain {
    public static void main(String[] args) {
        ICompany company = new MarutiCompanyImpl();
        System.out.println(company.logoName());


        company = new MarutiCompanyImpl();
        System.out.println(company.logoName());
    }
}
