package ktphoneloss.domain;

import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class PhoneExpired extends AbstractEvent {

    private Long id;
    private String name;
    private String status;
    private Date creationDate;
    private Long userId;
}
