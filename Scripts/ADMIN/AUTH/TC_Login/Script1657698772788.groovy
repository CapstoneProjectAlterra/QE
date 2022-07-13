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

for (i = 1; i <= 3; i++) {
    WebUI.openBrowser('https://dev-getvaccine-16.netlify.app/admin/')

    WebUI.maximizeWindow()

    WebUI.verifyElementPresent(findTestObject('ADMIN/Adm-Login/verify login page'), 0)

    WebUI.click(findTestObject('ADMIN/Adm-Login/username'))

    WebUI.setText(findTestObject('ADMIN/Adm-Login/username'), findTestData('ADMIN/Login').getValue(1, i))

    WebUI.click(findTestObject('ADMIN/Adm-Login/password'))

    WebUI.setText(findTestObject('ADMIN/Adm-Login/password'), findTestData('ADMIN/Login').getValue(2, i))

    WebUI.click(findTestObject('ADMIN/Adm-Login/eye'))

    WebUI.click(findTestObject('ADMIN/Adm-Login/btn login'))

    if ((i == 1) | (i == 2)) {
        WebUI.verifyElementText(findTestObject('ADMIN/Adm-Login/alert-message'), 'Username atau Password Salah')
    } else {
        WebUI.verifyTextPresent('Dashboard', true)
    }
    
    WebUI.closeBrowser()
}

