package ktphoneloss.domain;

import java.time.LocalDate;
import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TemporalPhoneRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date requestDate;

    public TemporalPhoneRequested(LossManagement aggregate) {
        super(aggregate);
    }

    public TemporalPhoneRequested() {
        super();
    }
}
//>>> DDD / Domain Event
