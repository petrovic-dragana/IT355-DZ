package org.example.it355dz07.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jelo")
public class Jelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naziv;
    private String opis;
    private double cena;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_restorana", nullable = false)
    private Restoran restoran;

    public Jelo() {
    }

    public Jelo(Long id, String naziv, String opis, double cena, Restoran restoran) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.cena = cena;
        this.restoran = restoran;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

}
