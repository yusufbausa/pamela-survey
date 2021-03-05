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

//Button survey LEADERSHIP
WebUI.click(findTestObject('Survey Leadership/Button_LEADERSHIP'))
WebUI.delay(2)

//Survey Page 1
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_01'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_02'))
WebUI.scrollToElement(findTestObject('Survey Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_03'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_04'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_05'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Survey Leadership/Button_Next'))
WebUI.delay(1)

//Survey Page 2
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_06'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_07'))
WebUI.scrollToElement(findTestObject('Survey Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_08'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_09'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_10'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Survey Leadership/Button_Next'))
WebUI.delay(1)

//Survey Page 3
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_11'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_12'))
WebUI.scrollToElement(findTestObject('Survey Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_13'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_14'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_15'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Survey Leadership/Button_Next'))
WebUI.delay(1)

//Survey Page 4
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_16'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_17'))
WebUI.scrollToElement(findTestObject('Survey Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_18'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_19'))
WebUI.click(findTestObject('Survey Leadership/RadioButton_Question_No_20'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Survey Leadership/Button_Next'))
WebUI.delay(1)

//Survey Page 5 (Text Field)
WebUI.setText(findTestObject('Survey Leadership/Textarea_Strength_Weakness'), '1. Strength = Teliti, Akurat, Disiplin\n2. Weakness = Tidak ada')
WebUI.delay(1)

//Button Submit
WebUI.click(findTestObject('Survey Leadership/Button_Submit'))

//Taking Screenshot
WebUI.takeScreenshot()
WebUI.delay(2)

//Back to Home
WebUI.click(findTestObject('Survey Leadership/Button_Home'))
WebUI.delay(3)


WebUI.closeBrowser()

