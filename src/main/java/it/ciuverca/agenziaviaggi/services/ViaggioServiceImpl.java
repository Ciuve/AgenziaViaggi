package it.ciuverca.agenziaviaggi.services;

import it.ciuverca.agenziaviaggi.Entities.Viaggio;
import it.ciuverca.agenziaviaggi.repos.ViaggioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViaggioServiceImpl implements ViaggioService{
    @Autowired
    private ViaggioDao dao;
    @Override
    public List<Viaggio> getViaggio() {
        return dao.findAll();
    }

    @Override
    public Viaggio getViaggioById(int id) {
        return dao.getReferenceById(id);
    }

    @Override
    public Viaggio addViaggio(Viaggio v) {
        return dao.save(v);
    }
}
