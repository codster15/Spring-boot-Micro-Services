package com.deepak;
public class Diesal implements IEngine {
    Diesal(){
        System.out.println("Diesal");
    }
    @Override
    public int StartEngine() {
        System.out.println("Diesal Engine Starts");
        return 1;
    }



    }
