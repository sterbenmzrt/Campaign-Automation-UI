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

Mobile.startApplication(GlobalVariable.base_url, true)

Mobile.tap(findTestObject('Test Object Spy/android.widget.TextView - MASUK'), 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.EditText - Nama pengguna atau Email'), 
    'ruditest', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.EditText - Kata sandi'), 
    'AqcDRHpy+ygNFLHeKvGdeQ==', 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Masuk (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 
    0)

Mobile.verifyElementText(findTestObject('Test Object Spy/New Folder/android.widget.TextView - Hai, ruditest'), 'Hai, ruditest!')

Mobile.takeScreenshot()

Mobile.closeApplication()

