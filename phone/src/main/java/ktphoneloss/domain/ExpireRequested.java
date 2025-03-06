package ktphoneloss.domain;

import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ExpireRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date requestDate;
}
