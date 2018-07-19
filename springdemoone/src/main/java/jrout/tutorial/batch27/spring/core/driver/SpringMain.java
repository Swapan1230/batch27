package jrout.tutorial.batch27.spring.core.driver;

import jrout.tutorial.batch27.spring.core.ICompany;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMain {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);


        ICompany company = (ICompany) factory.getBean("company");
        /*System.out.println(company.logoName());

        company = (ICompany) factory.getBean("company");
        System.out.println(company.logoName());*/
    }
}
