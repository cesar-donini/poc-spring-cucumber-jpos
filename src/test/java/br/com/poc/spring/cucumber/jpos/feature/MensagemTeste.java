package br.com.poc.spring.cucumber.jpos.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@MensagemTeste",
	glue = "br.com.poc.spring.cucumber.jpos.steps", monochrome = true, dryRun = false)
public class MensagemTeste {

}
