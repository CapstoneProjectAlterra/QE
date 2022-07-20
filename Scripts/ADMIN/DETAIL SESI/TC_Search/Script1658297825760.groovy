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
    WebUI.click(findTestObject('Object Repository/ADMIN/Page_Dashboard Admin  GetVaccine/a_Kelola Sesi'))

    WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/a'))

    WebUI.setText(findTestObject('Object Repository/ADMIN/Page_Detail Sesi  GetVaccine/input_Download_keyword'), findTestData(
            'ADMIN/search pendaftar').getValue(1, i))

    WebUI.click(findTestObject('Object Repository/ADMIN/Page_Detail Sesi  GetVaccine/button_Download_ant-btn ant-btn-default'))

    if (i == 1) {
        WebUI.verifyElementPresent(findTestObject('Object Repository/ADMIN/Page_Detail Sesi  GetVaccine/div_No Data'), 0)
    } else {
        WebUI.verifyElementPresent(findTestObject('Object Repository/ADMIN/Page_Detail Sesi  GetVaccine/td_Haechann'), 0)
    }
}

