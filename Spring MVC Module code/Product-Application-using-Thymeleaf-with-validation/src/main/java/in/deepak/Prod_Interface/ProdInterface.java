package in.deepak.Prod_Interface;


import in.deepak.Entity.Prod_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdInterface extends JpaRepository < Prod_Entity , Integer> {

}
