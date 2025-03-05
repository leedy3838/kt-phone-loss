package kt.domain;

import java.util.*;
import kt.domain.*;
import kt.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ExpireRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date requestDate;
}
