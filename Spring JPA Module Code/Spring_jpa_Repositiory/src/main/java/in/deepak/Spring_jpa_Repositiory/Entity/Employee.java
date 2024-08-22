package in.deepak.Spring_jpa_Repositiory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Employee {

    @Id
    private Integer Id;
    private String  Name;
    private Integer Salary;
    private String  gender;
    private String  Department;


}
