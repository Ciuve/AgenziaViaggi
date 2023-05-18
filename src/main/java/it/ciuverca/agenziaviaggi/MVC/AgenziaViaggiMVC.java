package it.ciuverca.agenziaviaggi.MVC;

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
        m.addAttribute("lista", service.getViaggio());
        return "lista";
    }

    @PostMapping("viaggi")
    public String addViaggio(Viaggio viaggio){
        service.addViaggio(viaggio);
        return "lista";
    }
}
