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
WebUI.setText(findTestObject('Login/Field_Username'), username)
WebUI.setText(findTestObject('Login/Field_Password'), password)
WebUI.click(findTestObject('Login/Button_Sign_In'))
WebUI.delay(2)

//Button Survey Individual Value B
WebUI.click(findTestObject('Individual Value-B/Button_Individual_Value_B'))
WebUI.delay(2)

//Survey Page 1
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_01 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_02 - DD'))
WebUI.scrollToElement(findTestObject('Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_03 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_04 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_05 - DD'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Individual Value-B/Button_Next'))
WebUI.delay(1)

//Survey Page 2
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_06 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_07 - DD'))
WebUI.scrollToElement(findTestObject('Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_08 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_09 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_10 - DD'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Individual Value-B/Button_Next'))
WebUI.delay(1)

//Survey Page 3
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_11 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_12 - DD'))
WebUI.scrollToElement(findTestObject('Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_13 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_14 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_15 - DD'))
WebUI.delay(1)

//Button Next
WebUI.click(findTestObject('Individual Value-B/Button_Next'))
WebUI.delay(1)

//Survey Page 4
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_16 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_17 - DD'))
WebUI.scrollToElement(findTestObject('Leadership/Button_Next'), 3)
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_18 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_19 - DD'))
WebUI.click(findTestObject('Individual Value-B/RadioButton_Question_No_20 - DD'))
WebUI.delay(1)

//Button Submit
WebUI.click(findTestObject('Individual Value-B/Button_Submit'))
WebUI.takeScreenshot()
WebUI.delay(2)

//Button Home
WebUI.click(findTestObject('Individual Value-B/Button_Home'))
WebUI.delay(3)
WebUI.closeBrowser()

