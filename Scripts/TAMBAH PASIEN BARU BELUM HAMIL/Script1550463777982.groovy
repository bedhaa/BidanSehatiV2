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

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone (2)'), '085274037512', 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Kata Sandi (2)'), '037512', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Masuk (1)'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Belum'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nama Lengkap'), 'sitik joss', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText1 - Tanggal Lahir'), 0)

not_run: Mobile.tap(findTestObject('Prof bidan/android.widget.FrameLayout7'), 0)

Mobile.tapAndHoldAtPosition(73, 645, 0)

Mobile.tapAndHoldAtPosition(387, 645, 0)

Mobile.tapAndHoldAtPosition(700, 645, 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Golongan Darah'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView5 - O'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText3 - Agama'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView2 - Islam'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone'), '0890987654810', 0)

Mobile.scrollToText('PENDIDIKAN & PEKERJAAN', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Berikutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Pendidikan Terakhir'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView10 - S1'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText3 - Pekerjaan Saat Ini'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView7 - Professional'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.RadioButton1 - Ya'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor KTPNIK'), '67000955576549009', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText3 - Alamat'), 'JL. KH MAS MANSYUR NO 81', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText0 - Provinsi'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView6 - DKI Jakarta'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText1 - KotaKabupaten'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView2 - Kota Jakarta Barat'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Kecamatan'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView4 - Kebon Jeruk'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Simpan'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.RadioButton0 - Tidak'), 0)

