package in.deepak.Controller;


import in.deepak.StudentClass.Student;

import in.deepak.ServiceClass.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller // Indicates that this class is a Spring MVC controller. It handles web requests and returns views.
//public class StudentController { // Defines the StudentController class.
//
//    @GetMapping("/") // Maps HTTP GET requests for the root URL ("/") to this method.
//    String indexPageLoad(Model model) { // This method handles GET requests to the root URL. It takes a Model object as a parameter and returns a view name as a String.
//
//        Student sobj = new Student(); // Creates a new instance of the Student class.
//
//        model.addAttribute("student", sobj); // Adds the Student object to the model with the name "student". This makes it available to the view.
//
//        return "index"; // Returns the view name "index". The view resolver will use this to locate and render the appropriate view (e.g., an HTML file).
//    }
//
//}


@Controller
public class StudentController {

@Autowired
    private StudentService service;




    @GetMapping("/greet")
    String indexPageLoad(Model model){
      model.addAttribute("key", "I am Working in project 3");
        return "index";
    }








}
