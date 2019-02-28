package threadPoolTest;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class UserThreadFractory implements ThreadFactory {
    
    private final String namePrefix;
    private final AtomicInteger nextId = new AtomicInteger(1);
    
    UserThreadFractory(String whatFeatureOfGroup){
        namePrefix = "UserThreadFactorys" + whatFeatureOfGroup + "-Worker-";
    }
    @Override
    public Thread newThread(Runnable task) {
        // TODO Auto-generated method stub
        String name = namePrefix + nextId.getAndIncrement();
        Thread thread = new Thread(null, task, name, 0, false);
        System.out.println(thread.getName());
        return thread;
    }

}
class Task implements Runnable{
    
    private final AtomicLong count = new AtomicLong(0L);
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("runnable" + count.getAndIncrement());
    }
    
}