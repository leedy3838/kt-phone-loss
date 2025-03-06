package ktphoneloss.domain;

import ktphoneloss.domain.LossReported;
import ktphoneloss.domain.ExpireRequested;
import ktphoneloss.domain.TemporalPhoneRequested;
import ktphoneloss.LossApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="LossManagement_table")
@Data

//<<< DDD / Aggregate Root
public class LossManagement  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long userId;
    
    
    
    
    private Long phoneId;
    
    
    
    
    private Date requestDate;

    @PostPersist
    public void onPostPersist(){
    PhoneManagement phoneManagement = LossManagementApplication.applicationContext
        .getBean(ktphoneloss.external.PhoneManagementService.class)
        .phoneStatusView(get??);


        LossReported lossReported = new LossReported(this);
        lossReported.publishAfterCommit();



        ExpireRequested expireRequested = new ExpireRequested(this);
        expireRequested.publishAfterCommit();



        TemporalPhoneRequested temporalPhoneRequested = new TemporalPhoneRequested(this);
        temporalPhoneRequested.publishAfterCommit();

    
    }

    public static LossManagementRepository repository(){
        LossManagementRepository lossManagementRepository = LossApplication.applicationContext.getBean(LossManagementRepository.class);
        return lossManagementRepository;
    }






}
//>>> DDD / Aggregate Root
