package br.com.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.usuario.entidade.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
