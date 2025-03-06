package ktphoneloss.domain;

import java.util.Date;
import java.util.List;
import ktphoneloss.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "phoneManagements",
    path = "phoneManagements"
)
public interface PhoneManagementRepository
    extends PagingAndSortingRepository<PhoneManagement, Long> {}
