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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Software\\bidan-app-universal-debug-e3aafce.apk', true)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText0 - Nomor Handphone'), '085274037512', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Kata Sandi'), '037512', 0)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Masuk'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.ImageView11 (1)'), 0)

not_run: Mobile.tap(findTestObject('Prof bidan/android.widget.TextView10 - Pasien'), 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView3 - Sitik Jos...'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.ImageButton1tambah'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.ImageView6'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Nama Lengkap'), 'Buyung', 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Tanggal Lahir'), 0)

not_run: Mobile.tapAndHoldAtPosition(700, 645, 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Golongan Darah'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView2 - A'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText3 - Agama'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView2 - Islam'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText4 - Nomor Handphone'), '089089089920', 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.scrollToText('Pendidikan Terakhir', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Pendidikan Terakhir'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView8 - D3'), 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Pekerjaan Saat Ini'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView6 - Wirausaha'), 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.scrollToText('Tanggal Pernikahan', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.scrollToText('BULAN DAN TAHUN PERNIKAHAN', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Tanggal Pernikahan'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ya'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Tanggal HPHT'), 0)

not_run: Mobile.tapAndHoldAtPosition(387, 645, 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Siklus Haid Pasien'), '20', 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.scrollToText('Berikutnya')

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ya (1)'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Jenis Kontrasepsi'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView6 - Kondom'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya (1)'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Gravida'), '3', 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Para'), '1', 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Abortus'), '1', 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya (2)'), 0)

not_run: Mobile.closeApplication()

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Riwayat medis yang dialami'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup8'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup7'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Riwayat operasi yang dialami'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup4'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton0 - Tidak Ada'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ada'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Obat yang dikonsumsi'), 'ANALGESIK', 
    0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton2 - Tidak Ada'), 0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton3 - Ada'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Alergi terhadap obat'), 'ANTALGIN', 
    0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton4 - Tidak Ada'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton5 - Ada'), 0)

not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Alergi terhadap makanan'), 'BUBUR', 
    0)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Simpan (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Prof bidan/android.widget.TextView1 - Simpan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

