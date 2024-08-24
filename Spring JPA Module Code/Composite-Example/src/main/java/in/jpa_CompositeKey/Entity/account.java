package in.jpa_CompositeKey.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "account_tbl")
public class account {

    private String holderName;
    private String branch;

    @EmbeddedId
    private accountPK  acc;
}
