package pl.klimas7.learnSpring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "helloWorld")
    public HelloWorld helloWorld()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "helloWorldByConstructor")
    public HelloWorld helloWorldByConstructor()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World By Constructor!");
        return helloWorld;
    }
}
