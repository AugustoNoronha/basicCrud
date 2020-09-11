package br.com.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.usuario.entidade.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}