package it.ciuverca.agenziaviaggi.repos;

import it.ciuverca.agenziaviaggi.Entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioniDao extends JpaRepository<Prenotazioni, Integer> {
}
