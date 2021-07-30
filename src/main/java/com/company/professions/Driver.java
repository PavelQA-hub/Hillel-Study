package com.company.professions;

import java.util.Objects;

public class Driver extends Person{
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }

    public Driver() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    int experience;

    public String turnRight(){
        return "Turn Right";
    }
    public String turnLeft(){
        return "Turn Left";
    }
}
