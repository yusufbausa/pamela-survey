import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Oper browser
WebUI.openBrowser('')
WebUI.navigateToUrl('https://sister-uat.taf.co.id/pamela/Login.aspx?ReturnUrl=%2fpamela')
WebUI.delay(2)

//Input credential
WebUI.setText(findTestObject('Login/Field_Username'), 'BMU0300')
WebUI.setText(findTestObject('Login/Field_Password'), 'TAFWFH')
WebUI.click(findTestObject('Login/Button_Sign_In'))
WebUI.delay(2)

//Button Individual Value A
WebUI.click(findTestObject('Individual Value-A/a_INDIVIDUAL_VALUE_-_A'))


WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_1KEG2200UTAMASAYA_BEKE_af08de'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_2KEG2200UTAMASAYA_BERT_957eb3'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_3KEG2200UTAMASAYA_MEMI_67e805'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_4KEG2200UTAMASAYA_MEMA_2cdaff'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_5KEG2200UTAMASAYA_BEKE_46dcfa'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_ctl00ContentPlaceHolde_c21536'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_6KEG2200UTAMASAYA_MAMP_e811dc'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_7KEG2200UTAMASAYA_DAPA_1c3a5c'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_8KEG2200UTAMASAYA_MENU_544e6c'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_9KEG2200UTAMASAYA_DAPA_c45408'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_10KEG2200UTAMAKEBERADA_c88d42'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_ctl00ContentPlaceHolde_c21536'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_11KEG2200UTAMASAYA_TID_af2862'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_12KEG2200UTAMASAYA_MEM_4e6179'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_13KEG2200UTAMASAYA_TID_4f986b'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_14KEG2200UTAMASAYA_MEM_1a9c36'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_15KEG2200UTAMASAYA_MEN_7095b3'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_ctl00ContentPlaceHolde_c21536'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_16KEG2200UTAMASAYA_MEM_f16952'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_17KEG2200UTAMASAYA_PRO_8aaf72'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_18KEG2200UTAMASAYA_BER_1936ee'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_19KEG2200UTAMASAYA_MEL_0dcf6a'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_20KEG2200UTAMASAYA_MEN_ea69c5'))

WebUI.click(findTestObject('Individual Value-A/input_KELVIANDI GOUW_ctl00ContentPlaceHolde_de1dcd'))

WebUI.click(findTestObject('Individual Value-A/input_HOME_ctl00ContentPlaceHolder2btnHome'))

WebUI.closeBrowser()

