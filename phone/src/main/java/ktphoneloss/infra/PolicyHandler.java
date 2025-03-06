package ktphoneloss.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktphoneloss.config.kafka.KafkaProcessor;
import ktphoneloss.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PhoneManagementRepository phoneManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LossReported'"
    )
    public void wheneverLossReported_ModifyPhoneStatus(
        @Payload LossReported lossReported
    ) {
        LossReported event = lossReported;
        System.out.println(
            "\n\n##### listener ModifyPhoneStatus : " + lossReported + "\n\n"
        );

        // Sample Logic //
        PhoneManagement.modifyPhoneStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ExpireRequested'"
    )
    public void wheneverExpireRequested_ModifyPhoneStatus(
        @Payload ExpireRequested expireRequested
    ) {
        ExpireRequested event = expireRequested;
        System.out.println(
            "\n\n##### listener ModifyPhoneStatus : " + expireRequested + "\n\n"
        );

        // Sample Logic //
        PhoneManagement.modifyPhoneStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PhoneRegistered'"
    )
    public void wheneverPhoneRegistered_ModifyPhoneStatus(
        @Payload PhoneRegistered phoneRegistered
    ) {
        PhoneRegistered event = phoneRegistered;
        System.out.println(
            "\n\n##### listener ModifyPhoneStatus : " + phoneRegistered + "\n\n"
        );

        // Sample Logic //
        PhoneManagement.modifyPhoneStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostPhoneReported'"
    )
    public void wheneverLostPhoneReported_DetectPhoneHost(
        @Payload LostPhoneReported lostPhoneReported
    ) {
        LostPhoneReported event = lostPhoneReported;
        System.out.println(
            "\n\n##### listener DetectPhoneHost : " + lostPhoneReported + "\n\n"
        );

        // Sample Logic //
        PhoneManagement.detectPhoneHost(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
