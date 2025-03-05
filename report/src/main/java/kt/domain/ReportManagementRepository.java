package kt.domain;

import kt.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "reportManagements",
    path = "reportManagements"
)
public interface ReportManagementRepository
    extends PagingAndSortingRepository<ReportManagement, Long> {}
