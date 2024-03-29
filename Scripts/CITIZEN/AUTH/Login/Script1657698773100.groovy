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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/login btn'))

WebUI.verifyElementVisible(findTestObject('CITIZEN/Page_Login  GetVaccine/VerifyLoginPage'))

WebUI.setText(findTestObject('CITIZEN/Page_Login  GetVaccine/input_NIK_basic_nik'), '7890789078907890')

WebUI.setText(findTestObject('CITIZEN/Page_Login  GetVaccine/input_Password_basic_password'), 'Haechan123')

WebUI.click(findTestObject('CITIZEN/Page_Login  GetVaccine/eye'))

WebUI.click(findTestObject('CITIZEN/Page_Login  GetVaccine/button_Login'))

WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Home  GetVaccine/navbar'), 0, FailureHandling.STOP_ON_FAILURE)

