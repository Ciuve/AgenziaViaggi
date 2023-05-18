package it.ciuverca.agenziaviaggi.Entities;

import jakarta.persistence.*;

enum tipoUtente{
    CLIENTE,
    ADMIN
}
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private tipoUtente tipoUtente;

    public Utente(int id, String username, String password, it.ciuverca.agenziaviaggi.Entities.tipoUtente tipoUtente) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipoUtente = tipoUtente;
    }

    public Utente() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public tipoUtente getTipoUtente() {
        return tipoUtente;
    }

    public void setTipoUtente(tipoUtente tipoUtente) {
        this.tipoUtente = tipoUtente;
    }
}
