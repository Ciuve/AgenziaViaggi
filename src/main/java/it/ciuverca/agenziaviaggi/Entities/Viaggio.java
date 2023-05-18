package it.ciuverca.agenziaviaggi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destinazione;
    private int durataGiorni;
    private double prezzoPersona;
    private String foto;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public int getDurataGiorni() {
        return durataGiorni;
    }

    public void setDurataGiorni(int durataGiorni) {
        this.durataGiorni = durataGiorni;
    }

    public double getPrezzoPersona() {
        return prezzoPersona;
    }

    public void setPrezzoPersona(double prezzoPersona) {
        this.prezzoPersona = prezzoPersona;
    }
}
