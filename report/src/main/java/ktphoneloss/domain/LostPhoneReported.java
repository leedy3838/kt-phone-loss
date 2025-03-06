package ktphoneloss.domain;

import java.time.LocalDate;
import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LostPhoneReported extends AbstractEvent {

    private Long id;
    private Long userId;
    private Date reportDate;
    private Long phoneId;

    public LostPhoneReported(ReportManagement aggregate) {
        super(aggregate);
    }

    public LostPhoneReported() {
        super();
    }
}
//>>> DDD / Domain Event
