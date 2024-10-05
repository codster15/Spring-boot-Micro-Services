package in.deepak.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
@Table (name = "Product")
public class Prod_Entity {

    @Id
    @GeneratedValue
    Integer id;


    @NotBlank(message = "Name is Mandatory")
    @Size (min = 3 , max = 15 , message = "name must be Between 3 t0 15 characters")
    String name;

    @NotNull (message = "Price is Mandatory")
    @Positive (message = "Price should be positive number or greater then 0")
    Integer price;

    @NotNull (message = "Quantity is Mandatory")
    @Positive (message = "Price should be positive number or greater then 0")
    Integer quantity;
}
