package ktphoneloss.infra;

import java.util.List;
import ktphoneloss.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "phoneStatusViews",
    path = "phoneStatusViews"
)
public interface PhoneStatusViewRepository
    extends PagingAndSortingRepository<PhoneStatusView, Long> {}
