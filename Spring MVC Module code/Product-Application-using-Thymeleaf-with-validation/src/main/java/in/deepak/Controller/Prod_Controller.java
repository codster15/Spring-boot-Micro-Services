package in.deepak.Controller;

import in.deepak.Entity.Prod_Entity;
import in.deepak.Prod_Interface.ProdInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class Prod_Controller {

    @Autowired
    ProdInterface pro;


            //---------------------------  to load the index page  -----------------------------
            @GetMapping("/")
            private String loadIndex(Model model) {
                Prod_Entity p = new Prod_Entity();
                model.addAttribute("product" , p);

                return "index";
            }


            //-------------------------------  To save the data into h2 database  --------------------------------------------------------------
            @PostMapping("/product")
            public String saveProduct (@Validated @ModelAttribute ("product") Prod_Entity prodEntity , BindingResult result, Model model  ){

                if(result.hasErrors()){
                    return "index";
                }

                Prod_Entity save = pro.save(prodEntity);

                if (save.getId() != null){
                    System.out.println("Product Saved");
                    model.addAttribute("msg" , "Product saved");

                }

                return "index";
            }


            //----------------------------------   To view the data into next view page  ----------------------------------------------------------------
            @GetMapping ("/viewProducts")
            public String getAllProducts(Model model){

                List<Prod_Entity> all = pro.findAll();


                model.addAttribute("ProductList" , all);


                return "productsData";
            }

            //-------------------------------------   To delete the product   -----------------------------------------------------------


            @GetMapping ("/delete")
            public String DeleteProduct (@RequestParam ("id") Integer id, Model model){

                pro.deleteById(id);
                model.addAttribute("msg" , "Product Got Deleted");
                model.addAttribute("ProductList" , pro.findAll());

                return "productsData";
            }

            //---------------------------------   To edit the records   -----------------------------------------

            @GetMapping ("/edit")
            public String EditRecords (@RequestParam ("id") Integer id, Model model){

                Optional<Prod_Entity> byId = pro.findById(id);

                        if(byId.isPresent()){
                            Prod_Entity prodEntity = byId.get();
                            model.addAttribute("product" , prodEntity);

                        }


                return "index";
            }
}
