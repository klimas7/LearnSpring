package pl.klimas7.learnSpring.xml;

import java.util.UUID;

/**
 * Created by bklimas on 18.02.16.
 */
public class HardWorker implements Worker {

    private String uuid;

    public HardWorker()
    {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        System.out.println("I'am hard worker nr: " + uuid);
    }
}
