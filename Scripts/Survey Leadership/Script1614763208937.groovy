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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sister-uat.taf.co.id/pamela/Login.aspx?ReturnUrl=%2fpamela')

WebUI.setText(findTestObject('Object Repository/Survey Leadership/input_person_txtUsername'), 'KEG2200')

WebUI.setEncryptedText(findTestObject('Object Repository/Survey Leadership/input_lock_txtPassword'), 'yqhJ93vELC0=')

WebUI.click(findTestObject('Object Repository/Survey Leadership/a_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/a_LEADERSHIP'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_1SNG0014UTAMAYBS_DA_e4c4ef'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_2SNG0014UTAMAYBS_ME_ee81a5'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_3SNG0014UTAMAYBS_DA_5b252b'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_4SNG0014UTAMAYBS_ME_e62025'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_5SNG0014UTAMAYBS_ME_a99889'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_6SNG0014UTAMAYBS_ME_1fdaa8'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_7SNG0014UTAMAYBS_DA_e18203'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_8SNG0014UTAMAYBS_ME_7ff623'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_9SNG0014UTAMAYBS_ME_d7004b'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_10SNG0014UTAMAYBS_M_8d1155'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_11SNG0014UTAMAYBS_M_c8f86d'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_12SNG0014UTAMAYBS_M_22429b'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_13SNG0014UTAMAYBS_B_a72ae7'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_14SNG0014UTAMAYBS_B_2ed1dc'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_15SNG0014UTAMATIMBA_a5d68d'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_16SNG0014UTAMAYBS_M_6abccd'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_17SNG0014UTAMAYBS_D_e75c02'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_18SNG0014UTAMAYBS_R_d9e22e'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_19SNG0014UTAMAYBS_R_51b917'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_20SNG0014UTAMAYBS_M_6a2fa6'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.setText(findTestObject('Object Repository/Survey Leadership/textarea_SYAHKIMIKI NGOMAN_21SNG0014ESSAYTU_086fb4'), 
    '1. Strength = Teliti, Akurat, Disiplin\n2. Weakness = Tidak ada')

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_cd18e0'))

WebUI.click(findTestObject('Object Repository/Survey Leadership/input_HOME_ctl00ContentPlaceHolder2btnHome'))

WebUI.closeBrowser()

