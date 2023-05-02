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

//Open cermati gabung page
CustomKeywords.'com.cermati.q4.BrowserUtility.openURL'(GlobalVariable.cermatiGabung_Page)
WebUI.delay(2)
CustomKeywords.'com.cermati.q4.BrowserUtility.Screenshot'()

//Input Email
WebUI.setText(findTestObject('gabung-page/txt/email_input'), email)

//Input mobilePhone
WebUI.setText(findTestObject('gabung-page/txt/mobilePhone_input'), mobilePhone)

//Input Password
WebUI.setText(findTestObject('gabung-page/txt/password_input'), password)

//Input confirmPassword
WebUI.setText(findTestObject('gabung-page/txt/confirmPassword_input'), confirmPassword)

//Input firstName
WebUI.setText(findTestObject('gabung-page/txt/firstName_input'), firstName)

//Input lastName
WebUI.setText(findTestObject('gabung-page/txt/lastName_input'), lastName)

//Input cityAndProvince
WebUI.setText(findTestObject('gabung-page/txt/cityAndProvince_input'), cityAndProvince)

//Check if TnC already check or not
boolean tncChecker = WebUI.verifyElementNotPresent(findTestObject('gabung-page/txt/tncChecker_txt'), 0)
boolean tncCheckbox = WebUI.verifyElementChecked(findTestObject('Object Repository/gabung-page/btn/tnc_checkbox'), 0)

	if(tncChecker == true && tncCheckbox == false) {
		CustomKeywords.'com.cermati.q4.BrowserUtility.clickButton'(findTestObject('gabung-page/btn/tnc_checkbox'), 
			FailureHandling.STOP_ON_FAILURE, 
			'Click TnC Checkbox')
	}

WebUI.delay(2)
CustomKeywords.'com.cermati.q4.BrowserUtility.Screenshot'()
	
//Click Daftar Button
CustomKeywords.'com.cermati.q4.BrowserUtility.clickButton'(findTestObject('gabung-page/btn/daftar_btn'), 
	FailureHandling.STOP_ON_FAILURE, 
	'Click Daftar Button')