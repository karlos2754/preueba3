import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Gmail {
	@Given("El usuario navega para iniciar secion")
	def usuarioNavegaParaIniciarSecion(){
		println(" \n El usuarioNavegaParaIniciarSecion")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\Login.png")
	}

	@When("Usuario ingresa (.*) y (.*)")
	def UsuarioIngresa(String correo, String contraseña) {
		println ("\n El UsuarioIngresa")
		println ("\n correo : "+correo)
		println ("\n contraseña : "+contraseña)
		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), correo)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), contraseña)
	}
	@And("Click en boton siguiente")
	def botonSiguiente(){
		println ("\n Click botonSiguiente")
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\log.png")
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))
	}


	@Then("El verifica pagina principal")
	def VerificaPaginaDePrincipal(){
		println ("\n El VerificaPaginaPrincipal")
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\cita.png")
	}
	@When ("Selecciona lugar cita medica")
	def CitaMedica(){
		println ("\n la CitaMedica ")
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\Lugar.png")
	}
	@When("Informa fecha")
	def InfoFecha(){
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_21'))
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\Fecha.png")
	}
	@When("Ingresa Comentario (.*)")
	def IngreComent(String comentario){
		println ("\n El IngreComent")
		println ("\n comentario : "+comentario)
		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), comentario)
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\Fin.png")
	}
	@And("Click en boton Book Appointment")
	def botonBookAppointment(){
		println ("\n Click botonBookAppointment")
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))
		WebUI.takeScreenshot("C:\\Users\\TestingIT_5\\Katalon Studio\\Gmail\\Screnshot\\targets\\inicio\\Resultado.png")
		WebUI.closeBrowser()
	}

}
