package kt.infra;

import kt.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserManagement>> {

    @Override
    public EntityModel<UserManagement> process(
        EntityModel<UserManagement> model
    ) {
        return model;
    }
}
