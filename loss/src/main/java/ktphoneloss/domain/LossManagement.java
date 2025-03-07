package ktphoneloss.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphoneloss.LossApplication;
import ktphoneloss.domain.ExpireRequested;
import ktphoneloss.domain.LossReported;
import ktphoneloss.domain.TemporalPhoneRequested;
import lombok.Data;

@Entity
@Table(name = "LossManagement_table")
@Data
//<<< DDD / Aggregate Root
public class LossManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long phoneId;

    private Date requestDate;

    @PostPersist
    public void onPostPersist() {
        LossReported lossReported = new LossReported(this);
        lossReported.publishAfterCommit();

        ExpireRequested expireRequested = new ExpireRequested(this);
        expireRequested.publishAfterCommit();

        TemporalPhoneRequested temporalPhoneRequested = new TemporalPhoneRequested(
            this
        );
        temporalPhoneRequested.publishAfterCommit();
    }

    public static LossManagementRepository repository() {
        LossManagementRepository lossManagementRepository = LossApplication.applicationContext.getBean(
            LossManagementRepository.class
        );
        return lossManagementRepository;
    }
}
//>>> DDD / Aggregate Root
