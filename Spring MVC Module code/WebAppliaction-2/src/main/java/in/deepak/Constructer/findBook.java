package in.deepak.Constructer;

import in.deepak.Entity.book;
import in.deepak.repo.bookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;

@Controller
public class findBook {
    @Autowired
    private bookRepo repo;

    @GetMapping("/kitab")
    ModelAndView findById (@RequestParam("id") Integer id){
        ModelAndView mav = new ModelAndView();
        Optional<book> byId = repo.findById(id);
        if(byId.isPresent()){
            mav.addObject("kitab" , byId.get());
        }
        mav.setViewName("index");
        return mav;
    }
}
