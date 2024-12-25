package org.example.it355dz12.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hero_attribute")
public class HeroAttribute {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hero_id", nullable = false)
    private Superhero hero;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "attribute_id", nullable = false)
    private Attribute attribute;

    public HeroAttribute() {
    }

    public HeroAttribute(int id, Superhero hero, Attribute attribute) {
        this.id = id;
        this.hero = hero;
        this.attribute = attribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Superhero getHero() {
        return hero;
    }

    public void setHero(Superhero hero) {
        this.hero = hero;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
