package in.deepak.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table (name = "Product")
public class Prod_Entity {

    @Id
    @GeneratedValue
    Integer id;
    String name;
    Integer price;
    Integer quantity;
}
