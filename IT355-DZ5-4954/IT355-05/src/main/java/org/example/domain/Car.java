package org.example.domain;

public class Car {
    private String mark,model,milage,engine;

    public Car() {
    }


    public Car(String mark, String model, String milage, String engine) {
        this.mark = mark;
        this.model = model;
        this.milage = milage;
        this.engine = engine;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", milage='" + milage + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
