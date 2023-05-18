package it.ciuverca.agenziaviaggi.services;

import it.ciuverca.agenziaviaggi.Entities.Viaggio;

import java.util.List;

public interface ViaggioService {
    List<Viaggio> getViaggio();
    Viaggio getViaggioById(int id);
    Viaggio addViaggio(Viaggio v);


}
