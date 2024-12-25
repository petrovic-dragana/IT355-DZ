package org.example.it355dz12.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "publisher_name")
    private String publisherName;

    public Publisher() {
    }

    public Publisher(int id, String publisher) {
        this.id = id;
        this.publisherName = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisherName;
    }

    public void setPublisher(String publisher) {
        this.publisherName = publisher;
    }
}
