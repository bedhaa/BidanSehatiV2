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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Software\\bidan-app-universal-debug-39e6767.apk', false)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText0 - Nomor Handphone'), '085274037512', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Kata Sandi'), '037512', 0)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.ImageView11 (1)'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView10 - Pasien'), 0)

Mobile.scrollToText('Suharti', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(387, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView6 - Suharti'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.ImageButton1 (1)'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup5 (1)'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Nama Lengkap (2)'), 'Buyung', 0)

