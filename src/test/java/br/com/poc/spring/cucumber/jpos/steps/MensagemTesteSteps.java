package br.com.poc.spring.cucumber.jpos.steps;

import org.jpos.iso.ISOServer;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.poc.spring.cucumber.jpos.PocSpringCucumberJposApplicationTests;
import cucumber.api.java.pt.Dado;

public class MensagemTesteSteps extends PocSpringCucumberJposApplicationTests {

	@Autowired
	private ISOServer isoServer;
	
	@Dado("^que envio uma mensagem de teste$")
	public void que_envio_uma_mensagem_de_teste() {
		System.out.println("Servidor: " + isoServer);
	}
	
	@Dado("^devo loggar$")
	public void devo_loggar() {
		System.out.println("Loggando");
	}
}
