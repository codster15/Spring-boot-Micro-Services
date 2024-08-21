package in.deepak.SpringBoot_jpa_crudRepository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Data
@Entity
@Table(name = "Books_Collection")
public class book_Entity {

    @Id
    private Integer bookID;
    private String bookName;
    private Integer bookPrice;
    private String bookAvailabilityStatus;

}
