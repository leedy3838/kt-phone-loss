package kt.domain;

import java.util.*;
import kt.domain.*;
import kt.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LostPhoneReported extends AbstractEvent {

    private Long id;
    private Long userId;
    private Date reportDate;
    private Long phoneId;
}
