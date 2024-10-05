package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerTest {

    @GetMapping("/")
    private String loadIndex(Model model) {
        model.addAttribute("msg", "welcome to thymeleaf");
        return "index";
    }

    @GetMapping("/msg")
    private String DisplayMsg(Model model) {
        model.addAttribute("msg", "Thank u for using thymeleaf");
        return "thanku";
    }

}


//-------------------------------------------------------------

//package in.deepak.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//// Marks the class as a Spring MVC Controller, making it eligible for request handling
//@Controller
//public class controllerTest {
//
//    // Handles GET requests to the root URL ("/")
//    @GetMapping("/")
//    // Defines a private method to process the request and return the view name
//    private String loadIndex(Model model) {
//
//        // Adds an attribute to the model with the key "msg" and value "welcome to thymeleaf"
//        model.addAttribute("msg", "welcome to thymeleaf");
//
//        // Returns the name of the view to be rendered, in this case, "index"
//        // Spring will resolve this to the appropriate view (e.g., index.html if using Thymeleaf)
//        return "index";
//    }
//
//    // Handles GET requests to the root URL ("/")
//    @GetMapping("/msg")
//    // Defines a private method to process the request and return the view name
//    private String DisplayMsg(Model model) {
//
//        // Adds an attribute to the model with the key "msg" and value "welcome to thymeleaf"
//        model.addAttribute("msg", "Thank u for using thymeleaf");
//
//        // Returns the name of the view to be rendered, in this case, "index"
//        // Spring will resolve this to the appropriate view (e.g., index.html if using Thymeleaf)
//        return "thanku";
//    }
//
//}
