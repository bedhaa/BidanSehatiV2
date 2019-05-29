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

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone (2)'), '085274037512', 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Kata Sandi (2)'), '037512', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Masuk (1)'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Update Akun Saya (1)'), 0)

Mobile.scrollToText('KLINIK', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.LinearLayout16 (1)'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText0 - Jenis Klinik'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView3 - Klinik Privat'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Nama Klinik atau Nama Anda'), 'KASIH BUNDO', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Provinsi'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Cari'), 'sumatera', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView1 - Sumatera Barat'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText3 - Kota'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView5 - Kabupaten Padang Pariaman'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText4 - Kecamatan'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Cari'), 'Sungai', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView2 - Sungai Limau'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText5 - Nama Jalan Nomor Rumah RTRW'), 'Jl. Bundo Mananti', 
    0)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Simpan'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Simpan'), 0)

Mobile.closeApplication()

