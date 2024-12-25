package org.example.it355dz12.model;

import jakarta.persistence.*;

@Entity
@Table(name = "superpower")
public class Superpower {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "power_name")
    private String powerName;

    public Superpower() {
    }

    public Superpower(int id, String powerName) {
        this.id = id;
        this.powerName = powerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }
}
