package failedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int maxTry = 0;
    //    int count = 0;
    ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 0);

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isNotRunning()){
            if (count.get() < maxTry) {
                count.set(count.get() + 1);
                return true;
            }
        }
        return false;
    }
}
