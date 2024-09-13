package in.deepak.Service;

import in.deepak.Interface.ProductInterface;
import in.deepak.entity.ProductEntity;
import in.deepak.product.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductInterface proInter;


  public  boolean Storedata(Product product){

        ProductEntity proE = new ProductEntity();

        BeanUtils.copyProperties(product, proE);

        proInter.save(proE);

        return true;


    }

}
