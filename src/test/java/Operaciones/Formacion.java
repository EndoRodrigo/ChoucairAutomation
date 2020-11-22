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

public class Formacion extends SeleniumOpereaciones {
	
//Funciones aplicadas para el primer caso de pruebas

	By Formacion = By.xpath("//*[@id=\"menu-item-1876\"]/a");
	By Framer = By.xpath("//*[@id=\"78ec0790-ded5-403d-8c22-917eeeebe6b4\"]");
	By Interes = By.xpath("//*[@id=\"84027974-bd93-ea11-a812-000d3ac1884e\"]");
	By Nombre = By.xpath("//*[@id=\"3f746946-34b4-442c-a677-e232cdd2bc40\"]");
	By Apellido = By.xpath("//*[@id=\"e1dfc514-f301-4cb2-855a-4c8fa8331207\"]");
	By Correo = By.xpath("//*[@id=\"7f685ebb-7c54-4cff-a1bc-772562d25c38\"]");
	By Ciudad = By.xpath("//*[@id=\"a70f881b-ef95-ea11-a812-000d3ac166cd\"]");
	By Empresa = By.xpath("//*[@id=\"ac9ddb60-616f-4f12-b4e2-9202f688ed2f\"]");
	By Celular = By.xpath("//*[@id=\"08362b8f-b4ff-4d47-bc08-9b25a7e81e95\"]");
	By Desc = By.xpath("//*[@id=\"2048d706-a094-ea11-a812-000d3ac166cd\"]");
	By Politica = By.xpath("//*[@id=\"7e58cb40-5591-ea11-a811-000d3ac166cd\"]");
	By BtnEnviar = By.xpath("/html/body/div[1]/div/form/div/div/div[6]/div/div[2]");
	By Mensaje = By.xpath("/html/body/div[1]/div/div/div/div");
	By DataList = By.xpath("//*[@id=\"list-a70f881b-ef95-ea11-a812-000d3ac166cd\"]/option");	                          


	private String text = "";

	public void AbrirNavegador(String url) {
		this.chromeConnection();
		visit(url);
		driver.manage().window().maximize();
	}
	
	public void selecionarSeccion() {
		click(Formacion);
	}
	
	public void Formulario() {
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
		

	}
	

	public void Enviar() {
		click(BtnEnviar);
	}
	
	public void Mensaje(String msj) {
		
		String mensaje = getText(Mensaje);
		System.out.println(mensaje);
		System.out.println(msj);
		if(msj.equals(mensaje)) {
			System.out.println("Inscripcion Exitosa");
		}
		else {
			
		}
	}


}
