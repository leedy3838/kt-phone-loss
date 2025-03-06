package ktphoneloss.domain;

import ktphoneloss.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "userManagements",
    path = "userManagements"
)
public interface UserManagementRepository
    extends PagingAndSortingRepository<UserManagement, Long> {}
