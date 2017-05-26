package br.unipe.luiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.luiz.model.ContatoModel;

@Repository
public interface ContatoDao extends JpaRepository<ContatoModel, Integer>{

}
