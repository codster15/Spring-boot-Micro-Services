package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/test")
    public String loadIndex (Model model){
        String text = "welcome to the page";

        int a = 10 / 0;

        model.addAttribute("msg" , text );
        return "index";
    }
}
