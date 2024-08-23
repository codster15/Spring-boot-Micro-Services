package in.deepak.Spring_jpa_Repositiory_Assignnment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class electronics {

    @Id
    private Integer id;
    private String name;
    private Integer price;


}
