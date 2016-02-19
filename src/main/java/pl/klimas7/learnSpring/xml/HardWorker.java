package pl.klimas7.learnSpring.xml;

import java.util.UUID;

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
