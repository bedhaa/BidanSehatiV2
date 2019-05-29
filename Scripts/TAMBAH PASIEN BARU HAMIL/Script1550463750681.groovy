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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Software\\bidan-app-universal-debug-2.0.apk', true)

Mobile.tap(findTestObject('Bidan Object terbaru/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Bidan Object terbaru/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('Bidan Object terbaru/android.widget.EditText0 - Nomor Handphone'), '0812345678956', 0)

Mobile.setText(findTestObject('Bidan Object terbaru/android.widget.EditText1 - Kata Sandi'), 'qwerty', 0)

Mobile.tap(findTestObject('Bidan Object terbaru/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Belum'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nama Lengkap'), 'Maria', 0)

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

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone'), '0890987651111', 0)

Mobile.scrollToText('PENDIDIKAN & PEKERJAAN', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Berikutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Pendidikan Terakhir'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView10 - S1'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText3 - Pekerjaan Saat Ini'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView7 - Professional'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.RadioButton1 - Ya'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor KTPNIK'), '67000955576501111', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Berikutnya'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText3 - Alamat'), 'JL. KH MAS MANSYUR NO 81', 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText0 - Provinsi'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView6 - DKI Jakarta'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText1 - KotaKabupaten'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView2 - Kota Jakarta Barat'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.EditText2 - Kecamatan'), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView4 - Kebon Jeruk'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Simpan'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button1 - Ya'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Nama Lengkap (1)'), 'Midun', 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Tanggal Lahir'), 0)

Mobile.tapAndHoldAtPosition(700, 645, 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Golongan Darah'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView2 - A'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText3 - Agama'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView2 - Islam'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText4 - Nomor Handphone'), '08908908102222', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.scrollToText('Pendidikan Terakhir', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Pendidikan Terakhir'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView8 - D3'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Pekerjaan Saat Ini'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView6 - Wirausaha'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.scrollToText('Tanggal Pernikahan', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('BULAN DAN TAHUN PERNIKAHAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Tanggal Pernikahan'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ya'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Tanggal HPHT'), 0)

Mobile.tapAndHoldAtPosition(387, 645, 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Siklus Haid Pasien'), '20', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.scrollToText('Berikutnya')

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ya (1)'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Jenis Kontrasepsi'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.TextView6 - Kondom'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya (1)'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Gravida'), '1', 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Para'), '0', 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Abortus'), '0', 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya (2)'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Riwayat medis yang dialami'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup7'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Riwayat operasi yang dialami'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup4'), 0)

not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton0 - Tidak Ada'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ada'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Obat yang dikonsumsi'), 'ANALGESIK', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton2 - Tidak Ada'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton3 - Ada'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Alergi terhadap obat'), 'ANTALGIN', 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton4 - Tidak Ada'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton5 - Ada'), 0)

Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText2 - Alergi terhadap makanan'), 'BUBUR', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Simpan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView1 - Simpan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Prof bidan/android.widget.TextView9 - Beranda'), 0)

not_run: Mobile.closeApplication()

