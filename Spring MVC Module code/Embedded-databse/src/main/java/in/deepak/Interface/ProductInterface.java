package in.deepak.Interface;

import in.deepak.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInterface extends JpaRepository<ProductEntity , Integer> {


}
