package it.ciuverca.agenziaviaggi.services;

import it.ciuverca.agenziaviaggi.Entities.Cliente;
import it.ciuverca.agenziaviaggi.Entities.Prenotazioni;
import it.ciuverca.agenziaviaggi.Entities.Utente;
import it.ciuverca.agenziaviaggi.Entities.Viaggio;

import java.util.List;

public interface ViaggioService {
    List<Viaggio> getViaggio();
    Viaggio getViaggioById(int id);
    Viaggio addViaggio(Viaggio v);
    List<Utente> getUtente();
    Utente getUtenteById(int id);
    Utente addUtente(Utente u);
    List<Prenotazioni> getPrenotazioni();
    Prenotazioni getPrenotazioniById(int id);
    Prenotazioni addPrenotazioni(Prenotazioni prenotazioni);
    List<Cliente> getCliente();
    Cliente getClienteById(int id);
    Cliente addCliente(Cliente cliente);
}
