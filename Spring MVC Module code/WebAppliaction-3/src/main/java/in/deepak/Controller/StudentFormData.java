package in.deepak.Controller;


import in.deepak.Entity.StudentEnquiry;
import in.deepak.Entity.course;
import in.deepak.RepoInterface.CourseRepo;
import in.deepak.RepoInterface.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentFormData {

    @Autowired
    private Repo repo;

    @Autowired
    private CourseRepo Crepo;

                            @GetMapping("/test")
                            ModelAndView studentEnquiry(@RequestParam("name") String name , @RequestParam ("email") String email, @RequestParam ("gender") String gender ){

                                ModelAndView mav = new ModelAndView();


                                                StudentEnquiry student = new StudentEnquiry();
                                                student.setName(name);
                                                student.setEmail(email);
                                                student.setGender(gender);

                                mav.addObject("msg" , "Thank u form Submitted. We'll Call you soon");
                                 mav.setViewName("index");
                                              return mav;
                            }




    @GetMapping("/msg")
    ModelAndView LoadCourse(){


        ModelAndView mav = new ModelAndView();


        List<course> all = Crepo.findAll();
//        long count = all.stream().count();
//        int countInt = (int) count;
//
//
//        String arr[] = new String[countInt];
//        int cunt = 0;
//
//
//
//        for (course e1 : all) {
//           arr[cunt] = e1.getCourseName();
//           cunt++;
//        }

        mav.addObject("msg", all );
        mav.setViewName("index");
        return mav;


    }

}





