package it.ciuverca.agenziaviaggi.repos;

import it.ciuverca.agenziaviaggi.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente,Integer> {

}
