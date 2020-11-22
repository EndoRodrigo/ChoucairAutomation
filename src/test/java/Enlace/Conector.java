package Enlace;


import Operaciones.Contactenos;
import Operaciones.Empleo;
import Operaciones.Formacion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conector {
	Contactenos ctt = new Contactenos();
	Empleo emp = new Empleo();
	//conectores del primer caso de pruebas
	
	@Given("^Acceder a la pagina principal de choucair$")
	public void acceder_a_la_pagina_principal_de_choucair() {
	    // Write code here that turns the phrase above into concrete actions
	    ctt.AbrirNavegador("https://www.choucairtesting.com/");
	}


	@When("^Acceder a la seccion contactenos$")
	public void acceder_a_la_seccion_contactenos() {
	    // Write code here that turns the phrase above into concrete actions
	    ctt.SeleccionarSeccion();
	}

	@When("^Diligenciar el formulario$")
	public void diligenciar_el_formulario() {
	    // Write code here that turns the phrase above into concrete actions
	    ctt.Formulario();
	}

	@When("^Enviar la solicitud con todos los datos reuqeridos$")
	public void enviar_la_solicitud_con_todos_los_datos_reuqeridos() {
	    // Write code here that turns the phrase above into concrete actions
	   ctt.Enviar();
	}

	@Then("^Validar mensaje del envio la informacion$")
	public void validar_mensaje_del_envio_la_informacion() {
	    // Write code here that turns the phrase above into concrete actions
	    ctt.Mensaje();
	} 

    //Conecatores del segundo caso de prueba
	
	@Given("^Acceder a al link de la pagina de choucair$")
	public void acceder_a_la_link_de_la_pagina_de_choucair() {
	    // Write code here that turns the phrase above into concrete actions
	    emp.AbrirNavegador("https://www.choucairtesting.com/");
	}
	
	@When("^Acceder a la seccion empleo$")
	public void acceder_a_la_seccion_empleo() {
	    // Write code here that turns the phrase above into concrete actions
		emp.selecionarSeccion();
	}

	@When("^filtar ofertas disponibles$")
	public void filtar_ofertas_disponibles() {
	    // Write code here that turns the phrase above into concrete actions
		emp.BuscarEmpleo();
	}

	@When("^selecionar un empleo$")
	public void selecionar_un_empleo() {
	    // Write code here that turns the phrase above into concrete actions
		emp.SelecionarEmpelo();
	}

	@Then("^Validar empleo solicitad$")
	public void validar_empleo_solicitad() {
	    // Write code here that turns the phrase above into concrete actions
		emp.ValidarEmpleo();
	}


}
