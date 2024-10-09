package in.deepak.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppController {




    @GetMapping("/")
    public String loadIndex (Model model){
         String text = "welcome to the page";

         int a = 10 / 0;

        model.addAttribute("msg" , text );
        return "index";
    }




}
