package ktphoneloss.infra;

import ktphoneloss.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RentalManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RentalManagement>> {

    @Override
    public EntityModel<RentalManagement> process(
        EntityModel<RentalManagement> model
    ) {
        return model;
    }
}
