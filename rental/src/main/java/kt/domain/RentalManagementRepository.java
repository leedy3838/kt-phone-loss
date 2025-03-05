package kt.domain;

import kt.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "rentalManagements",
    path = "rentalManagements"
)
public interface RentalManagementRepository
    extends PagingAndSortingRepository<RentalManagement, Long> {}
