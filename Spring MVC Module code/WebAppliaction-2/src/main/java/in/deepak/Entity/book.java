package in.deepak.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Data
@Table(name = "Kitab")
public class book {

    @Id
    private Integer bookId;
    private String bookName;
    private Integer bookPrice;

}
