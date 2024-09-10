package in.deepak.Controller;

import in.deepak.Repo.StudentRepository;
import in.deepak.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class testClass {
    @Autowired
    private StudentRepository repo;

                @GetMapping("/")
                String indexPage(Model model){
                    Student s = new Student();
                    List<String> list = Arrays.asList("Java", "Devops", "Machine Learning", "Data Scientist");
                    model.addAttribute("Developers",s);
                    model.addAttribute("courselist" , list);
                    return "index";
                }




                @PostMapping("/submit")
                String DataStorePage(Model m, Student student){

                    System.out.println(student);
                    repo.save(student);

                    Student s= new Student();
                    List<String> list = Arrays.asList("Java", "Devops", "Machine Learning", "Data Scientist");
                    m.addAttribute("Developers",s);
                    m.addAttribute("courselist" , list);
                    m.addAttribute("key","Form Submitted");


                    return "index";
                }

}
