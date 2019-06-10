package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestApi {

//    private static final String SERVICE_LOCATION_UPDATER = "fleet-location-updater";

//	@Autowired
//	private DiscoveryClient discoveryClient;

    @Value("${stomp.url}")
    private String stompUrl;

    @RequestMapping("/clientConfig")
    @ResponseBody
    public String config() throws Exception {
        return stompUrl;
    }

}
