package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehiles.Car;
import com.company.vehiles.Lorry;
import com.company.vehiles.SportCar;

public class Main {

    public static void main(String[] args) {
        printInfo();
    }

    private static void printInfo() {
        Driver driver = new Driver();
        driver.setName("John");
        driver.setExperience(10);
        System.out.println("Car driver is " + driver.getName() + ", driver experience " + driver.getExperience() + " years");

        Car car = new Car();
        car.setName("Lada");
        car.setWeight(1500);
        car.setDriver("John");
        car.setEngine("Diesel");
        System.out.println("Car driver is " + " " + car.getDriver() + " " + car.getEngine() + " " + car.getName() + " " + car.getWeight());

        Engine engine = new Engine();
        engine.setPower(140);
        engine.getManufacturer("France");
        System.out.println("Производитель " + engine.getManufacturer() + "Engien power " + engine.getPower());

        Lorry lorry = new Lorry();
        System.out.println(lorry.setWeight());

        SportCar mustang = new SportCar();
        mustang.setMaxSpeed(300);
        System.out.println(mustang.getMaxSpeed());
    }
}
