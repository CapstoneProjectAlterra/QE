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
    Mobile.startApplication('C:\\Users\\Thinkpad X260\\Downloads\\app-release (1).apk', false)

    Mobile.tap(findTestObject('MOBILE/Register/Login-landing'), 0)

    Mobile.verifyElementExist(findTestObject('MOBILE/Login/Verify-login-page'), 0)

    Mobile.tap(findTestObject('MOBILE/Login/nik'), 0)

    Mobile.setText(findTestObject('MOBILE/Login/nik'), findTestData('dataLogin').getValue(1, i), 0)

    Mobile.tap(findTestObject('MOBILE/Login/pass'), 0)

    Mobile.setText(findTestObject('MOBILE/Login/pass'), findTestData('dataLogin').getValue(2, i), 0)

    Mobile.tap(findTestObject('MOBILE/Login/view pass'), 3)

    Mobile.tap(findTestObject('MOBILE/Login/btn-login'), 0)

    if (i == 1) {
        Mobile.verifyElementExist(findTestObject('MOBILE/Login/alert-nik'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 2) {
        Mobile.verifyElementExist(findTestObject('MOBILE/Login/alert-invalid-format-pass'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        Mobile.verifyElementExist(findTestObject('MOBILE/Login/Verify-login-page'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    Mobile.closeApplication()
}

for (i = 1; i <= 5; i++) {
    if (i == 4) {
        Mobile.startApplication('C:\\Users\\Thinkpad X260\\Downloads\\vaccine_booking.apk', false)

        Mobile.tap(findTestObject('MOBILE/Register/Login-landing'), 0)

        Mobile.verifyElementExist(findTestObject('MOBILE/Login/Verify-login-page'), 0)

        Mobile.tap(findTestObject('MOBILE/Login/nik'), 0)

        Mobile.setText(findTestObject('MOBILE/Login/nik'), findTestData('dataLogin').getValue(1, i), 0)

        Mobile.tap(findTestObject('MOBILE/Login/pass'), 0)

        Mobile.setText(findTestObject('MOBILE/Login/pass'), findTestData('dataLogin').getValue(2, i), 0)

        Mobile.tap(findTestObject('MOBILE/Login/view pass'), 3)

        Mobile.clearText(findTestObject('MOBILE/Login/pass'), 0)

        Mobile.tap(findTestObject('MOBILE/Login/btn-login'), 0)

        Mobile.verifyElementExist(findTestObject('MOBILE/Login/required-pass'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 5) {
        Mobile.startApplication('C:\\Users\\Thinkpad X260\\Downloads\\vaccine_booking.apk', false)

        Mobile.tap(findTestObject('MOBILE/Register/Login-landing'), 0)

        Mobile.verifyElementExist(findTestObject('MOBILE/Login/Verify-login-page'), 0)

        Mobile.tap(findTestObject('MOBILE/Login/nik'), 0)

        Mobile.setText(findTestObject('MOBILE/Login/nik'), findTestData('dataLogin').getValue(1, i), 0)

        Mobile.tap(findTestObject('MOBILE/Login/pass'), 0)

        Mobile.setText(findTestObject('MOBILE/Login/pass'), findTestData('dataLogin').getValue(2, i), 0)

        Mobile.tap(findTestObject('MOBILE/Login/view pass'), 3)

        Mobile.tap(findTestObject('MOBILE/Login/btn-login'), 0)

        Mobile.verifyElementVisible(findTestObject('MOBILE/Login/verify-home'), 0)
    }
    
    Mobile.closeApplication()
}

