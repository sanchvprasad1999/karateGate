package jobtest;

import com.intuit.karate.gatling.GatlingMavenJobConfig;
import com.intuit.karate.job.JobExecutor;
import com.intuit.karate.job.JobManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pthomas3
 */
public class GatlingRunner2 {

    public static void main(String[] args) {
        int executorCount = 4;
        GatlingMavenJobConfig config = new GatlingMavenJobConfig(executorCount, "test5", 8087);
        JobManager manager = new JobManager(config);

        manager.start();
        manager.waitForCompletion();
    }

}
