package org.example.it355dz12.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alignment")
public class Alignment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "alignment")
    private String alignment;

    public Alignment() {
    }

    public Alignment(int id, String alignment) {
        this.id = id;
        this.alignment = alignment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
