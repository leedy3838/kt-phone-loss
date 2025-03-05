package kt.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import kt.RentalApplication;
import lombok.Data;

@Entity
@Table(name = "RentalManagement_table")
@Data
//<<< DDD / Aggregate Root
public class RentalManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String name;

    private String phoneCode;

    public static RentalManagementRepository repository() {
        RentalManagementRepository rentalManagementRepository = RentalApplication.applicationContext.getBean(
            RentalManagementRepository.class
        );
        return rentalManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void temporalPhoneIssue(
        TemporalPhoneRequested temporalPhoneRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RentalManagement rentalManagement = new RentalManagement();
        repository().save(rentalManagement);

        */

        /** Example 2:  finding and process
        

        repository().findById(temporalPhoneRequested.get???()).ifPresent(rentalManagement->{
            
            rentalManagement // do something
            repository().save(rentalManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
