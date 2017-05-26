package br.unipe.luiz.boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "br.unipe.luiz.model" })
@EnableJpaRepositories(basePackages = { "br.unipe.luiz.dao" })
@ComponentScan(basePackages = {"br.unipe.luiz.controller", "br.unipe.luiz.service"})
public class LoadPackageConfig {

}
