package kt.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import kt.ReportApplication;
import kt.domain.LostPhoneReported;
import lombok.Data;

@Entity
@Table(name = "ReportManagement_table")
@Data
//<<< DDD / Aggregate Root
public class ReportManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Date reportDate;

    private Long phoneId;

    @PostPersist
    public void onPostPersist() {
        LostPhoneReported lostPhoneReported = new LostPhoneReported(this);
        lostPhoneReported.publishAfterCommit();
    }

    public static ReportManagementRepository repository() {
        ReportManagementRepository reportManagementRepository = ReportApplication.applicationContext.getBean(
            ReportManagementRepository.class
        );
        return reportManagementRepository;
    }
}
//>>> DDD / Aggregate Root
