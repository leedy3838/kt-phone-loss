package ktphoneloss.external;

import java.util.Date;
import lombok.Data;

@Data
public class PhoneManagement {

    private Long id;
    private String name;
    private String status;
    private Date creationDate;
    private Long userId;
}
