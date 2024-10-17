package br.com.serratec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.entity.Produto;

public interface ProdutoRepositor extends JpaRepository<Produto, Long> {

}