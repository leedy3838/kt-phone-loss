package kt.domain;

import java.util.*;
import kt.domain.*;
import kt.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class PhoneRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private String role;
    private Date joinDate;
    private String email;
    private String password;
}
