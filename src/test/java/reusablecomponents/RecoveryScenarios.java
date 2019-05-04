package reusablecomponents;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import config.TestSetup;

public class RecoveryScenarios extends TestSetup implements ITestListener,IInvokedMethodListener, ITest
{
//	static //logger //log = //logger.get//logger(RecoveryScenarios.class.getName());
	
	private String testInstanceName = "";
	
	private int invokeRecovery(String errorMessage){
		int status=2;
	//	//log.info("In invokeRecovery: "+errorMessage);
		if(isAlertPresent())
		{
			try {
				acceptAlert();
				status=1;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		return status;
	}
	
	
	public void onStart(ITestContext context) {
		////log.info(context.getName()+" Test Suite Execution Started");
		
	}
	
	public void onTestStart(ITestResult result) {
		
		////log.info("Test : " + result.getName() + " execution Started");
	}

	
	public void onTestSuccess(ITestResult result) {
		
		////log.info("Test : " + result.getName() + " PASSED");
	}

	
	public void onTestFailure(ITestResult result) {
		
		result.setStatus(invokeRecovery(result.getThrowable().getMessage()));
	
//		//log.info("Test : " + result.getName() + " "+result.getStatus());
	}

	
	public void onTestSkipped(ITestResult result) {
		
		//log.info("Test : " + result.getName() + " SKIPPED");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	

	
	public void onFinish(ITestContext context) {
		
		//log.info(context.getName()+" Test Suite Execution Completed");
	}

	
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		//log.info("Before invocation of "+ method.getTestMethod().getMethodName());
		
	}

	
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		//log.info("After invocation of "+ method.getTestMethod().getMethodName());
		
	}

		 
	 public void setTestName(String anInstanceName) {
	  testInstanceName = anInstanceName;
	 }
	
	 public String getTestName() {
	  return testInstanceName;
	 }
	/*
	public void onConfigurationSuccess(ITestResult itr) {
		
		
	}

	
	public void onConfigurationFailure(ITestResult itr) {
		
		
	}

	
	public void onConfigurationSkip(ITestResult itr) {
		
		
	}

	
	public void beforeConfiguration(ITestResult tr) {
		
		
	}*/

	 public static boolean isAlertPresent() {
			try {
				driver.switchTo().alert().getText();
			} catch (Exception e) {
				return false;
			}
			return true;
		}
	 
	public static void switchFocus() throws Exception {
			driver.switchTo().defaultContent();
		}

		public static void switchAlert() throws Exception {
			try {
				driver.switchTo().alert();
			} catch (Exception e) {
				throw new Exception("No Alert Present");
			}
		}

		public static void acceptAlert() throws Exception {
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				throw new Exception("No Alert Present");
			}
		}

		public static boolean acceptAlertknown(String text) throws Exception {

			try {
				if (text.equals(driver.switchTo().alert().getText())) {
					driver.switchTo().alert().accept();
				}

			} catch (Exception e) {
				throw new Exception("No Alert Present");
			}
			return false;
		}
		public static void cancelAlert() throws Exception {

			try {

				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				throw new Exception("No Alert Present");
			}
		}
		public static String getAlertText() throws Exception {
			String text;
			try {

				text = driver.switchTo().alert().getText();
			} catch (Exception e) {
				throw new Exception("No Alert Present");
			}
			return text;
		}
}