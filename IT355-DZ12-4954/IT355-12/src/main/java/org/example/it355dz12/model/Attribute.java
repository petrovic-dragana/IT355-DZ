package org.example.it355dz12.model;

import jakarta.persistence.*;

@Entity
@Table(name = "attribute")
public class Attribute {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "attribute_name")
    private String attributeName;

    public Attribute() {
    }

    public Attribute(int id, String attributeName) {
        this.id = id;
        this.attributeName = attributeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

}
