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
    private String descrizione;

    private int durataGiorni;
    private double prezzoPersona;
    private String foto; //Stringa che contiene il path della foto

    public Viaggio(int id, String destinazione, String descrizione, int durataGiorni, double prezzoPersona, String foto) {
        this.id = id;
        this.destinazione = destinazione;
        this.descrizione = descrizione;
        this.durataGiorni = durataGiorni;
        this.prezzoPersona = prezzoPersona;
        this.foto = foto;
    }

    public Viaggio() {

    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

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
