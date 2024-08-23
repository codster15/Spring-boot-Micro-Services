package in.deepak.Spring_jpa_Repositiory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Integer id;
    private String  name;
    private Integer salary;
    private String  gender;
    private String  department;


}
