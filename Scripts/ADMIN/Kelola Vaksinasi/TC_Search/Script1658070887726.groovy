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

for (i = 1; i <= 2; i++) {
    WebUI.click(findTestObject('ADMIN/Page_Dashboard Admin  GetVaccine/a_Overview'))

    WebUI.click(findTestObject('ADMIN/Page_Dashboard Admin  GetVaccine/a_Kelola Vaksin'))

    WebUI.click(findTestObject('ADMIN/Kelola Vaksin/Page_Kelola Vaksin  GetVaccine/input search'))

    WebUI.setText(findTestObject('ADMIN/Kelola Vaksin/Page_Kelola Vaksin  GetVaccine/input search'), findTestData('ADMIN/search vaksin').getValue(
            1, i))

    WebUI.click(findTestObject('ADMIN/Kelola Vaksin/Page_Kelola Vaksin  GetVaccine/icon search'))

    if (i == 1) {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Vaksin/Page_Kelola Vaksin  GetVaccine/no data'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('ADMIN/Kelola Vaksin/Page_Kelola Vaksin  GetVaccine/h3_Stok Vaksin'), 
            0)
    }
}

