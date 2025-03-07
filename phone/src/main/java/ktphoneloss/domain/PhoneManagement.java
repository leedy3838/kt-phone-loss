package ktphoneloss.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphoneloss.PhoneApplication;
import ktphoneloss.domain.PhoneExpired;
import lombok.Data;

@Entity
@Table(name = "PhoneManagement_table")
@Data
//<<< DDD / Aggregate Root
public class PhoneManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String status;

    private Date creationDate;

    private Long userId;

    public static PhoneManagementRepository repository() {
        PhoneManagementRepository phoneManagementRepository = PhoneApplication.applicationContext.getBean(
            PhoneManagementRepository.class
        );
        return phoneManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void modifyPhoneStatus(LossReported lossReported) {
        //implement business logic here:

        /** Example 1:  new item 
        PhoneManagement phoneManagement = new PhoneManagement();
        repository().save(phoneManagement);

        PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
        phoneExpired.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lossReported.get???()).ifPresent(phoneManagement->{
            
            phoneManagement // do something
            repository().save(phoneManagement);

            PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
            phoneExpired.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void modifyPhoneStatus(ExpireRequested expireRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        PhoneManagement phoneManagement = new PhoneManagement();
        repository().save(phoneManagement);

        PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
        phoneExpired.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(expireRequested.get???()).ifPresent(phoneManagement->{
            
            phoneManagement // do something
            repository().save(phoneManagement);

            PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
            phoneExpired.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void modifyPhoneStatus(PhoneRegistered phoneRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        PhoneManagement phoneManagement = new PhoneManagement();
        repository().save(phoneManagement);

        PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
        phoneExpired.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(phoneRegistered.get???()).ifPresent(phoneManagement->{
            
            phoneManagement // do something
            repository().save(phoneManagement);

            PhoneExpired phoneExpired = new PhoneExpired(phoneManagement);
            phoneExpired.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void detectPhoneHost(LostPhoneReported lostPhoneReported) {
        //implement business logic here:

        /** Example 1:  new item 
        PhoneManagement phoneManagement = new PhoneManagement();
        repository().save(phoneManagement);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostPhoneReported.get???()).ifPresent(phoneManagement->{
            
            phoneManagement // do something
            repository().save(phoneManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
