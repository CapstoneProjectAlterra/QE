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

for (i = 1; i <= 7; i++) {
    WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/home menu'))

    WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/vaksinasi menu'))

    WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/verify vaksinasi page'), 0)

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/search bar'))

    WebUI.clearText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/search bar'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/search bar'), findTestData('CITIZEN/Search Vaccine').getValue(
            1, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/button search'))

    if (i <= 3) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/verify search gagal'), 0)
    } else if (((i == 4) | (i == 5)) | (i == 6)) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_undefined  GetVaccine/yonkes'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_undefined  GetVaccine/yonkes'), 0)
    }
}

