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

Mobile.startApplication('C:\\Users\\Sehati - Nita\\Downloads\\bidan-app-universal-debug-2.0.apk', true)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView1 - DaftarPasien Baru'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button0 - Belum'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Nama Lengkap'), 'DEDEK', 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText1 - Tanggal Lahir'), 0)

Mobile.tapAndHold(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button4 - 2003'), 0, 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText2 - Golongan Darah'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView2 - A'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText3 - Agama'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView2 - Islam'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText4 - Nomor Handphone'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText3 - Nomor Handphone'), '089802020200000', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText4 - Pendidikan Terakhir'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView7 - D2'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText2 - Pekerjaan Saat Ini'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView6 - Wirausaha'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.RadioButton1 - Ya'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Nomor KTPNIK'), '0030402050600030000', 
    0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button0 - Berikutnya (1)'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Provinsi'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'SUMATERA', 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView1 - Sumatera Barat'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText1 - KotaKabupaten'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'PARIAMAN', 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView1 - Kabupaten Padang Pariaman'), 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText2 - Kecamatan'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'SUNGAI', 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.TextView2 - Sungai Limau'), 0)

Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText3 - Alamat'), 'JL. BEBATUAN', 0)

Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.Button0 - Simpan'), 0)

Mobile.closeApplication()

not_run: Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText0 - Provinsi'), 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/Cari Provinsi'), 0)

not_run: Mobile.setText(findTestObject('nexus 6 bidan/Cari Provinsi'), 'sumatera', 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/BARIS PERTAMA HASIL PENCARIAN PROVINSI'), 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText1 - KotaKabupaten'), 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/Cari kabupaten'), 0)

not_run: Mobile.setText(findTestObject('nexus 6 bidan/Cari kabupaten'), 'Pariaman', 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/baris pertama pencarian kabupaten'), 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText2 - Kecamatan'), 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/Cari Kecamatan'), 0)

not_run: Mobile.setText(findTestObject('nexus 6 bidan/Cari Kecamatan'), 'sungai', 0)

not_run: Mobile.tap(findTestObject('nexus 6 bidan/baris pertama kecamatan'), 0)

