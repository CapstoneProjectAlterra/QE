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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Home  GetVaccine/a_Login'))

WebUI.setText(findTestObject('Object Repository/CITIZEN/Page_Login  GetVaccine/input_NIK_basic_nik'), '7890789078907890')

WebUI.setEncryptedText(findTestObject('Object Repository/CITIZEN/Page_Login  GetVaccine/input_Password_basic_password'), 
    'PQJDJK8wP4fiH7AdcBx/sA==')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Home  GetVaccine/a_Vaksinasi'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Fasilitas Kesehatan  GetVaccine/img_Temukan Fasilitas Kesehatan TerdekatUnt_7daf0b'))

WebUI.rightClick(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/main_HomeVaksinasiFasilitas KesehatanVaksin_49ca18'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_ANAK_ant-btn ant-btn-default CustomB_6459a1'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Edit'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Submit'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/div_Masukkan minimal 16 karakter'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/div_place_of_birth is required'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/span_Kelompok 16 - Copyright 2022_ant-modal_8f4cbf'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_ANAK_ant-btn ant-btn-default CustomB_6459a1'))

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/input_Nama Lengkap_edit family member_name'))

WebUI.setText(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/input_Nama Lengkap_edit family member_name'), 
    'Lee Haechan')

WebUI.click(findTestObject('Object Repository/CITIZEN/Page_Detail Fasilitas Kesehatan  GetVaccine/button_Submit'))

