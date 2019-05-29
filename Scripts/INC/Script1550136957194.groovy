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

Mobile.tap(findTestObject('INC/android.widget.LinearLayout11'), 0)

Mobile.tap(findTestObject('INC/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('INC/android.widget.LinearLayout7'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Suhu tubuh'), '34', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText1 - Denyut nadi'), '54', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText0 - Tekanan darah'), '120/80', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText3 - Pernapasan'), '50', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText4 - Tinggi Fundus Uteri (TFU)'), '30', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText5 - Pilih salah satu'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView3 - Tunggal'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('INC/android.widget.EditText1 - Pilih salah satu'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView2 - Lintang'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Taksiran Berat Janin'), '1000', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText3 - Kontraksi'), '2', 0)

Mobile.setText(findTestObject('INC/android.widget.EditText4 - Detak Jantung Janin'), '55', 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('INC/android.widget.RadioButton0 - Ada kelainan'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText5 - Sebutkan kelainan vulva dan vagina'), 'ga tau', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText1 - Pilih salah satu (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView2 - Tertutup'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText2 - Pembukaan'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Pembukaan (1)'), '0', 0)

Mobile.tap(findTestObject('INC/android.widget.EditText3 - Pilih salah satu'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView5 - Kering'), 0)

Mobile.tap(findTestObject('INC/android.widget.EditText5 - Pilih salah satu (1)'), 0)

Mobile.tap(findTestObject('INC/android.widget.TextView5 - 25'), 0)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.swipe(20, 1000, 750, 600)

Mobile.tap(findTestObject('INC/android.widget.TextView6 - 15'), 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton1 - '), 0)

Mobile.tap(findTestObject('INC/android.widget.RadioButton4 - -'), 0)

Mobile.setText(findTestObject('INC/android.widget.EditText2 - Volume'), '10', 0)

Mobile.tap(findTestObject('INC/android.widget.Button0 - Simpan'), 0)

Mobile.closeApplication()

