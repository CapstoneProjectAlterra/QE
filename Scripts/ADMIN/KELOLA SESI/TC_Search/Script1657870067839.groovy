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
    WebUI.click(findTestObject('ADMIN/Dashboard/overview'))

    WebUI.click(findTestObject('ADMIN/Kelola Sesi/SEARCH/kelola sesi'))

    WebUI.click(findTestObject('ADMIN/Kelola Sesi/SEARCH/Search bar'))

    WebUI.setText(findTestObject('ADMIN/Kelola Sesi/SEARCH/Search bar'), findTestData('ADMIN/Search Sesi').getValue(1, i))

    WebUI.click(findTestObject('ADMIN/Kelola Sesi/SEARCH/btn search'))

    if ((i == 1) | (i == 2)) {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Sesi/SEARCH/verify no data'), 0)
    } else if (i == 3) {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Sesi/SEARCH/verify sinovac'), 0)
    } else if (i == 4) {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Sesi/SEARCH/verify dosis 1'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Sesi/SEARCH/verify tgl 15'), 0)
    }
}

