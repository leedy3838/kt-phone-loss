package ktphoneloss.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "phone", url = "${api.url.phone}")
public interface PhoneStatusViewService {
    @GetMapping(path = "/phoneStatusViews")
    public List<PhoneStatusView> getPhoneStatusView();

    @GetMapping(path = "/phoneStatusViews/{id}")
    public PhoneStatusView getPhoneStatusView(@PathVariable("id") Long id);
}
