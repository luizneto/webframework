package br.unipe.luiz.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@EntityScan(basePackages = { "br.unipe.luiz.model" })
@EnableJpaRepositories(basePackages = { "br.unipe.luiz.dao" })
@ComponentScan(basePackages = {"br.unipe.luiz.controller"})
@SpringBootApplication
public class WebConfig {
	static Class[] listaConfiguracao = { LoadPackageConfig.class, WebSecurityConfig.class, WebTemplateConfig.class, WebConfig.class };
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
	}

	public static void main(String[] args) {
	SpringApplication.run(WebConfig.class, args);
	}
}
