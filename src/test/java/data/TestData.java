/**
 * 
 */
package data;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import config.TestSetup;
import reusablecomponents.Utilities;

/**
 * This class is designed to return test data for each test, wherever required.
 * 
 * @author jkhanuja
 */
public class TestData {

	@DataProvider(name = "testMyPaymentLoggedInUser")
	public static Object[][] testMyPaymentLoggedInUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testMyPaymentLoggedInUser");
	}

	@DataProvider(name = "testSubmitRequestForLoggedInUser")
	public static Object[][] testSubmitRequestForLoggedInUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testSubmitRequestForLoggedUser");
	}

	@DataProvider(name = "testPaymentFromBillingOverview")
	public static Object[][] testPaymentFromBillingOverview() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testPaymentFromBillingOverview");
	}

	@DataProvider(name = "testredirectionFromHomePage")
	public static Object[][] redirectionFromHomePage() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testredirectionFromHomePage");
	}

	@DataProvider(name = "testOurSrvcsShwMeRedirection")
	public static Object[][] testOurSrvcsShwMeRedirection() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testOurSrvcsShwMeRedirection");
	}

	@DataProvider(name = "testpurchaseProductFromHomePage")
	public static Object[][] testOurServcsReqQuoteBuyProd() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testOurServcsReqQuoteBuyProd");
	}
	
	@DataProvider(name = "E2E_OurServcsResidentialBuyProd")
	public static Object[][] testOurServcsResidentialBuyProd() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "OurServRequestResidential");
	}
	
	
	@DataProvider(name = "US_E2E_OurServcsReqQuoteBuyProd")
	public static Object[][] US_testOurServcsReqQuoteBuyProd() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "US_E2E_OurServcsBuyReqQuote");
	}
	
	@DataProvider(name = "US_E2E_OurServcsBuyProd")
	public static Object[][] US_testOurServcsBuyProd() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "US_testOurServcsBuyProdE2E");
	}

	@DataProvider(name = "API")
	public static Object[][] TestBusiness() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "API");
	}

	@DataProvider(name = "testMyWMServicesLocateService")
	public static Object[][] testMyWMServicesLocateService() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testMyWMServicesLocateService");
	}

	@DataProvider(name = "testMyWMServicesRequestSubmit")
	public static Object[][] testMyWMServicesRequestSubmit() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testMyWMServicesRequestSubmit");
	}

	@DataProvider(name = "testMyWMServicesRollOffTickets")
	public static Object[][] testMyWMServicesRollOffTickets() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testMyWMServicesRollOffTickets");
	}

	@DataProvider(name = "testUnAuthorizedFlow")
	public static Object[][] testUnAuthorizedFlow() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testUnAuthorizedFlow");
	}

	@DataProvider(name = "testDropofflocation")
	public static Object[][] testDropofflocation() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "testDropofflocation");
	}

	@DataProvider(name = "Homepage")
	public static Object[][] Homepage() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "HomePage");
	}

	@DataProvider(name = "CustomerSupport")
	public static Object[][] Customersupport() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testDataLocation, "CustomerSupport");

	}

	@DataProvider(name = "testCustomerSearch")
	public static Object[][] testCustomerSearch() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testCustomerSearch");
	}

	@DataProvider(name = "testCustomerVerification")
	public static Object[][] testCustomerVerification() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testCustomerVerification");
	}

	@DataProvider(name = "testCustomerServices")
	public static Object[][] testCustomerServices() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testCustomerServices");
	}

	@DataProvider(name = "testPickUpInfo")
	public static Object[][] testPickUpInfo() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testPickUpInfo");
	}

	@DataProvider(name = "testAvailableRollOffDates")
	public static Object[][] testAvailableRollOffDates() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testAvailableRollOffDates");
	}

	@DataProvider(name = "testRollOffTickets")
	public static Object[][] testRollOffTickets() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testRollOffTickets");
	}

	@DataProvider(name = "testRollOffTicketDetails")
	public static Object[][] testRollOffTicketDetails() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testRollOffTicketDetails");
	}

	@DataProvider(name = "testCreateRollOffTicket")
	public static Object[][] testCreateRollOffTicket() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testCreateRollOffTicket");
	}

	@DataProvider(name = "testVoidRollOffTicket")
	public static Object[][] testVoidRollOffTicket() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testVoidRollOffTicket");
	}

	@DataProvider(name = "testUpdateRollOffTicket")
	public static Object[][] testUpdateRollOffTicket() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testUpdateRollOffTicket");
	}

	@DataProvider(name = "testsubmitCustomerSupportForm")
	public static Object[][] submitCustomerSupportForm() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testsubmitCustomerSupportForm");

	}

	@DataProvider(name = "testMakePayment")
	public static Object[][] testMakePayment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testMakePayment");
	}
	
	
	@DataProvider(name = "testIVRPayments")
	public static Object[][] testIVRPayments() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testIVRPayments");
	}

	@DataProvider(name = "testcontactpreference")
	public static Object[][] testcontactpreference() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testcontactpreference");
	}

	@DataProvider(name = "testchat")
	public static Object[][] testchat() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testchat");
	}

	@DataProvider(name = "testholiday")
	public static Object[][] testholiday() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testholiday");
	}

	@DataProvider(name = "testclosestfacility")
	public static Object[][] testclosestfacility() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testclosestfacility");
	}

	@DataProvider(name = "testbalance")
	public static Object[][] testbalance() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testbalance");
	}

	@DataProvider(name = "testprocessCybsAuthResponse")
	public static Object[][] testprocessCybsAuthResponse() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testprocessCybsAuthResponse");
	}

	@DataProvider(name = "testgenerateCybsSignature")
	public static Object[][] testgenerateCybsSignature() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testgenerateCybsSignature");
	}

	@DataProvider(name = "testprocessSalesRequest")
	public static Object[][] testprocessSalesRequest() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testprocessSalesRequest");
	}

	@DataProvider(name = "verifyCustomerForpayment")
	public static Object[][] verifyCustomerForpayment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "verifyCustomerForpayment");
	}

	@DataProvider(name = "testvalidateContactTypeContents")
	public static Object[][] validateContactTypeContents() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testvalidateContactTypeContents");
	}

	@DataProvider(name = "paymentDefaultContents")
	public static Object[][] paymentDefaultContents() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "paymentDefaultContents");
	}

	@DataProvider(name = "validateHomePageDefaultContent")
	public static Object[][] validateHomePageDefaultContent() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "validateHomePageDefaultContent");
	}

	@DataProvider(name = "testLogin")
	public static Object[][] testlogin() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testLogin");
	}

	@DataProvider(name = "testForgotMyPassword")
	public static Object[][] testForgotMyPassword() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testForgotMyPassword");
	}

	@DataProvider(name = "signup")
	public static Object[][] signup() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testRegistration");
	}

	@DataProvider(name = "testLinkAccounts")
	public static Object[][] linkAccounts() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testLinkAccounts");
	}

	@DataProvider(name = "linkAccountDefaultContents")
	public static Object[][] linkAccountDefaultContents() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "linkAccountDefaultContents");
	}

	@DataProvider(name = "unlinkAccount")
	public static Object[][] unlinkAccount() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "unlinkAccount");
	}

	@DataProvider(name = "updateProfile")
	public static Object[][] updateProfile() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "updateProfile");
	}

	@DataProvider(name = "testMyWMDashboard")
	public static Object[][] testMyWMDashboard() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testMyWMDashboard");
	}

	@DataProvider(name = "testCreatUser")
	public static Object[][] testCreatUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testCreatUser");
	}

	@DataProvider(name = "testActivateUser")
	public static Object[][] testActivateUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testActivateUser");
	}

	@DataProvider(name = "testSendVerificationEmail")
	public static Object[][] testSendVerificationEmail() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testSendVerificationEmail");
	}

	@DataProvider(name = "testForgotPassword")
	public static Object[][] testForgotPassword() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testForgotPassword");
	}

	@DataProvider(name = "testSetPassword")
	public static Object[][] testSetPassword() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testSetPassword");
	}

	@DataProvider(name = "testUpdateProfile")
	public static Object[][] testUpdateProfile() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateProfile");
	}

	@DataProvider(name = "testUpdateLogin")
	public static Object[][] testUpdateLogin() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateLogin");
	}

	@DataProvider(name = "testUnlinkCustomerAccount")
	public static Object[][] testUnlinkCustomerAccount() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUnlinkCustomerAccount");
	}

	@DataProvider(name = "testGetLinkedAccount")
	public static Object[][] testGetLinkedAccount() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetLinkedAccount");
	}

	@DataProvider(name = "testlinkAccount")
	public static Object[][] testlinkAccount() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testlinkAccount");
	}

	@DataProvider(name = "testUpdateAccount")
	public static Object[][] testUpdateAccount() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateAccount");
	}

	@DataProvider(name = "testGetLinkedUser")
	public static Object[][] testGetLinkedUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetLinkedUser");
	}

	@DataProvider(name = "testGetEntitlements")
	public static Object[][] testGetEntitlements() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetEntitlements");
	}

	@DataProvider(name = "testInsertEntitle")
	public static Object[][] testInsertEntitle() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testInsertEntitle");
	}

	@DataProvider(name = "testUserDetails")
	public static Object[][] testUserDetails() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUserDetails");
	}

	@DataProvider(name = "testCCI")
	public static Object[][] testCCI() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testCCI");
	}

	@DataProvider(name = "testGetPaymentMethod")
	public static Object[][] testGetPaymentMethod() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetPaymentMethod");
	}
	
	@DataProvider(name = "testGetPaymentMethodForEcom")
	public static Object[][] testGetPaymentMethodForEcom() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetPaymentMethod");
	}
	

	@DataProvider(name = "testSavePaymentMethod")
	public static Object[][] testSavePaymentMethod() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testSavePaymentMethod");
	}

	@DataProvider(name = "testUpdatePaymentMethod")
	public static Object[][] testUpdatePaymentMethod() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdatePaymentMethod");
	}

	@DataProvider(name = "testInvoice")
	public static Object[][] testInvoice() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testInvoice");
	}

	@DataProvider(name = "testDeletePaymentMethod")
	public static Object[][] testDeletePaymentMethod() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testDeletePaymentMethod");
	}

	@DataProvider(name = "testRevokeToken")
	public static Object[][] testRevokeToken() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testRevokeToken");
	}
	
	@DataProvider(name = "testSalesMultiRequest")
	public static Object[][] testSalesMultiRequest() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testSalesMultiRequest");
	}
	
	@DataProvider(name = "testeCommUpdateCustomerStatus")
	public static Object[][] testeCommUpdateCustomerStatus() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testeCommUpdateCustomerStatus");
	}
	
	@DataProvider(name = "testProductURL")
	public static Object[][] testProductURL() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testProductURL");
	}
	
	
	@DataProvider(name = "testRollOffForLoggedInUser")
	public static Object[][] testRollOffForLoggedInUser() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testRollOffForLoggedInUser");
	}
	
	@DataProvider(name = "testeCommRedirectURL")
	public static Object[][] testeCommRedirectURL() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testeCommRedirectURL");
	}
	
	@DataProvider(name = "testMasCustomerCreation")
	public static Object[][] testMasCustomerCreation() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testMasCustomerCreation");
	}
	
	@DataProvider(name = "testSavePaymentMethodECOM")
	public static Object[][] testSavePaymentMethodECOM() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testSavePaymentMethodECOM");
	}
	
	@DataProvider(name = "testRTPInegration")
	public static Object[][] testRTPInegration() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testRTPInegration");
	}
	
	@DataProvider(name = "testCommunicationpreferences")
	public static Object[][] testCommunicationpreferences() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testCommunicationpreferences");
	}
	
	@DataProvider(name = "testCommunicationCategories")
	public static Object[][] testCommunicationCategories() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testCommunicationCategories");
	}
	
	@DataProvider(name = "testUpdateCommunicationPref")
	public static Object[][] testUpdateCommunicationPref() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateCommunicationPref");
	}
	
	@DataProvider(name = "testGetContactInfo")
	public static Object[][] testGetContactInfo() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testGetContactInfo");
	}
	
	@DataProvider(name = "testUpdateContactInfo")
	public static Object[][] testUpdateContactInfo() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateContactInfo");
	}
	
	@DataProvider(name = "testcreateSchedulePayment")
	public static Object[][] testcreateSchedulePayment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testcreateSchedulePayment");
	}
	
	@DataProvider(name = "testdeleteSchedulePayment")
	public static Object[][] testdeleteSchedulePayment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testdeleteSchedulePayment");
	}
	
	@DataProvider(name = "testgetSchedulePayment")
	public static Object[][] testgetSchedulePayment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testgetSchedulePayment");
	}
	
	@DataProvider(name = "testPaperlessEnrollment")
	public static Object[][] testPaperlessEnrollment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testPaperlessEnrollment");
	}
	
	@DataProvider(name = "testAutoPayEnrollment")
	public static Object[][] testAutoPayEnrollment() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testAutoPayEnrollment");
	}
	
	@DataProvider(name = "testenrollAutopay")
	public static Object[][] testenrollAutopay() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testenrollAutopay");
	}
	
	@DataProvider(name = "testgetAutopay")
	public static Object[][] testgetAutopay() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testgetAutopay");
	}
	
	@DataProvider(name = "testUpdateAutopay")
	public static Object[][] testUpdateAutopay() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUpdateAutopay");
	}
	
	@DataProvider(name = "testUnenrollAutopay")
	public static Object[][] testUnenrollAutopay() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testUnenrollAutopay");
	}
	
	@DataProvider(name = "testEnrollPaperless")
	public static Object[][] testEnrollPaperless() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testEnrollPaperless");
	}
	
	@DataProvider(name = "testPayments")
	public static Object[][] testPayments() throws FileNotFoundException, IOException{
		return Utilities.Read_Excel(Utilities.getProperty("PAYMENTS_LOCATION"), "TestMakePayment");
	}
	
	@DataProvider(name = "US_specFilters_ProductList")
	public static Object[][] US_specFilters_ProductList() throws FileNotFoundException, IOException{
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "US_specFilters_ProductList");
	}
	
	@DataProvider(name = "testOktaUserRegistration")
	public static Object[][] testOktaUserRegistration() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testOktaUserRegistration");
	}
	
	@DataProvider(name = "testMellisacheck")
	public static Object[][] testMellisacheck() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("API-TEST-DATA"), "testMellisacheck");
	}
	
	@DataProvider(name = "testrequestformFromHomepage")
	public static Object[][] testrequestformFromHomepage() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(Utilities.getProperty("TEST_DATA_LOCATION"), "testrequestformFromHomepage");
	}
	
	
	@DataProvider(name = "testChangePassword")
	public static Object[][] testChangePassword() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testchangepassword");
	}
	
	@DataProvider(name = "testBulkPickup_requestservice")
	public static Object[][] testBulkPickup() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testbulkpickupreq");
	}
	
	
	@DataProvider(name = "testExtra&Repair_requestservice")
	public static Object[][] testExtraRepairPickup() throws FileNotFoundException, IOException {
		return Utilities.Read_Excel(TestSetup.testAPILocation, "testextrarepair");
	}
	
	
	
	
}
