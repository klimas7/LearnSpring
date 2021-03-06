package pl.klimas7.learnSpring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = "prototype")
public class LazyWorker implements Worker
{
    private String uuid;

    public LazyWorker()
    {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork()
    {
        System.out.println("I'am lazy worker nr: " + uuid);
    }
}
