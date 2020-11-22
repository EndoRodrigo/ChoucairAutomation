package Operaciones;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.SeleniumOpereaciones;

public class Empleo extends SeleniumOpereaciones {
	
//Funciones aplicadas para el primer caso de pruebas

	By Empleo = By.xpath("//*[@id=\"menu-item-550\"]/a");
	By keyworks = By.xpath("//*[@id=\"search_keywords\"]");
	By locacion = By.xpath("//*[@id=\"search_location\"]");
	By BtnEnviar = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input");
    By EmpleoList = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[2]/a/div[1]/h3");                    
    By EmpleoOferta = By.xpath("//*[@id=\"post-9350\"]/header/h1");

	private String text = "";

	public void AbrirNavegador(String url) {
		try {
			this.chromeConnection();
			visit(url);
			driver.manage().window().maximize();
		}catch(Exception ex) {
			System.out.println("Error al cargar la pagina: "+ex);
		}
	}
	
	public void selecionarSeccion() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			click(Empleo);
		}catch(Exception ex){
			System.out.println("Error al dar clic en la seccion empleo: "+ex);
		}
		
	}
	
	public void BuscarEmpleo() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Input("Analista",keyworks);
			Input("Bogota",locacion);
		}catch(Exception ex) {
			System.out.println("Error al filtar empleo: "+ex);
		}
		
	}
	

	public void Enviar() {
		try {
			click(BtnEnviar);
		}catch(Exception ex){
			System.out.println("Error oprimir el boton: "+ex);
		}
		
	}
	
	
	public void SelecionarEmpelo() {
		try {
			click(EmpleoList);
		}
		catch(Exception ex) {
			System.out.println("Error al selecionar oferta: "+ex);
		}
		
	}
	
	public void ValidarEmpleo() {
		try {
			String Oferta = getText(EmpleoOferta);

			if(Oferta != null && Oferta != "") {
				System.out.println("Oferta de empleo encontrada: "+Oferta);
			}else {
				System.out.println("No se encontro oferta de empleo");
			}
		}catch(Exception ex) {
			System.out.println("Error al cargar la pagina: "+ex);
		}
		
	}


}
