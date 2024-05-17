package com.domaci.osmi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games_city")
public class GamesCity {
    @Id
    private Integer id;
    private Integer gamesId;
    private Integer cityId;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGamesId() {
        return gamesId;
    }

    public void setGamesId(Integer gamesId) {
        this.gamesId = gamesId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
