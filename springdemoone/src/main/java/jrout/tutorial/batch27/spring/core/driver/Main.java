package jrout.tutorial.batch27.spring.core.driver;

import jrout.tutorial.batch27.spring.core.ICompany;
import jrout.tutorial.batch27.spring.core.impl.HondaCompanyImpl;

public class Main {
    public static void main(String[] args) {
        ICompany company = new HondaCompanyImpl();
        System.out.println("The Company name i M tied up with is "+ company.logoName());

        company = new HondaCompanyImpl();
        System.out.println(company.sizeOfCompany() + " In Upper Case"+ company.logoName());
    }
}
