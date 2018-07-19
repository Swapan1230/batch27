package jrout.tutorial.batch27.spring.core.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringContextMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*ICompany company = (ICompany) factory.getBean("company");
        System.out.println(company.logoName());

        company = (ICompany) factory.getBean("company");
        System.out.println(company.logoName());*/
    }
}
