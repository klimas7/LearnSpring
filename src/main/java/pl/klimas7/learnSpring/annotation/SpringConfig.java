package pl.klimas7.learnSpring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig
{
    @Autowired
    private ApplicationContext ctx;

    @Bean
    public HelloWorld helloWorld()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "helloWorldByConstructor")
    public HelloWorld helloWorldByConstructor()
    {
        return new HelloWorld("Hello World By Constructor!");
    }

    @Bean
    public Worker bestWorker()
    {
        return (Worker) ctx.getBean("hardWorker");
    }

    @Bean
    public Worker hardWorkerOne()
    {
        return (Worker) ctx.getBean("hardWorker");
    }

    @Bean
    public Worker hardWorkerDwa()
    {
        return (Worker) ctx.getBean("hardWorker");
    }

    @Bean
    @Scope(value = "prototype")
    public Worker lazyWorkerOne()
    {
        return (Worker) ctx.getBean("lazyWorker");
    }

    @Bean
    public Worker lazyWorkerTwo()
    {
        return lazyWorkerOne();
    }

    @Bean
    public Worker lazyWorkerThree()
    {
        return null;
    }
}
