package ktphoneloss.domain;

import java.time.LocalDate;
import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LossReported extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long phoneId;
    private Date requestDate;

    public LossReported(LossManagement aggregate) {
        super(aggregate);
    }

    public LossReported() {
        super();
    }
}
//>>> DDD / Domain Event
