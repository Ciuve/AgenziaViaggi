package it.ciuverca.agenziaviaggi.Entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cognome;
    private Date dataNascita;

    @OneToMany(mappedBy = "cliente")
    private Set<Prenotazioni> prenotazione;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
