package com.deepak.controller;

import com.deepak.ProductRepository.productRepo;
import com.deepak.productEntity.productEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private productRepo repo ;

    //-------------------------------------

    @GetMapping("/edit")
    public String editProduct (@RequestParam("id") Integer id , Model model){
        Optional<productEntity> byId = repo.findById(id);
        productEntity productEntity = byId.get();
        model.addAttribute("product" ,productEntity);
        System.out.println(  " -------------------> "+id);
        return "index";

    }

    //===========================================
    @GetMapping("/delete")
    public String deleteProduct (@RequestParam("id") Integer id , Model model){
        repo.deleteById(id);
        List<productEntity> all = repo.findAll();
        model.addAttribute("products" , all);
        return "productData";

    }

    //===========================================================================

    @GetMapping("/")
    public String loadIndex(Model model){
        model.addAttribute("product" , new productEntity());

        return "index";
    }

    //=========================================================================================================
    @PostMapping("/save")
    public String saveProduct( @Valid @ModelAttribute("product") productEntity product,BindingResult result,Model model){
        if(result.hasErrors()){
            return "index";
        }
        productEntity save = repo.save(product);



        if (save.getId() != null ){
            model.addAttribute("msg" , "Product got saved");
        }else{
            model.addAttribute("msg" , "Product failed to save");
        }
        model.addAttribute("product" , new productEntity());
        return "index";
    }

    //=========================================================================================================

    @GetMapping("/viewProducts")
    public String viewProduct (Model model){
        List<productEntity> all = repo.findAll();

        model.addAttribute("products" , all);
        return "productData";
    }
    //=========================================================================================================

}
