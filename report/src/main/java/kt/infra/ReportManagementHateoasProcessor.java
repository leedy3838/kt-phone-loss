package kt.infra;

import kt.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReportManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ReportManagement>> {

    @Override
    public EntityModel<ReportManagement> process(
        EntityModel<ReportManagement> model
    ) {
        return model;
    }
}
