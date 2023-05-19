package it.ciuverca.agenziaviaggi.MVC;

import it.ciuverca.agenziaviaggi.Entities.Utente;
import it.ciuverca.agenziaviaggi.Entities.Viaggio;
import it.ciuverca.agenziaviaggi.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AgenziaViaggiMVC {

    @Autowired
    ViaggioService service;


    @GetMapping("viaggi")
    public String getViaggio(Model m){
        m.addAttribute("viaggi", service.getViaggio());
        return "viaggi";
    }

    @PostMapping("viaggi")
    public String addViaggio(Viaggio viaggio){
        service.addViaggio(viaggio);
        return "viaggi";
    }

    @GetMapping("zonaAdmin")
    public String getZonaAdmin(Model m){
        m.addAttribute("zonaAdmin", service.getUtente());
        return "zonaAdmin";
    }
    /*@PostMapping("zonaAdmin")
    public String addZonaAdmin(){
        //service.addUtente(utente);
        return "zonaAdmin";
    }*/
}
