package br.edu.ifms.ifmaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.ifmaker.entities.Integrante;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Long>{

}
