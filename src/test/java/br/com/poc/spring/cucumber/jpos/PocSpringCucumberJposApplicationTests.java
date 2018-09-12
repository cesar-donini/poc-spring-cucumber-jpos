package br.com.poc.spring.cucumber.jpos;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest(classes = PocSpringCucumberJposApplication.class,
	webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = PocSpringCucumberJposApplication.class)
public class PocSpringCucumberJposApplicationTests {

}
