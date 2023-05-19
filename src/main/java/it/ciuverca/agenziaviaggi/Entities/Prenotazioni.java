package it.ciuverca.agenziaviaggi.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @MapsId("id_cliente")
    @JoinColumn(name = "id_cliente")
    private  Cliente cliente;

    @ManyToOne
    @MapsId("id_viaggio")
    @JoinColumn(name="id_viaggio")
    private Viaggio viaggio;

    private Date dataPrenotazione;
}
