package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
    @GetMapping("/msg")
    public String loadIndex (Model model){

        String text = "App is Running";



        model.addAttribute("msg" , text );
        return "index";
    }
}
