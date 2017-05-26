package br.unipe.luiz.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	 @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {
		 	//Autoriza todas as requisições
	        //httpSecurity.authorizeRequests().antMatchers("/").permitAll();
	 
	        httpSecurity
	         .formLogin()
	         .loginPage("/login.html")
	         .failureUrl("/login-error.html")
	       .and()
	         .logout()
	         .logoutSuccessUrl("/index.html");
	 }
}