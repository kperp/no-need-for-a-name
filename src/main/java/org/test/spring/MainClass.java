package org.test.spring;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by IntelliJ IDEA.
 * User: perperidis
 * Date: 19.11.11
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    static Logger logger = Logger.getLogger(MainClass.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassWithFunctionality classWithFunctionality = (ClassWithFunctionality)context.getBean("classWithFunctionality");
        classWithFunctionality.logThisMethod();
    }
}
