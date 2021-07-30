package com.company.vehiles;

import com.company.professions.Driver;

import java.util.Objects;

public class Car {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && name.equals(car.name) && levelauto.equals(car.levelauto) && driver.equals(car.driver) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, levelauto, weight, driver, engine);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelauto() {
        return levelauto;
    }

    public void setLevelauto(String levelauto) {
        this.levelauto = levelauto;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", levelauto='" + levelauto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    String levelauto;

    public Car(String name, String levelauto, int weight, Driver driver, String engine) {
        this.name = name;
        this.levelauto = levelauto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    int weight;
    Driver driver;
    String engine;

    public String stop(){
        return "STOP";
    }

    public void setDriver(String john) {
    }
}
