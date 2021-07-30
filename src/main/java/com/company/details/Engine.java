package com.company.details;

import java.util.Objects;

public class Engine {
    String manufacturer;
    int power;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && manufacturer.equals(engine.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, power);
    }

    public Engine() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", power=" + power +
                '}';
    }

    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String start() {
        return "GO";
    }

    public void getManufacturer(String france) {
    }
}
