package br.unipe.luiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.unipe.luiz.dao.UsuarioDao;
import br.unipe.luiz.model.UsuarioModel;
@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao repositorio;

	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		return "index";
	}

	@RequestMapping(path="/form", method=RequestMethod.GET)	
	public String form(Model model) {
		model.addAttribute("usuario", new UsuarioModel());
		return "/usuario/usuarioform";
	}

	@RequestMapping(path="/consultar",method=RequestMethod.GET)
	@ResponseBody
	public String consultar(
			@PathVariable(name="id") int id){		
		
		UsuarioModel usuario = repositorio.findOne(id);
		if(usuario!=null) 
			return usuario.toString();
		
		return "Sem resultado";
	}
	
	@RequestMapping(path="/remover/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String remover(
			@PathVariable(name="id") int id){				
		repositorio.delete(id);		
		return "Sucesso";
	}
	
	@RequestMapping("/incluir")
	@ResponseBody
	public String incluir(UsuarioModel usuario){
		repositorio.save(usuario);
		return "Sucesso";
	}
	
	@RequestMapping(path={"/listar","/"} , method=RequestMethod.GET)
	public List<UsuarioModel> listar(){
		List<UsuarioModel> lista = repositorio.findAll();
		return lista;
	}
	
	public UsuarioDao getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(UsuarioDao repositorio) {
		this.repositorio = repositorio;
	}



}