package in.deepak.Controller;

import in.deepak.Service.ProductService;
import in.deepak.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService ps;


    @GetMapping("/")
     String loadIndex(Model modal){

        Product p = new Product();

        modal.addAttribute("loadProduct" , p);

        return "index";
    }

    //----------------------------------------------------------------------------------------

    @PostMapping("/submit")
    String saveData(Model modal, Product product){




        modal.addAttribute("loadProduct" , product);

        boolean storedata = ps.Storedata(product);

        if(storedata){
            modal.addAttribute("msg" , "Data Inserted");
        }else{
            modal.addAttribute("msg" , "Data not Inserted");
        }


        return "index";
    }



}
