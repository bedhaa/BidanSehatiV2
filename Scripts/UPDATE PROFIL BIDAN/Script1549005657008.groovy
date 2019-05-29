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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Software\\bidan-app-universal-debug.apk', true)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone'), '085274037512', 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Kata Sandi'), '037512', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Update Akun Saya'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.FrameLayout7'), 0)

Mobile.tapAndHoldAtPosition(73, 645, 0)

Mobile.tapAndHoldAtPosition(387, 645, 0)

Mobile.tapAndHoldAtPosition(700, 645, 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText2 - Nomor STR'), '9802987612234789', 0)

Mobile.scrollToText('KONTAK', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText4 - Nomor IBI'), '780287765413256', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText3 - Tanggal Kadaluarsa STR'), 0)

Mobile.tapAndHoldAtPosition(73, 1000, 0)

Mobile.tapAndHoldAtPosition(387, 1000, 0)

Mobile.tapAndHoldAtPosition(700, 1000, 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.scrollToText('KONTAK', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Nomor SIPB'), '123294732419047', 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText3 - Alamat Email'), 'nita@telectg.com', 0)

Mobile.scrollToText('BIODATA', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView1 - Simpan'), 0)

not_run: Mobile.scrollToText('KLINIK', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Prof bidan/android.widget.LinearLayout16'), 0)

not_run: Mobile.closeApplication()

