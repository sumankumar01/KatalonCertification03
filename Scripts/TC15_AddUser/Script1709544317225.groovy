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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username (15)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password (15)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login (15)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Admin (1)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select -- (3)'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (2)'), 'Suman')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select -- (3)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 'sumakum')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Enabled_oxd-icon bi-caret-down-fill oxd-s_e5758b'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), '123456')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_StatusEnabled'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 'suman')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'p4y+y39Ir5OmOggM/Oop5A==')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (2)'), 'Suman kumar')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'P22/mDurbpKid2HGFWnkQA==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Weak PasswordFor a strong password, ple_0aa07e'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'p4y+y39Ir5OmOggM/Oop5A==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Weak PasswordFor a strong password, ple_208080'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OrangeHRM/input (2)'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (2)'), 'Suman')

WebUI.doubleClick(findTestObject('Object Repository/Page_OrangeHRM/ul_AdminPIMLeaveTimeRecruitmentMy InfoPerfo_47c612'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'p4y+y39Ir5OmOggM/Oop5A==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Weak PasswordFor a strong password, ple_088247'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save (6)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'p4y+y39Ir5NcrrmrW+3ipg==')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (2)'), 's')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save (6)'))

WebUI.closeBrowser()

