package kt.domain;

import java.time.LocalDate;
import java.util.*;
import kt.domain.*;
import kt.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PhoneExpired extends AbstractEvent {

    private Long id;
    private String name;
    private String status;
    private Date creationDate;
    private Long userId;

    public PhoneExpired(PhoneManagement aggregate) {
        super(aggregate);
    }

    public PhoneExpired() {
        super();
    }
}
//>>> DDD / Domain Event
