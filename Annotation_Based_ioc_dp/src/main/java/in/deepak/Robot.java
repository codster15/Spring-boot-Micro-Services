package in.deepak;

import in.deepak.chip;
import org.springframework.stereotype.Component;

@Component
public class Robot {
                                private chip chipInfo;

                                public Robot(chip chipInfo) {
                                    this.chipInfo = chipInfo;
                                }

                                public Robot (){
                                    System.out.println("RObot ::  Constructor");
                                }



                                public void dowork (){
                                    String type = chipInfo.chipType();

                                    if(type.equals("32-bit")){
                                        System.out.println("Performance is Slow");
                                    }
                                }

}
