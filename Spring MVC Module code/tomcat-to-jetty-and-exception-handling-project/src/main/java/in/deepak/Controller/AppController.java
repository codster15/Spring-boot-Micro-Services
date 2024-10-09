package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


    @GetMapping("/")
    public String loadIndex (Model model){
         String text = "welcome to the page";
        model.addAttribute("msg" , text );
        return "index";
    }




}
