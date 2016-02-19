package pl.klimas7.learnSpring.xml;

import java.util.Collection;
import java.util.Objects;


public class Works {
    private Collection<Worker> workers;

    public void setWorkers(Collection<Worker> workers) {
        this.workers = workers;
    }

    public void doWork()
    {
        workers.stream().filter(Objects::nonNull).forEach(worker -> worker.doWork());
    }
}
