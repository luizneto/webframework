package br.unipe.luiz.dao;

import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.luiz.model.UsuarioModel;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioModel, Integer>{

	Query createQuery(String string);


}
