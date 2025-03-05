package kt.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import kt.UserApplication;
import kt.domain.PhoneRegistered;
import kt.domain.SignedUp;
import lombok.Data;

@Entity
@Table(name = "UserManagement_table")
@Data
//<<< DDD / Aggregate Root
public class UserManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String role;

    private Date joinDate;

    private String email;

    private String password;

    @PostPersist
    public void onPostPersist() {
        PhoneRegistered phoneRegistered = new PhoneRegistered(this);
        phoneRegistered.publishAfterCommit();

        SignedUp signedUp = new SignedUp(this);
        signedUp.publishAfterCommit();
    }

    public static UserManagementRepository repository() {
        UserManagementRepository userManagementRepository = UserApplication.applicationContext.getBean(
            UserManagementRepository.class
        );
        return userManagementRepository;
    }
}
//>>> DDD / Aggregate Root
