package ktphoneloss.domain;

import java.util.*;
import ktphoneloss.domain.*;
import ktphoneloss.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LostPhoneReported extends AbstractEvent {

    private Long id;
    private Long userId;
    private Date reportDate;
    private Long phoneId;
}
