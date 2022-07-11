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

for (i = 1; i <= 6; i++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

    WebUI.click(findTestObject('Object Repository/Page_Home  GetVaccine/a_Register'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Registrasi  GetVaccine/h2_Register'))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_NIK_basic_nik'), findTestData('Register').getValue(
            1, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Nama Lengkap_basic_fullname'), findTestData(
            'Register').getValue(2, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Email_basic_email'), findTestData(
            'Register').getValue(3, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Password_basic_password'), findTestData(
            'Register').getValue(4, i))

    WebUI.click(findTestObject('Page_Login  GetVaccine/eye'))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Confirm Password_basic_confirmPassword'), 
        findTestData('Register').getValue(5, i))

    WebUI.click(findTestObject('Page_Login  GetVaccine/eye'))

    WebUI.click(findTestObject('Object Repository/Page_Registrasi  GetVaccine/button_Register'))

    if (i == 1) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Masukkan minimal 16 karakter'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 2) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Inputan Harus Berupa Angka'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 3) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Karakter yang diizinkan spasi, huruf ka_922eed'), 
            FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 4) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Format Email tidak valid'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 5) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Password harus berupa kombinasi huruf b_9d7790'), 
            FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Password minimal 8 karakter'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_Password yang dimasukkan tidak sama den_ea25f1'), 
            FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/div_NIK Tidak Boleh Kosong'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.closeBrowser()
}

for (i = 7; i <= 9; i++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('https://dev-getvaccine-16.netlify.app/')

    WebUI.click(findTestObject('Object Repository/Page_Home  GetVaccine/a_Register'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Registrasi  GetVaccine/h2_Register'))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_NIK_basic_nik'), findTestData('Register').getValue(
            1, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Nama Lengkap_basic_fullname'), findTestData(
            'Register').getValue(2, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Email_basic_email'), findTestData(
            'Register').getValue(3, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Password_basic_password'), findTestData(
            'Register').getValue(4, i))

    WebUI.setText(findTestObject('Object Repository/Page_Registrasi  GetVaccine/input_Confirm Password_basic_confirmPassword'), 
        findTestData('Register').getValue(5, i))

    WebUI.click(findTestObject('Object Repository/Page_Registrasi  GetVaccine/button_Register'))

    if (i == 7) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/alert blank field'), FailureHandling.CONTINUE_ON_FAILURE)
    } else if (i == 8) {
        WebUI.verifyElementVisible(findTestObject('Page_Registrasi  GetVaccine/nik exist'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.verifyElementVisible(findTestObject('Page_Login  GetVaccine/VerifyLoginPage'), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.closeBrowser()
}

