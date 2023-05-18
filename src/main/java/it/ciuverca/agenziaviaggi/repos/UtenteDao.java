package it.ciuverca.agenziaviaggi.repos;

import it.ciuverca.agenziaviaggi.Entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteDao extends JpaRepository<Utente, Integer> {

}
