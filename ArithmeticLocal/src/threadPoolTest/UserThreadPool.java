package threadPoolTest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class UserThreadPool {
    public static void main(String[] args) {
        BlockingQueue queue = new LinkedBlockingDeque(2);
        UserThreadFractory f1 = new UserThreadFractory("number1");
        UserThreadFractory f2 = new UserThreadFractory("number2");
        
        UserThreadRejectHandler handler = new UserThreadRejectHandler();
        ThreadPoolExecutor threadPoolNo1 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, queue, f1, handler);
        ThreadPoolExecutor threadPoolNo2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, queue, f2, handler);
        Runnable task = new Task();
        for(int i = 0; i < 200; i++) {
            threadPoolNo1.execute(task);
            threadPoolNo2.execute(task);
        }
    }
}
