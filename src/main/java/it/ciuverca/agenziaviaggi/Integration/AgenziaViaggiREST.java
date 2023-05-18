package it.ciuverca.agenziaviaggi.Integration;

import it.ciuverca.agenziaviaggi.Entities.Cliente;
import it.ciuverca.agenziaviaggi.Entities.Viaggio;
import it.ciuverca.agenziaviaggi.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class AgenziaViaggiREST {

    @Autowired
    ViaggioService service;

    @GetMapping("clienti")
    public List<Cliente> getClienti(){
        return service.getCliente();
    }
    @GetMapping("viaggi")
    public List<Viaggio> getViaggi(){
        return service.getViaggio();
    }
}
