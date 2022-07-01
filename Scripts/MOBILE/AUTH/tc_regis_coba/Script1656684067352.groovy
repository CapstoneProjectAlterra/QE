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

for (i = 1; i <= 4; i++) {
    Mobile.startApplication('C:\\Users\\Thinkpad X260\\Downloads\\app-release (1).apk', false)

    Mobile.tap(findTestObject('MOBILE/Register/Register-landing'), 0)

    Mobile.verifyElementExist(findTestObject('MOBILE/Register/Verif-regis-page'), 0)

    Mobile.tap(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input'), 0)

    Mobile.setText(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (1)'), findTestData('dataRegis').getValue(
            1, i), 0)

    Mobile.tap(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (2)'), 0)

    Mobile.setText(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (3)'), findTestData('dataRegis').getValue(
            2, i), 0)

    Mobile.tap(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (4)'), 0)

    Mobile.setText(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (5)'), findTestData('dataRegis').getValue(
            3, i), 0)

    Mobile.tap(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (6)'), 0)

    Mobile.setText(findTestObject('Object Repository/MOBILE/coba/android.widget.EditText - input (7)'), findTestData('dataRegis').getValue(
            4, i), 0)

    Mobile.tap(findTestObject('MOBILE/Register/register-btn'), 0)

    if (i == 1) {
        Mobile.verifyElementExist(findTestObject('MOBILE/regis baru/alert nik'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 2) {
        Mobile.verifyElementExist(findTestObject('MOBILE/regis baru/alert email'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 3) {
        Mobile.verifyElementExist(findTestObject('MOBILE/regis baru/alert pass'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        Mobile.verifyElementExist(findTestObject('MOBILE/Login/Verify-login-page'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    Mobile.closeApplication()
}

