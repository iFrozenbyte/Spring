package javabegin.spring.myrobospring;

import javabegin.spring.myrobospring.interfaces.Kiborg;
import javabegin.spring.myrobospring.interfaces.RoboConveyor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("MyAppContext.xml");
        RoboConveyor roboConveyor = (RoboConveyor) context.getBean("beanRoboConveyor");

        Kiborg myRobotOne   = roboConveyor.createKiborg();
        Kiborg myRobotTwo   = roboConveyor.createKiborg();
        Kiborg myRobotThree = roboConveyor.createKiborg();

        System.out.println("terminator1 " + myRobotOne);
        System.out.println("terminator2 " + myRobotTwo);
        System.out.println("terminator3 " + myRobotThree);

        ((ConfigurableApplicationContext)context).close();
        //MyRobot ownRobot = (MyRobot) context.getBean("myRobot");
//        ownRobot.powerOn();
//        ownRobot.fire();
//        ownRobot.powerOff();
    }
}