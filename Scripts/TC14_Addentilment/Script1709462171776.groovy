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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username (14)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password (14)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login (14)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Leave (2)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Entitlements'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Add Entitlements'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input (1)'), 'a')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select -- (2)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_2024-01-01 - 2025-02-02'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_2024-01-01 - 2025-02-02'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Entitlement_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Entitlement_oxd-input oxd-input--focu_c7cc14'), 'aaaaa')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save (5)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_2024-01-01 - 2025-02-02'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Entitlement_oxd-input oxd-input--focus'), '12')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save (5)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Confirm'))

WebUI.closeBrowser()

