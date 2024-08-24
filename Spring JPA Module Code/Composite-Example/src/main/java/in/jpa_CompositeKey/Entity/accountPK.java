package in.jpa_CompositeKey.Entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class accountPK implements Serializable {

    private Long accountNum;
    private String acctType;


}
