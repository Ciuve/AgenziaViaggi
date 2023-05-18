package it.ciuverca.agenziaviaggi.services;

import it.ciuverca.agenziaviaggi.Entities.Cliente;
import it.ciuverca.agenziaviaggi.Entities.Prenotazioni;
import it.ciuverca.agenziaviaggi.Entities.Utente;
import it.ciuverca.agenziaviaggi.Entities.Viaggio;
import it.ciuverca.agenziaviaggi.repos.ClienteDao;
import it.ciuverca.agenziaviaggi.repos.PrenotazioniDao;
import it.ciuverca.agenziaviaggi.repos.UtenteDao;
import it.ciuverca.agenziaviaggi.repos.ViaggioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViaggioServiceImpl implements ViaggioService{
    @Autowired
    private ViaggioDao viaggioDao;

    @Autowired
    private ClienteDao clienteDao;

    @Autowired
    private UtenteDao utenteDao;

    @Autowired
    private PrenotazioniDao prenotazioniDao;
    @Override
    public List<Viaggio> getViaggio() {
        return viaggioDao.findAll();
    }

    @Override
    public Viaggio getViaggioById(int id) {
        return viaggioDao.getReferenceById(id);
    }

    @Override
    public Viaggio addViaggio(Viaggio v) {
        return viaggioDao.save(v);
    }

    @Override
    public List<Utente> getUtente() {
        return utenteDao.findAll();
    }

    @Override
    public Utente getUtenteById(int id) {
        return utenteDao.getReferenceById(id);
    }

    @Override
    public Utente addUtente(Utente u) {
        return utenteDao.save(u);
    }

    @Override
    public List<Prenotazioni> getPrenotazioni() {
        return prenotazioniDao.findAll();
    }

    @Override
    public Prenotazioni getPrenotazioniById(int id) {
        return prenotazioniDao.getReferenceById(id);
    }

    @Override
    public Prenotazioni addPrenotazioni(Prenotazioni prenotazioni) {
        return prenotazioniDao.save(prenotazioni);
    }

    @Override
    public List<Cliente> getCliente() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente getClienteById(int id) {
        return clienteDao.getReferenceById(id);
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        return clienteDao.save(cliente);
    }
}
