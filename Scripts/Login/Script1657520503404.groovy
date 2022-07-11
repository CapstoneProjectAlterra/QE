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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_Home  GetVaccine/a_Daftar Vaksinasi'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/h2_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/h2_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login  GetVaccine/input_NIK_basic_nik'), '1234A')

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/div_Input harus berupa angka'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  GetVaccine/input_Password_basic_password'), 'Hm4npEewbtg=')

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/button_Login'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_Home  GetVaccine/a_Daftar Vaksinasi'))

WebUI.setText(findTestObject('Object Repository/Page_Login  GetVaccine/input_NIK_basic_nik'), '123455')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  GetVaccine/input_Password_basic_password'), 'u8txYEKwIjY=')

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/div_NIK atau Password Salah'))

WebUI.click(findTestObject('Object Repository/Page_Login  GetVaccine/div_NIK atau Password Salah'))

