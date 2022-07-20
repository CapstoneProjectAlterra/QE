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

WebUI.click(findTestObject('ADMIN/Page_Dashboard Admin  GetVaccine/a_Overview'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Dashboard Admin  GetVaccine/a_Kelola Sesi'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/button_Tambah Data'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/div_MODERNA'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/input_Tanggal Sesi_vaccination_date'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/div_20'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/input_Jam Mulai Sesi_operational_hour_start'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/div_07'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/button_OK'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/input_Jam Selesai Sesi_operational_hour_end'))

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/a_Now'))

WebUI.setText(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/input_Kuota_quota'), '100')

WebUI.click(findTestObject('Object Repository/ADMIN/Page_Kelola Sesi  GetVaccine/button_Tambah Sesi'))
