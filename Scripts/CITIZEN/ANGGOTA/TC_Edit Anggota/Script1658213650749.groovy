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

WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/home menu'))

WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/a_Vaksinasi'))

WebUI.click(findTestObject('CITIZEN/Page_undefined  GetVaccine/yonkes'))

WebUI.click(findTestObject('Page_Detail Fasilitas Kesehatan  GetVaccine/button_ANAK_ant-btn ant-btn-default CustomB_6459a1'))

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/div_place_of_birth is required'))

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Cancel'))

WebUI.click(findTestObject('CITIZEN/Page_undefined  GetVaccine/a_Fasilitas Kesehatan'))

WebUI.click(findTestObject('CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/detail haechan'))

WebUI.click(findTestObject('Page_Detail Fasilitas Kesehatan  GetVaccine/button_Edit'))

WebUI.click(findTestObject('Page_Detail Fasilitas Kesehatan  GetVaccine/edit haechan'))

WebUI.setText(findTestObject('Page_Detail Fasilitas Kesehatan  GetVaccine/edit haechan'), ' Lee')

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Detail Fasilitas Kesehatan  GetVaccine/span_Data telah berhasil diupdate'))

