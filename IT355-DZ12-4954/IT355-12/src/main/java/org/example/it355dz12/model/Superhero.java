package org.example.it355dz12.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "superhero")
public class Superhero {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "superhero_name")
    private String superHeroName;

    @Basic
    @Column(name = "full_name")
    private String fullName;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "gender_id", nullable = false)
    private Gender gender;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "eye_colour_id", nullable = false)
    private Colour eyeColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "hair_colour_id", nullable = false)
    private Colour hairColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "skin_colour_id", nullable = false)
    private Colour skinColour;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "alignment_id", nullable = false)
    private Alignment alignment;

    @Basic
    @Column(name = "height_cm")
    private int heightCm;

    @Basic
    @Column(name = "weight_kg")
    private int weightKg;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hero_power",
            joinColumns = @JoinColumn(name = "hero_id"),
            inverseJoinColumns = @JoinColumn(name = "power_id"))
    private List<Superpower> superpower = new ArrayList<>();

    public Superhero() {
    }

    public Superhero(int id, String superHeroName, String fullName, Gender gender, Colour eyeColour, Colour hairColour, Colour skinColour, Race race, Publisher publisher, Alignment alignment, int heightCm, int weightKg, List<Superpower> superpower) {
        this.id = id;
        this.superHeroName = superHeroName;
        this.fullName = fullName;
        this.gender = gender;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.skinColour = skinColour;
        this.race = race;
        this.publisher = publisher;
        this.alignment = alignment;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.superpower = superpower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Colour getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(Colour eyeColour) {
        this.eyeColour = eyeColour;
    }

    public Colour getHairColour() {
        return hairColour;
    }

    public void setHairColour(Colour hairColour) {
        this.hairColour = hairColour;
    }

    public Colour getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(Colour skinColour) {
        this.skinColour = skinColour;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public List<Superpower> getSuperpower() {
        return superpower;
    }

    public void setSuperpower(List<Superpower> superpower) {
        this.superpower = superpower;
    }
}
