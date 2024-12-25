package org.example.domain;

public class Reservation {
    private User user;
    private Car car;

    public Reservation() {
    }

    public Reservation(User user, Car car) {
        this.user = user;
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
