package kt.domain;

import java.time.LocalDate;
import java.util.*;
import kt.domain.*;
import kt.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SignedUp extends AbstractEvent {

    private Long id;
    private String name;
    private String role;
    private Date joinDate;
    private String email;
    private String password;

    public SignedUp(UserManagement aggregate) {
        super(aggregate);
    }

    public SignedUp() {
        super();
    }
}
//>>> DDD / Domain Event
