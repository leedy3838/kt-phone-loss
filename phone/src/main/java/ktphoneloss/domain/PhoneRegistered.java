package ktphoneloss.domain;

import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
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
