package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @GetMapping("/")
    public String loadIndex (Model model){
         String text = "welcome to the page";
        model.addAttribute("msg" , text );
        return "index";
    }

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome (Model model){
        String text = "hello";
        model.addAttribute("msg" , text );
        return "how are you";
    }


}
