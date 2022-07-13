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

WebUI.callTestCase(findTestCase('CITIZEN/VAKSINASI/TC_Health Facility'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/date'))

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/tgl 21'))

WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/jadwal'), 
    0)

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/jadwal'))

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/jadwal'))

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/Taeil'))

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/btn pesan vaksin'))

WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Detail Health Facility dan Pesan Vaksinasi/verify tiket'), 
    0)

