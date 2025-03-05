package kt.infra;

import kt.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LossManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LossManagement>> {

    @Override
    public EntityModel<LossManagement> process(
        EntityModel<LossManagement> model
    ) {
        return model;
    }
}
