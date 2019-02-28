package threadPoolTest;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class UserThreadRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
        // TODO Auto-generated method stub
        System.out.println("task was rejected : " + executor.toString());
    }

}
