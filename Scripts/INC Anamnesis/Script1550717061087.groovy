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

Mobile.startApplication(findTestData('Bidan Sehati (1)').getValue(1, 5), true)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Berikutnya'), 0)

Mobile.tap(findTestObject('ANC/android.widget.Button1 - Sudah'), 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText0 - Nomor Handphone'), '085274037512', 0)

Mobile.setText(findTestObject('ANC/android.widget.EditText1 - Kata Sandi'), '037512', 0)

Mobile.tap(findTestObject('ANC/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('INC/android.widget.LinearLayout11'), 0)

Mobile.tap(findTestObject('INC/android.widget.LinearLayout6'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText0 - Tanggal (1)'), 0)

Mobile.tapAndHoldAtPosition(73, 645, 0)

Mobile.tap(findTestObject('INC/android.widget.Button6 - Simpan Tanggal (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText1 - Jam (1)'), 0)

Mobile.tapAndHoldAtPosition(194, 645, 0)

Mobile.tapAndHoldAtPosition(548, 645, 0)

Mobile.tap(findTestObject('INC/android.widget.Button4 - Simpan Waktu (2)'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Usia Kehamilan (1)'), '32', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText3 - Tanggal (1)'), 0)

Mobile.tapAndHold(findTestObject('INC/android.widget.Button0 - 20'), 0, 0)

Mobile.tap(findTestObject('INC/android.widget.Button6 - Simpan Tanggal (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText4 - Jam (1)'), 0)

Mobile.tapAndHoldAtPosition(194, 645, 0)

Mobile.tapAndHoldAtPosition(548, 645, 0)

Mobile.tap(findTestObject('INC/android.widget.Button4 - Simpan Waktu (2)'), 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton0 - Belum (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton1 - Sudah (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText3 - Tanggal (2)'), 0)

Mobile.tap(findTestObject('INC/android.widget.Button6 - Simpan Tanggal (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText4 - Jam (2)'), 0)

Mobile.tapAndHoldAtPosition(194, 645, 0)

Mobile.tap(findTestObject('INC/android.widget.Button4 - Simpan Waktu (2)'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('INC/android.widget.RadioButton3 - Ya (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton3 - Ya (2)'), 0)

Mobile.tap(findTestObject('INC/android.widget.Button0 - Simpan (1)'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText0 - Tekanan darah (1)'), '140/80', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText1 - Denyut nadi (1)'), '60', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText2 - Suhu tubuh (1)'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Suhu tubuh (2)'), '40', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText3 - Pernapasan (1)'), '60', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText4 - Tinggi Fundus Uteri (TFU) (1)'), '20', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText5 - Pilih salah satu (2)'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView2 - Ganda'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText0 - Pilih salah satu'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView3 - Sungsang'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText1 - Taksiran Berat Janin'), '1500', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Kontraksi'), '3', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText3 - Detak Jantung Janin'), '65', 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton1 - Tidak ada kelainan'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText4 - Pilih salah satu'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView3 - Tebal lunak'), 0)

Mobile.closeApplication()

