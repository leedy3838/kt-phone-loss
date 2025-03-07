package ktphoneloss.domain;

import ktphoneloss.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "phoneManagements",
    path = "phoneManagements"
)
public interface PhoneManagementRepository
    extends PagingAndSortingRepository<PhoneManagement, Long> {}
