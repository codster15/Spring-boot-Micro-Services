package in.deepak;

import org.springframework.stereotype.Component;


@Component
public class chip {


    public chip() {

        System.out.println("chit :: constructor");
    }

    public String chipType (){

        System.out.println("32-bit");
        return "32-bit";
    }

}
