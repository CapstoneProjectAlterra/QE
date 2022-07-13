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

WebUI.callTestCase(findTestCase('CITIZEN/AUTH/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CITIZEN/Page_Home  GetVaccine/vaksinasi menu'))

WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Search/verify hasil rumah sakit'))

for (i = 1; i <= 7; i++) {
    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/fasilitas kesehatan'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/btn tambah anggota'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/nik'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/nik'), findTestData('CITIZEN/TambahAnggota').getValue(
            1, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/Nama'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/Nama'), findTestData('CITIZEN/TambahAnggota').getValue(
            2, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/tp lahir'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/tp lahir'), findTestData('CITIZEN/TambahAnggota').getValue(
            3, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/date click'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/year'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/prev year'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/prev year'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/prev year'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/1996'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/januari'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/tgl 1'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/jk sebelum'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/laki'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/hubungan'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/ayah'))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/email'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/email'), findTestData('CITIZEN/TambahAnggota').getValue(
            4, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/telp'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/telp'), findTestData('CITIZEN/TambahAnggota').getValue(
            5, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alamat'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alamat'), findTestData('CITIZEN/TambahAnggota').getValue(
            6, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/domisili'))

    WebUI.setText(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/domisili'), findTestData('CITIZEN/TambahAnggota').getValue(
            7, i))

    WebUI.click(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/submit'))

    if (i == 1) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert inpputan harus angka'), 
            0)
    } else if (i == 2) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert nik inputan harus 16'), 
            0)
    } else if (i == 3) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert nama lengkap kurang 4'), 
            0)
    } else if (i == 4) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert email'), 0)
    } else if (i == 5) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert telp huruf'), 
            0)

        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert telp kurang'), 
            0)
    } else if (i == 6) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert alamat'), 0)

        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert dom'), 0)
    } else if (i == 7) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert nama kosong'), 
            0)
    } else if (i == 8) {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/alert form tambah anggota blank'), 
            0)
    } else {
        WebUI.verifyElementPresent(findTestObject('CITIZEN/Page_Vaksinasi GetVaccine/Tambah Anggota/verify berhasil tambah anggota'), 
            0)
    }
}

