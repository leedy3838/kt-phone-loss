package ktphoneloss.domain;

import ktphoneloss.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lossManagements",
    path = "lossManagements"
)
public interface LossManagementRepository
    extends PagingAndSortingRepository<LossManagement, Long> {}
