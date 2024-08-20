package in.Deepak.Spring_Jpa.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    private Integer BookId;

    private String Book_Name;

    private Double Book_Price;
}
