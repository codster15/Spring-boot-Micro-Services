package in.jpa_profiles.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Devlopers {

    @Id
    private Integer devId;
    private String name;
    private String domain;
    private String country;

}
