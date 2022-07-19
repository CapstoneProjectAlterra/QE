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

WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Home  GetVaccine/a_Login'))

WebUI.setText(findTestObject('Object Repository/CITIZEN/Page_Login  GetVaccine/input_NIK_basic_nik'), '7890789078907890')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Login  GetVaccine/span_Password_ant-input-affix-wrapper ant-i_00fee4'))

WebUI.setEncryptedText(findTestObject('Object Repository/CITIZEN/Page_Login  GetVaccine/input_Password_basic_password'), 
    'PQJDJK8wP4fiH7AdcBx/sA==')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Home  GetVaccine/a_Tiket'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Tiket Vaksin  GetVaccine/h1_Tiket'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Tiket Vaksin  GetVaccine/svg_Tiket_ant-dropdown-trigger ant-dropdown_754753'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Tiket Vaksin  GetVaccine/span_Logout'))

WebUI.closeBrowser()

