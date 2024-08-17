package com.deepak;

public class car {

    private IEngine eng;

    car () {
        System.out.println("Car :: Constructor");
    }
    public car(IEngine eng) {
        System.out.println("Car:: param - Constructor");
        this.eng = eng;
    }

    public void setEng(IEngine eng) {
        this.eng = eng;

    }

    void processEng (){


        int i = eng.StartEngine();

        if(i > 0){
            System.out.println("Journey Started");
        }else{
            System.out.println("Journey Failed");
        }
    }



}
