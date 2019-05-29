import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automation.sehati.co/consultation_center/undiagnosed-reports')

WebUI.setText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Email_useremail'), 
    'doctor@cc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Kata Sandi_userpassword'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Kata Sandi_btn btn-lg bt'))

WebUI.setText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Tampilkan 10 Per Halaman'), 
    'badut')

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Tampilkan 10 Per Halaman_1'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/i_arrow_forward_ios'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_Tangani Sekarang'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_Beri diagnosa dan instruks'))

WebUI.selectOptionByValue(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/select_NormalSuspiciousPatolog'), 
    '-1', true)

WebUI.setText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/textarea_Interpretation_incint'), 
    'invalid')

WebUI.setText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/textarea_Diagnosa_incdiagnosis'), 
    'invalid')

WebUI.setText(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/textarea_Instruksi_incinstruct'), 
    'lakukan CTG ulang')

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/input_Instruksi_btn btn-primar'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/a_Selengkapnya'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/i_arrow_back_ios'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/a_Hasil INC'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/a_Observasi'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/a_Riwayat risiko5'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_Lihat lebih lengkap'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_DEMAM'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_Parameter Normal'))

WebUI.click(findTestObject('Object Repository/consultation center/Page_Sehati Portal/Page_Sehati Portal/div_Parameter terukur'))

