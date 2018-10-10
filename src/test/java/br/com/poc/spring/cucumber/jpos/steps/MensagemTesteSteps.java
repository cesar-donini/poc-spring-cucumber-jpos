package br.com.poc.spring.cucumber.jpos.steps;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOServer;
import org.jpos.iso.ISOSource;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.poc.spring.cucumber.jpos.PocSpringCucumberJposApplicationTests;
import cucumber.api.java.pt.Dado;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class MensagemTesteSteps extends PocSpringCucumberJposApplicationTests {

	@Autowired
	private ISOServer isoServer;
	
	@Dado("^que envio uma mensagem de teste$")
	public void que_envio_uma_mensagem_de_teste() {

	}
	
	@Dado("^devo loggar$")
	public void devo_loggar() throws InterruptedException {
		CountDownLatch count = new CountDownLatch(1);
		isoServer.addISORequestListener(new ISORequestListener() {
			@Override
			public boolean process(ISOSource source, ISOMsg m) {
				System.out.println(m);
				count.countDown();
				assertTrue(true);
				return false;
			}
		});
		count.await(20, TimeUnit.SECONDS);
	}
}
