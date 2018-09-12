package br.com.poc.spring.cucumber.jpos.start;

import javax.annotation.PostConstruct;

import org.jpos.iso.ISOServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerIso8583Starter {

	@Autowired
	private ISOServer isoServer;
	
	@PostConstruct
	public void startServerIso() {
		new Thread(isoServer).start();
	}
	
}
