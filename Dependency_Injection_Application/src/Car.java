

public class Car {

    private IfEngine eng;

    Car(IfEngine eng){
        this.eng = eng;

    }

    void StartEng(){

        int start = eng.start();

        if(start >= 1){
            System.out.println("Journey Started");
        } else{
            System.out.println("Problem Occured");
        }



    }


}
