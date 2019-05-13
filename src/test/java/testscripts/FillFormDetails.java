package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import reusablecomponents.BusinessComponents;
import reusablecomponents.Utilities;

public class FillFormDetails extends BusinessComponents {

	@Test(dataProvider = "test", dataProviderClass = data.TestData.class)
	public void testFormDetails(String particular1, String figure1, String particular2, String figure2,
			String documentType) {
		try {
			navigatetoUrl("https://udin.icai.org/?mode=login");
			enterLoginDetails("421192", "308Shamtower@");
			verifyRedirection("udin form");
			enterUDINDetails(particular1, figure1, particular2, figure2, documentType);
			verifyRedirection("udin confirmation");
			Utilities.Write_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "Test", 1,5, getConfirmationNumber());
			infoBox("Confimation Number generated-"+getConfirmationNumber(), "Info From UDIN");
			
		} catch (Exception e) {

			logger.log(LogStatus.FAIL, e.getClass() + e.getMessage() + logger.addScreenCapture(screenshot(driver)));
			assertTrue(false);
		}

		/*
		 * 421192 308Shamtower@
		 */
	}

}
