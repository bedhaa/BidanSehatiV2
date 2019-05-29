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

Mobile.startApplication(findTestData('Bidan Sehati (1)').getValue(1, 4), true)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText0 - Nomor Handphone'), findTestData('Bidan Sehati (1)').getValue(
        1, 1), 0)

Mobile.setText(findTestObject('Prof bidan/android.widget.EditText1 - Kata Sandi'), findTestData('Bidan Sehati (1)').getValue(
        2, 1), 0)

Mobile.tap(findTestObject('Prof bidan/android.widget.Button0 - Masuk (1)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.LinearLayout10PemeriksaanANC'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText0 - Cari Pasien'), 'Cinta', 0)

Mobile.tap(findTestObject('ANC/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText0 - Tanggal periksa Pasien'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button6 - Simpan Tanggal'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText1 - Cari Keluhan'), 0)

Mobile.tap(findTestObject('ANC/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('ANC/android.widget.FrameLayout13'), 0)

Mobile.tap(findTestObject('ANC/android.view.ViewGroup2'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText2 - Keluhan Lainnya'), 'sensitive', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Tinggi badan Pasien'), '160', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText2 - Berat badan Pasien'), '48', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText3 - Tekanan darah Pasien'), '110/80', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText4 - Pernapasan Pasien'), '50', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText5 - Suhu badan Pasien'), '34', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

not_run: Mobile.setText(findTestObject('ANC/android.widget.EditText4 - Lingkar lengan Pasien'), '25', 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton1 - Normal'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Berikutnya (1)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText0 - Periksa Ballotement'), 0)

Mobile.tap(findTestObject('ANC/android.widget.TextView2 - Ballotement Teraba'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Detak Jantung Janin'), '67', 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton0 - Tidak'), 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton2 - Negatif'), 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton4 - Tidak Ada'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Berikutnya (2)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton1 - Ada'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText0 - Tanggal USG'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button6 - Simpan Tanggal (1)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.RadioButton2 - Negatif (1)'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText1 - Letak Janin'), 0)

Mobile.tap(findTestObject('ANC/android.widget.TextView4 - Lintang'), 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText2 - Letak Plasenta'), 0)

Mobile.tap(findTestObject('ANC/android.widget.TextView3 - Previa'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText3 - Usia Kehamilan'), '23', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Berat Badan Janin'), '20', 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText2 - Protein Urine'), 0)

Mobile.tap(findTestObject('ANC/android.widget.TextView3 - 1'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Hemoglobin Darah'), '12', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.setText(findTestObject('ANC/android.widget.EditText2 - Hasil Laboratorium Lainnya'), 'flek paru', 0)

Mobile.tap(findTestObject('ANC/android.widget.EditText2 - Terapi'), 0)

Mobile.tap(findTestObject('ANC/android.widget.TextView2 - TT1'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText3 - Terapi Lainnya'), 'Aromatherapy', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('ANC/android.support.design.chip.Chip1 - FE'), 0)

Mobile.tap(findTestObject('ANC/android.support.design.chip.Chip2 - Kalsium'), 0)

Mobile.tap(findTestObject('ANC/android.support.design.chip.Chip3 - Asam Folat'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Obat Lainnya'), 'veril', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText2 - Nasihat Yang Diberikan'), 'Istirahat lebih awal malam hari', 
    0)

Mobile.tap(findTestObject('ANC/android.widget.EditText3 - Jadwal Kembali'), 0)

Mobile.tapAtPosition(71, 1000, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ANC/android.widget.Button6 - Simpan Tanggal (2)'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Simpan'), 0)

not_run: Mobile.tap(findTestObject('ANC/android.widget.Button0 - Tidak simpan'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button1 - Pemeriksaan CTG'), 0)

not_run: Mobile.closeApplication()

