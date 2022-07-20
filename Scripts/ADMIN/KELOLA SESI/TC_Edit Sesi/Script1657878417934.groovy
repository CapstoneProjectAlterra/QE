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

WebUI.click(findTestObject('ADMIN/Dashboard/overview'))

WebUI.click(findTestObject('ADMIN/Kelola Sesi/SEARCH/kelola sesi'))

WebUI.click(findTestObject('ADMIN/Kelola Sesi/EDIT SESI/edit btn'))

WebUI.click(findTestObject('ADMIN/Kelola Sesi/TAMBAH DATA/Page_Kelola Sesi  GetVaccine/input_Jam Mulai Sesi_operational_hour_start'))

WebUI.click(findTestObject('ADMIN/Page_Kelola Sesi  GetVaccine/div_10'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Kelola Sesi/EDIT SESI/BTN ON'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Page_Kelola Sesi  GetVaccine/button_Update Sesi'))

WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Sesi/EDIT SESI/verify berhasil edit'), 0)

