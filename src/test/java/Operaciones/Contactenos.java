package Operaciones;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.SeleniumOpereaciones;



public class Contactenos extends SeleniumOpereaciones {
	
//Funciones aplicadas para el segundo caso de pruebas

	By Contactenos = By.xpath("//*[@id=\"menu-item-282\"]/a");
	By Framer = By.xpath("//*[@id=\"0100fdf3-ff82-446d-8be0-063723163749\"]");
	By Interes = By.xpath("//*[@id=\"d5a52985-66b2-ea11-a812-000d3ac166cd\"]");
	By Nombre = By.xpath("//*[@id=\"3f746946-34b4-442c-a677-e232cdd2bc40\"]");
	By Apellido = By.xpath("//*[@id=\"e1dfc514-f301-4cb2-855a-4c8fa8331207\"]");
	By Correo = By.xpath("//*[@id=\"7f685ebb-7c54-4cff-a1bc-772562d25c38\"]");
	By Ciudad = By.xpath("//*[@id=\"a70f881b-ef95-ea11-a812-000d3ac166cd\"]");
	By Empresa = By.xpath("//*[@id=\"ac9ddb60-616f-4f12-b4e2-9202f688ed2f\"]");
	By Celular = By.xpath("//*[@id=\"08362b8f-b4ff-4d47-bc08-9b25a7e81e95\"]");
	By Desc = By.xpath("//*[@id=\"2048d706-a094-ea11-a812-000d3ac166cd\"]");
	By Politica = By.xpath("//*[@id=\"7e58cb40-5591-ea11-a811-000d3ac166cd\"]");
	By BtnEnviar = By.xpath("/html/body/div[1]/div/form/div/div[6]/div/div[2]/div/button");
	By Mensaje = By.xpath("/html/body/div[1]/div/div/div/div");
	By DataList = By.xpath("//*[@id=\"list-a70f881b-ef95-ea11-a812-000d3ac166cd\"]/option");	                          



	public void AbrirNavegador(String url) {
		try {
			this.chromeConnection();
			visit(url);
			driver.manage().window().maximize();
		}catch(Exception ex) {
			System.out.println("Error al abrir el navegador: "+ex);
		}
	}
	
	public void SeleccionarSeccion() {
		try {
			click(Contactenos);
		}catch(Exception ex){
			System.out.println("Error en el click: "+ex);
		}
		
	}
	
	public void Formulario() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Iframe(Framer);
			ListaBox(1,Interes);
			Input("Test",Nombre);
			Input("Automation",Apellido);
			Input("Test2@gmail.com",Correo);
			Input("Cali",Ciudad);
			DataList(Ciudad,DataList);
			Input("Test",Empresa);
			Input("3100000000",Celular);
			Input("Pruebas de automatizacion",Desc);
			click(Politica);
			
		}catch(Exception ex){
			System.out.println("Error con el formulario: "+ex);
		}

	}
	

	public void Enviar() {
		try {
			click(BtnEnviar);
		}catch(Exception ex) {
			System.out.println("Error al enviar el formulario: "+ex);
		}
		
	}
	
	public void Mensaje() {
		
		String mensaje = getText(Mensaje);
		if(mensaje != null) {
			System.out.println("Datos Enviados");
		}
		else {
			System.out.println("No se encontro mensaje");
		}
	}


}
