package pl.klimas7.learnSpring.xml;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;


public class Works {

    private Worker bestWorker;

    private Worker theMostLazyWorker;

    private Collection<Worker> workers;

    public void setWorkers(Collection<Worker> workers) {
        this.workers = workers;
    }

    public void setBestWorker(Worker bestWorker)
    {
        this.bestWorker = bestWorker;
    }

    public void setTheMostLazyWorker(Worker theMostLazyWorker) {
        this.theMostLazyWorker = theMostLazyWorker;
    }

    public void doWork()
    {
        workers.stream().filter(Objects::nonNull).forEach(worker -> worker.doWork());
        System.out.println("The Best Worker");
        bestWorker.doWork();
        Optional<Worker> lazyWorker = Optional.ofNullable(theMostLazyWorker);
        if (lazyWorker.isPresent())
        {
            System.out.println("The Most Lazy Worker");
            lazyWorker.get().doWork();
        }
    }
}
