package ktphoneloss.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import ktphoneloss.config.kafka.KafkaProcessor;
import ktphoneloss.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PhoneStatusViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PhoneStatusViewRepository phoneStatusViewRepository;
    //>>> DDD / CQRS
}
