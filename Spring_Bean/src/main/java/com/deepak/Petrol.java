package com.deepak;

public class Petrol implements  IEngine{

    Petrol(){
        System.out.println("Petrol");
    }

    @Override
    public int StartEngine() {
        System.out.println("Petrol Engine Starts");

        return 1;
    }
}
