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

for (i = 1; i <= 5; i++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

    WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/login btn'))

    WebUI.verifyElementVisible(findTestObject('CITIZEN/Page_Login  GetVaccine/VerifyLoginPage'))

    WebUI.setText(findTestObject('CITIZEN/Page_Login  GetVaccine/input_NIK_basic_nik'), findTestData('CITIZEN/Login').getValue(
            1, i))

    WebUI.setText(findTestObject('CITIZEN/password'), findTestData('CITIZEN/Login').getValue(2, i))

    WebUI.click(findTestObject('CITIZEN/Page_Login  GetVaccine/eye'))

    WebUI.click(findTestObject('CITIZEN/Page_Login  GetVaccine/button_Login'))

    if (i == 1) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Login  GetVaccine/div_Input harus berupa angka'), 0)
    } else if (i == 2) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Login  GetVaccine/div_NIK atau Password Salah'), 0)
    } else if (i == 3) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Login  GetVaccine/alert nik kosong'), 0)
    } else if (i == 4) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Login  GetVaccine/alert nik kosong'), 0)

        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Login  GetVaccine/alert pass kosong'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Home  GetVaccine/Verify Home'), 0)
    }
    
    WebUI.closeBrowser()
}

