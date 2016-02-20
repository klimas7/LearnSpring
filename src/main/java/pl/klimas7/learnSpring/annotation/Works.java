package pl.klimas7.learnSpring.annotation;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Works
{
    @Resource
    //@Qualifier()
    private Worker bestWorker;

    @Autowired
    @Qualifier("lazyWorker")
    private Worker theMostLazyWorker;

    @Resource
    private Collection<Worker> workers;

    //or That
    /*
    @Resource
    public void setWorkers(Collection<Worker> workers)
    {
        this.workers = workers;
    }
    */

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
