package br.unipe.luiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.unipe.luiz.dao.ContatoDao;
import br.unipe.luiz.model.ContatoModel;
@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	
	@Autowired
	private ContatoDao repositorio;
	
	@RequestMapping(path="/form", method=RequestMethod.GET)	
	public String form(Model model) {
		model.addAttribute("contato", new ContatoModel());
		return "/contato/contatoform";
	}

	@RequestMapping(path="/consultar",method=RequestMethod.GET)
	@ResponseBody
	public String consultar(
			@PathVariable(name="id") int id){		
		
		ContatoModel contato = repositorio.findOne(id);
		if(contato!=null) 
			return contato.toString();
		
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
	public String incluir(ContatoModel contato){
		repositorio.save(contato);
		return "Sucesso";
	}
	
	@RequestMapping(path={"/listar","/"} , method=RequestMethod.GET)
	public List<ContatoModel> listar(){
		List<ContatoModel> lista = 
				repositorio.findAll();
		return lista;
	}
	
		

	public ContatoDao getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(ContatoDao repositorio) {
		this.repositorio = repositorio;
	}



}