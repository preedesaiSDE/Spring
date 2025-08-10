package org.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 
{

    @Autowired
    @Qualifier("airtelBean")
    private Sim sim;

    public void useSim() {
        sim.calling();
        sim.data();
    }

    public static void main( String[] args )
    {
        //manual depenedency injection
        /*Sim sim = new Jio();

        sim.calling();
        sim.data();*/

        //dependency injection using beans.xml
        //in the below line its not able to find beans.xml, fix it by providing the correct path
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Sim sim = applicationContext.getBean("sim",Sim.class);

        sim.calling();
        sim.data(); */

        //dependency injection based on java configuration
        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Sim sim = applicationContext.getBean("sim",Sim.class);

        sim.calling();
        sim.data();*/

        //dependency injection using component scan
        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = applicationContext.getBean(App.class);
        app.useSim();*/

        //creating object in a spring container
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Student student = beanFactory.getBean("student", Student.class);
        System.out.println(student);

    }
}
