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

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username (3)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password (3)'), 'NHDoOI2n465h6BZy9GK9+g==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_LoginUsername  AdminPassword  admin123U_880e7e'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OrangeHRM/div_LoginUsername  AdminPassword  admin123U_880e7e'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password (3)'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login (3)'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username (3)'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password (3)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Time'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_View'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Submitted'), 'Submitted')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Actions Performed on the Timesheet'), 'Actions Performed on the Timesheet')

WebUI.closeBrowser()

