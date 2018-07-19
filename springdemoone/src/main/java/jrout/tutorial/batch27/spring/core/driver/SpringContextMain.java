package jrout.tutorial.batch27.spring.core.driver;

import jrout.tutorial.batch27.spring.core.ICompany;
import jrout.tutorial.batch27.spring.core.IMusic;
import jrout.tutorial.batch27.spring.core.impl.MarutiCompanyImpl;
import jrout.tutorial.batch27.spring.core.impl.MusicBoseImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringContextMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICompany company = context.getBean("company3",ICompany.class);
//        System.out.println(company.logoName());
//        company.musicSystem();
//        company.printName();
        company.printDetails();



    }
}
