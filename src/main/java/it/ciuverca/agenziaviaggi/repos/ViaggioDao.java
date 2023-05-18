package it.ciuverca.agenziaviaggi.repos;

import it.ciuverca.agenziaviaggi.Entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViaggioDao extends JpaRepository<Viaggio,Integer> {

}
