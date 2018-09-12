package br.com.poc.spring.cucumber.jpos.configuration;

import java.io.IOException;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOServer;
import org.jpos.iso.ServerChannel;
import org.jpos.iso.channel.XMLChannel;
import org.jpos.iso.packager.XMLPackager;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerIso8583Config {

	@Bean
	public Logger getLogger() {
		Logger logger = new Logger();
		logger.addListener(new SimpleLogListener(System.out));
		return logger;
	}

	@Bean
	public ServerChannel getServerChannel() throws IOException, ISOException {
		ServerChannel channel = new XMLChannel(new XMLPackager());
		((LogSource) channel).setLogger(getLogger(), "channel");
		return channel;
	}

	@Bean
	public ISOServer getISOServer() throws IOException, ISOException {
		ISOServer server = new ISOServer(8000, getServerChannel(), null);
		server.setLogger(getLogger(), "server");
		return server;
	}

}
