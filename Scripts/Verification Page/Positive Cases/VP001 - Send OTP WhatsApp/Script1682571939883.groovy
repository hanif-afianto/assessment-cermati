import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Call Test Case GP001 - Registration Test
WebUI.callTestCase(findTestCase('Gabung Page/Positive Cases/GP001 - Registration'), [('email') : xemail, 
	('mobilePhone') : xmobilePhone, ('password') : xpassword, ('confirmPassword') : xconfirmPassword,
	('firstName') : xfirstName, ('lastName') : xlastName, ('cityAndProvince') : xcityAndProvince], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)
CustomKeywords.'com.cermati.q4.BrowserUtility.Screenshot'()


//Click Kirim via WhatsApp Button
CustomKeywords.'com.cermati.q4.BrowserUtility.clickButton'(findTestObject('verification-page/btn/sendWhatsApp_btn'), FailureHandling.STOP_ON_FAILURE, 'Click Kirim via WhatsApp Button')

WebUI.delay(2)
CustomKeywords.'com.cermati.q4.BrowserUtility.Screenshot'()

//Verify OTP Terkirim
WebUI.verifyElementPresent(findTestObject('verification-page/txt/otpTerkirim_txt'), 20, FailureHandling.STOP_ON_FAILURE)

//Close Browser
WebUI.closeBrowser()