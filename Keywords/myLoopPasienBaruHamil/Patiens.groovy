package myLoopPasienBaruHamil

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Patiens {
	
	@Keyword
	public void getPatien(){
		for (def row = 38; row <= findTestData('Bidan Sehati (1)').getRowNumbers(); row++) {
			Mobile.tap(findTestObject('nexus 6 bidan/DAFTAR PASIEN BARU'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah pasien sudah pernah terdaftar di Bidan Sehati lain - Belum'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText0 - Nama Lengkap'), findTestData('Bidan Sehati (1)').getValue(
					'NamaPasien', row), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText1 - Tanggal Lahir'), 0)
		
			Mobile.tapAndHoldAtPosition(388, 601, 0)
		
			Mobile.tapAndHoldAtPosition(78, 601, 0)
		
			Mobile.tapAndHoldAtPosition(698, 601, 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button6 - Simpan Tanggal'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText2 - Golongan Darah'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Golongan Darah O'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText3 - Agama'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Islam'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText0 - Nomor Handphone'), findTestData('Bidan Sehati (1)').getValue(
					'HpPasien', row), 0)
		
			Mobile.scrollToText('PENDIDIKAN & PEKERJAAN', FailureHandling.STOP_ON_FAILURE)
		
			Mobile.scrollToText('Berikutnya', FailureHandling.STOP_ON_FAILURE)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText2 - Pendidikan Terakhir'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.TextView10 - S1'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText3 - Pekerjaan Saat Ini'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.TextView7 - Professional'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button0 - Berikutnya'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien membawa KTPNIK - Ya'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/set text - Nomor KTPNIK'), findTestData('Bidan Sehati (1)').getValue('NikPasien',
					row), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/G lebih dari 1 - Berikutnya'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText3 - Alamat'), findTestData('Bidan Sehati (1)').getValue(
					'AlamatPasien', row), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Provinsi'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'DKI', 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BARIS PERTAMA HASIL PENCARIAN PROVINSI'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText1 - KotaKabupaten'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'Jakarta selatan', 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/baris pertama pencarian kabupaten'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText2 - Kecamatan'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/RECORD BARU/android.widget.EditText0 - Cari'), 'kebayoran', 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/baris pertama kecamatan'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button0 - Simpan'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien sedang hamil- Ya'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Nama Lengkap'), findTestData('Bidan Sehati (1)').getValue(
					'NamaSuami', row), 0)
		
			Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Tanggal Lahir'), 0)
		
			Mobile.tapAndHoldAtPosition(700, 645, 0)
		
			Mobile.tapAndHoldAtPosition(387, 645, 0)
		
			Mobile.tapAndHoldAtPosition(73, 645, 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Simpan Tanggal'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Golongan Darah'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - AB'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Agama'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Islam'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.setText(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Nomor Handphone'), findTestData('Bidan Sehati (1)').getValue(
					'HpSuami', row), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.scrollToText('Pendidikan Terakhir', FailureHandling.STOP_ON_FAILURE)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Pendidikan Terakhir'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - D3'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN- Pekerjaan Saat Ini'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Wirausaha'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.scrollToText('Tanggal Pernikahan', FailureHandling.STOP_ON_FAILURE)
		
			Mobile.scrollToText('BULAN DAN TAHUN PERNIKAHAN', FailureHandling.STOP_ON_FAILURE)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Tanggal Pernikahan'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Simpan Tanggal (1)'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Berikutnya'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien ingat tanggal HPHT - Ya'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText0 - Tanggal HPHT'), 0)
		
			Mobile.tapAndHoldAtPosition(388, 601, 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/HPHT - Simpan Tanggal'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText1 - Siklus Haid Pasien'), findTestData('Bidan Sehati (1)').getValue(
					'SiklusHaid', row), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.scrollToText('Berikutnya')
		
			Mobile.tap(findTestObject('nexus 6 bidan/G lebih dari 1 - Berikutnya'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien mempunyai Riwayat Kontrasepsi - Ya'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText0 - Jenis Kontrasepsi'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.TextView6 - Kondom'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/kontrasepsi - Berikutnya'), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText0 - Gravida'), findTestData('Bidan Sehati (1)').getValue(
					'Gravida', row), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText1 - Para'), findTestData('Bidan Sehati (1)').getValue(
					'Para', row), 0)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText2 - Abortus'), findTestData('Bidan Sehati (1)').getValue(
					'Abortus', row), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.EditText3 - Tanggal Persalinan Terakhir'), 0)
		
			Mobile.tapAndHoldAtPosition(388, 601, 0)
		
			Mobile.tapAndHoldAtPosition(388, 601, 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/android.widget.Button6 - Simpan Tanggal'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Pernah Lahir Premature- Tidak Pernah'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Pernah'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Bayi Besar - Tidak Pernah'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton3 - Pernah'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Persalinan Caesar - Tidak Pernah'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton5 - Pernah'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Persalinan Vakum - Tidak Pernah'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton7 - Pernah'), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/BIODATA PASANGAN - Berikutnya'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.Button0 - Berikutnya (3)'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Riwayat medis yang dialami (1)'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup11'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Riwayat operasi yang dialami (1)'),
				0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.view.ViewGroup5 (2)'), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Obat yang rutin dikonsumsi - Tidak Ada'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton1 - Ada (1)'), 0)
		
			not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText0 - Obat yang dikonsumsi (1)'), findTestData(
					'Bidan Sehati (1)').getValue('Obat', row), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien alergi terhadap obat - Tidak Ada'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton3 - Ada (1)'), 0)
		
			not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Alergi terhadap obat (1)'), findTestData(
					'Bidan Sehati (1)').getValue('AlergiObat', row), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.tap(findTestObject('nexus 6 bidan/Apakah Pasien alergi terhadap makanan - Tidak Ada'), 0)
		
			not_run: Mobile.tap(findTestObject('TAMBAH KEHAMILAN/android.widget.RadioButton5 - Ada (1)'), 0)
		
			not_run: Mobile.setText(findTestObject('TAMBAH KEHAMILAN/android.widget.EditText1 - Alergi terhadap makanan'), findTestData(
					'Bidan Sehati (1)').getValue('AlergiMakanan', row), 0)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.swipe(20, 1000, 750, 600)
		
			Mobile.setText(findTestObject('nexus 6 bidan/android.widget.EditText2 - Catatan Tambahan'), findTestData('Bidan Sehati (1)').getValue(
					'Saran', row), 0)
		
			Mobile.tap(findTestObject('nexus 6 bidan/kehamilan - Simpan'), 0)
			
		}
    }
}