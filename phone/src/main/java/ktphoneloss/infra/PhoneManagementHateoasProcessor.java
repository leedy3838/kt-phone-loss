package ktphoneloss.infra;

import ktphoneloss.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PhoneManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PhoneManagement>> {

    @Override
    public EntityModel<PhoneManagement> process(
        EntityModel<PhoneManagement> model
    ) {
        return model;
    }
}
