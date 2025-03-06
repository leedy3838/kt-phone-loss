package ktphoneloss.domain;

import java.time.LocalDate;
import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExpireRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date requestDate;

    public ExpireRequested(LossManagement aggregate) {
        super(aggregate);
    }

    public ExpireRequested() {
        super();
    }
}
//>>> DDD / Domain Event
