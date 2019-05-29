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

Mobile.startApplication(findTestData('Bidan Sehati (1)').getValue('LinkAplikasi', 1), true)

Mobile.tap(findTestObject('nexus 6 bidan/onboarding - Berikutnya'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText0 - Nomor Handphone'), findTestData('Bidan Sehati (1)').getValue(
        'UserId', 1), 0)

Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText1 - Kata Sandi'), findTestData('Bidan Sehati (1)').getValue(
        'Password', 1), 0)

Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button0 - Masuk'), 0)

CustomKeywords.'myLoopPasienBaruHamil.Patiens.getPasien'()

Mobile.closeApplication()

