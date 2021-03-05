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

WebUI.setText(findTestObject('Object Repository/Survey Value-A/input_person_txtUsername'), 'KEG2200')

WebUI.setEncryptedText(findTestObject('Object Repository/Survey Value-A/input_lock_txtPassword'), 'yqhJ93vELC0=')

WebUI.click(findTestObject('Object Repository/Survey Value-A/a_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/a_VALUE_-_A'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_1AFD1193PEMBUKASEBERAPA__3fb393'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_1AMG1_091c92'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_1FEL1806PEMBUKASEBERAPA_SERIN_990d62'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_1HSG2275PEMBUKASEBERAPA_0a5846'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_1PSP0399PEMBU_07eaf5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_1SNG0014PEMBUKASEBE_1e940f'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_2AFD1193UTAMAYBS_BEKERJA_3e2200'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_2AMG1_85d781'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_2FEL1806UTAMAYBS_BEKERJA_SESU_c11a66'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_2HSG2275UTAMAYBS_BEKERJ_51b2cb'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_2PSP0399UTAMA_e5e1c6'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_2SNG0014UTAMAYBS_BE_cd6891'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_3AFD1193UTAMAYBS_BERTANG_d85a78'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_3AMG1_b5461a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_3FEL1806UTAMAYBS_BERTANGGUNG__94de98'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_3HSG2275UTAMAYBS_BERTAN_2846b4'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_3PSP0399UTAMA_4743e9'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_3SNG0014UTAMAYBS_BE_f6ee1b'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_4AFD1193UTAMAYBS_MEMILIK_6ec005'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_4AMG1_3c3dd7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_4FEL1806UTAMAYBS_MEMILIKI_SEM_47af1a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_4HSG2275UTAMAYBS_MEMILI_630a33'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_4PSP0399UTAMA_8ab7cd'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_4SNG0014UTAMAYBS_ME_fdacfe'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_5AFD1193UTAMAYBS_MEMAHAM_e7dbcb'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_5AMG1_f39818'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_5FEL1806UTAMAYBS_MEMAHAMI_ATA_a6bfd9'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_5HSG2275UTAMAYBS_MEMAHA_c0622f'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_5PSP0399UTAMA_8c9807'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_5SNG0014UTAMAYBS_ME_09523a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_6AFD1193UTAMAYBS_BEKERJA_f04e95'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_6AMG1_842c15'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_6FEL1806UTAMAYBS_BEKERJA_SESU_18528c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_6HSG2275UTAMAYBS_BEKERJ_4b2b77'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_6PSP0399UTAMA_253e5b'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_6SNG0014UTAMAYBS_BE_b9ba43'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_7AFD1193UTAMAYBS_MAMPU_M_b3aa0e'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_7AMG1_7b9b6f'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_7FEL1806UTAMAYBS_MAMPU_MEMBAN_ba6126'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_7HSG2275UTAMAYBS_MAMPU__d00169'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_7PSP0399UTAMA_651064'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_7SNG0014UTAMAYBS_MA_f46486'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_8AFD1193UTAMAYBS_DAPAT_M_917b45'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_8AMG1_76f0b5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_8FEL1806UTAMAYBS_DAPAT_MELAKU_0f6e6f'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_8HSG2275UTAMAYBS_DAPAT__18e76c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_8PSP0399UTAMA_2e3301'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_8SNG0014UTAMAYBS_DA_bc8984'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_9AFD1193UTAMAYBS_MENUNJU_35df31'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_9AMG1_4964be'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_9FEL1806UTAMAYBS_MENUNJUKKAN__7b9cd1'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_9HSG2275UTAMAYBS_MENUNJ_64aab7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_9PSP0399UTAMA_669511'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_9SNG0014UTAMAYBS_ME_5da13c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_10AFD1193UTAMAYBS_DAPAT__79b387'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_10AMG_f3af58'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_10FEL1806UTAMAYBS_DAPAT_MENCI_627e0d'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_10HSG2275UTAMAYBS_DAPAT_cddeb5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_10PSP0399UTAM_f24b21'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_10SNG0014UTAMAYBS_D_f3851c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_11AFD1193UTAMAKEBERADAAN_d0c169'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_11AMG_a7e0bf'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_11FEL1806UTAMAKEBERADAAN_YBS__a63251'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_11HSG2275UTAMAKEBERADAA_4aeb6b'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_11PSP0399UTAM_f5e3c7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_11SNG0014UTAMAKEBER_d716b8'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_12AFD1193UTAMAYBS_TIDAK__ffaf55'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_12AMG_f675a7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_12FEL1806UTAMAYBS_TIDAK_PUAS__986de7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_12HSG2275UTAMAYBS_TIDAK_05d7be'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_12PSP0399UTAM_9fa619'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_12SNG0014UTAMAYBS_T_848dc4'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_13AFD1193UTAMAYBS_MEMILI_087aa5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_13AMG_6b409a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_13FEL1806UTAMAYBS_MEMILIKI_SE_37aa5a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_13HSG2275UTAMAYBS_MEMIL_14802b'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_13PSP0399UTAM_246697'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_13SNG0014UTAMAYBS_M_1148b7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_14AFD1193UTAMAYBS_TIDAK__253504'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_14AMG_3af7a7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_14FEL1806UTAMAYBS_TIDAK_PANTA_aaf88a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_14HSG2275UTAMAYBS_TIDAK_e0fbae'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_14PSP0399UTAM_bab280'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_14SNG0014UTAMAYBS_T_8e6297'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_15AFD1193UTAMAYBS_MEMILI_8c91b3'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_15AMG_ba60e0'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_15FEL1806UTAMAYBS_MEMILIKI_KE_2d79e3'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_15HSG2275UTAMAYBS_MEMIL_95fe24'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_15PSP0399UTAM_af5b8b'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_15SNG0014UTAMAYBS_M_ec2434'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_16AFD1193UTAMAYBS_MENJAD_d38a0e'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_16AMG_c84d7d'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_16FEL1806UTAMAYBS_MENJADI_ROL_1aa192'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_16HSG2275UTAMAYBS_MENJA_a73f42'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_16PSP0399UTAM_25903f'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_16SNG0014UTAMAYBS_M_520c69'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_17AFD1193UTAMAYBS_MEMBUA_03bbd9'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_17AMG_6384f4'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_17FEL1806UTAMAYBS_MEMBUAT_REN_3f49d6'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_17HSG2275UTAMAYBS_MEMBU_267253'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_17PSP0399UTAM_3d5c83'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_17SNG0014UTAMAYBS_M_6e598a'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_18AFD1193UTAMAYBS_PROAKT_21c9a7'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_18AMG_601519'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_18FEL1806UTAMAYBS_PROAKTIF_DA_224bcc'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_18HSG2275UTAMAYBS_PROAK_949c6d'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_18PSP0399UTAM_9de1aa'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_18SNG0014UTAMAYBS_P_eddfb5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_19AFD1193UTAMAYBS_BERUSA_fd4e08'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_19AMG_044cec'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_19FEL1806UTAMAYBS_BERUSAHA_ME_f66537'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_19HSG2275UTAMAYBS_BERUS_662174'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_19PSP0399UTAM_4f74ec'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_19SNG0014UTAMAYBS_B_7ed120'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_20AFD1193UTAMAYBS_MELAKU_2f484d'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_20AMG_f42db5'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_20FEL1806UTAMAYBS_MELAKUKAN_M_339a34'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_20HSG2275UTAMAYBS_MELAK_498e21'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_20PSP0399UTAM_9cab5d'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_20SNG0014UTAMAYBS_M_b653de'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_618d3c'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_AZKA FADHLAN_21AFD1193UTAMAYBS_MENGUP_ecc6b2'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_ANGGIE PUSPA ANGGRAENI MARGIONO_21AMG_312358'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_FELICIA_21FEL1806UTAMAYBS_MENGUPAYAKA_adf623'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HENDRY SAGITA_21HSG2275UTAMAYBS_MENGU_049adc'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_PRIHATINI SANDYA PUTRIE_21PSP0399UTAM_d9e2fc'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_21SNG0014UTAMAYBS_M_6968cb'))

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_AZKA FADHLAN_22AFD1193ESSAYTULISKA_fac1ae'), 'Strength = Teliti, Rajin, Disiplin\nWeakness = Tidak ada')

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_ANGGIE PUSPA ANGGRAENI MARGIONO_22_9e4953'), 'Strength = Teliti, Rajin, Disiplin\nWeakness = Tidak ada')

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_FELICIA_22FEL1806ESSAYTULISKAN_STR_2753ae'), 'Strength = Teliti, Rajin, Disiplin\nWeakness = Tidak ada')

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_HENDRY SAGITA_22HSG2275ESSAYTULISK_ffaf88'), 'Strength = Teliti, Rajin, Disiplin\nWeakness = Tidak ada')

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_PRIHATINI SANDYA PUTRIE_22PSP0399E_cfd135'), 'Strength = Teliti, Rajin, Disiplin\nWeakness = Tidak ada')

WebUI.setText(findTestObject('Object Repository/Survey Value-A/textarea_SYAHKIMIKI NGOMAN_22SNG0014ESSAYTU_15be86'), 'Strength = Teliti, Rajin, Disiplin, Akurat\nWeakness = Tidak ada')

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_SYAHKIMIKI NGOMAN_ctl00ContentPlaceHo_cd18e0'))

WebUI.click(findTestObject('Object Repository/Survey Value-A/input_HOME_ctl00ContentPlaceHolder2btnHome'))

WebUI.closeBrowser()

