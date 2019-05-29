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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Software\\Bidan-app-universal-debug-current.apk', true)

Mobile.tap(findTestObject('Registrasi Bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Registrasi Bidan/android.widget.Button0 - Belum'), 0)

Mobile.setText(findTestObject('Registrasi Bidan/android.widget.EditText0 - Nama'), 'Amalia', 0)

Mobile.setText(findTestObject('Registrasi Bidan/android.widget.EditText1 - Nomor Handphone'), '080970756420', 0)

Mobile.setText(findTestObject('Registrasi Bidan/android.widget.EditText2 - Kata Sandi'), 'password', 0)

Mobile.tap(findTestObject('Registrasi Bidan/android.widget.Button0 - Daftar'), 0)

not_run: Mobile.closeApplication()

