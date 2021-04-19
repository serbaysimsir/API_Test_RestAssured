package helperMethods;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;		
public class ListenerTest implements ITestListener						
{		
    public void onTestStart(ITestResult iTestResult) {
     	Log.info("Test Case is Starting: " + iTestResult.getName());
    }
    public void onTestSuccess(ITestResult iTestResult) {
    	Log.info("Test Case Successful: " + iTestResult.getName());
    }
    public void onTestFailure(ITestResult iTestResult) {
    	Log.error("Test Case Failed: " + iTestResult.getName() + " " + iTestResult.getThrowable().getMessage());
    }
    public void onTestSkipped(ITestResult iTestResult) {
    	Log.warn("Test Case Skipped: " + iTestResult.getName() + " " + iTestResult.getThrowable().getMessage());
    }
    public void onStart(ITestContext iTestContext) {
    	Log.info("Test Started.");
    }
    public void onFinish(ITestContext iTestContext) {
    	Log.info("Test Finished.");
    }
}