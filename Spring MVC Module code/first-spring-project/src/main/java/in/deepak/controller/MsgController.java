package in.deepak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {


    @GetMapping("/welcome")
    public ModelAndView getWelcome (){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg" , "Welcome to deepak-It");
        mav.setViewName("message");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreet(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg" , "hi good Morning");
        mav.setViewName("message");
        return mav;
    }

}
