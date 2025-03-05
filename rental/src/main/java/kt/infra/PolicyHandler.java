package kt.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import kt.config.kafka.KafkaProcessor;
import kt.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    RentalManagementRepository rentalManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TemporalPhoneRequested'"
    )
    public void wheneverTemporalPhoneRequested_TemporalPhoneIssue(
        @Payload TemporalPhoneRequested temporalPhoneRequested
    ) {
        TemporalPhoneRequested event = temporalPhoneRequested;
        System.out.println(
            "\n\n##### listener TemporalPhoneIssue : " +
            temporalPhoneRequested +
            "\n\n"
        );

        // Sample Logic //
        RentalManagement.temporalPhoneIssue(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
