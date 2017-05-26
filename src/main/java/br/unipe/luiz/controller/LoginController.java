package br.unipe.luiz.controller;

import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.unipe.luiz.dao.UsuarioDao;
import br.unipe.luiz.model.UsuarioModel;
@Controller
@RequestMapping("/contato")
public class LoginController {
	
	
	@Autowired
	private UsuarioDao repositorio;
	
	@RequestMapping(method=RequestMethod.GET, value={"/logout",})
	public String logout(ModelMap map, HttpSession session){
		session.invalidate();
		map.addAttribute("usuario", new UsuarioModel());
		return "login";
	}
	
	public UsuarioModel efetuarLogin(String login, String senha){
		Query query = repositorio.createQuery("select u from Usuario u where u.login = :login and u.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		List<UsuarioModel> usuarios  = query.getResultList();
		if(usuarios != null && !usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;
	}

	@RequestMapping(method=RequestMethod.POST, value="/efetuarLogin")
	public String login(@ModelAttribute("usuario") @Valid UsuarioModel usuario, ModelMap map, HttpSession session, BindingResult result){
		if(result.hasErrors()){
			map.addAttribute("usuario", usuario);
			return "login";
		}
		
				efetuarLogin(usuario.getLogin(), usuario.getSenha());
		

		session.setAttribute("usuario", usuario);
		return "/contato/listacontatos";
	}



}