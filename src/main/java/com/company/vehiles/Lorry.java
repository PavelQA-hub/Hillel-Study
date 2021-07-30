package com.company.vehiles;

import com.company.professions.Driver;

public class Lorry extends Car{
    int takeWieght;

    public Lorry() {
    }

    public Lorry(String name, String levelauto, int weight, Driver driver, String engine) {
        super(name, levelauto, weight, driver, engine);
    }


    public void canTakeBigWeight(){
        this.canTakeBigWeight();
    }

    public int setWeight() {
        return 1000;
    }
}
