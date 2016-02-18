package pl.klimas7.learnSpring.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("pl/klimas7/learnSpring/xml/config.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();

        HelloWorld helloWorldByConstructor = (HelloWorld) context.getBean("helloWorldByConstructor");
        helloWorldByConstructor.getMessage();

        //-----------
        Works works = (Works)context.getBean("works");
        works.doWork();
    }
}
