package pl.klimas7.learnSpring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("pl.klimas7.learnSpring.annotation");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();

        HelloWorld helloWorldByConstructor = (HelloWorld) context.getBean("helloWorldByConstructor");
        helloWorldByConstructor.getMessage();


    }


}
