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

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PhoneExpired'"
    )
    public void wheneverPhoneExpired_PhoneExpireAlarm(
        @Payload PhoneExpired phoneExpired
    ) {
        PhoneExpired event = phoneExpired;
        System.out.println(
            "\n\n##### listener PhoneExpireAlarm : " + phoneExpired + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
